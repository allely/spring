package configs;

import commons.Utils;
import controllers.members.JoinValidator;
import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.*;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

import java.lang.reflect.Member;

@Configuration
@EnableWebMvc   // 프록시 자동화 설정   ?
@Import(DbConfig2.class) //
public class MvcConfig implements WebMvcConfigurer {    // web.xml에서 설정한 init-param의 value

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private JoinValidator joinValidator;

    @Override
    public Validator getValidator() {   // 전역 validator
        return joinValidator;
    }

    // 타임리프 사용하려고 설정(Bean 3개)
    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setCacheable(false);
        // true -> 최초 로딩시 번역, 다음 요청시에는 기존 파일을 그대로 사용(사용중인 페이지일 때)
        // false -> 매번 요청 시마다 다시 번역(개발 중일 때)
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        templateEngine.setEnableSpringELCompiler(true);     // El식을 타임리프 안에서 사용할 수 있게 설정.
        templateEngine.addDialect(new Java8TimeDialect());  // DateTime API(java.time 패키지) - #temporals
        templateEngine.addDialect(new LayoutDialect());     // 레이아웃 기능 추가
        return templateEngine;
    }

    @Bean
    public ThymeleafViewResolver thymeleafViewResolver() {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setContentType("text/html");
        resolver.setCharacterEncoding("utf-8");
        resolver.setTemplateEngine(templateEngine());
        return resolver;
    }

    @Bean
    public MemberOnlyInterceptor memberOnlyInterceptor() {
        return new MemberOnlyInterceptor();
    }

    @Bean
    public CommonInterceptor commonInterceptor() {
        return new CommonInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(memberOnlyInterceptor())
                .addPathPatterns("/mypage/**"); // mypage를 인터셉터의 영역 안으로 설정.

        registry.addInterceptor(commonInterceptor())
                .addPathPatterns("/**");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
       configurer.enable();
        // 모든 요청 -> 컨트롤러 빈을 찾는 게 기본.
        // 없는 경우 -> 정적 자원 경로(css, js, 이미지) 탐색
        //              정적 자원은 보통 resource에 둔다. -> 아래 addResourceHandlers
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")      // 기본 경로의 하위 경로를 포함한 모두를 검색
                .addResourceLocations("classpath:/static/");    // resource폴더의 static

        registry.addResourceHandler("/upload/**")
                .addResourceLocations("file:///c:/uploads/");
                                // 슬래시(/) 하나를 escape문자로 인식하여 file://로 읽는다.
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/")
                .setViewName("main/index");

        registry.addViewController("/mypage/**")    // mypage 폴더의
                .setViewName("mypage/index");               // index파일을 설정
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // 템플릿에서 쓰게 될 경로( /WEB-INF/templates/ 안의 .jsp파일 중에서)
        registry.viewResolver(thymeleafViewResolver());
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
        ms.setDefaultEncoding("UTF-8");
        ms.setBasenames("messages.commons", "messages.validations");

        return ms;
    }

    @Bean
    public Utils utils() {
        return new Utils();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer configurer() {   // properties 설정을 사용하는 메서드
        PropertySourcesPlaceholderConfigurer conf = new PropertySourcesPlaceholderConfigurer();
        conf.setLocations(new ClassPathResource("application.properties"));
        return conf;
    }
}