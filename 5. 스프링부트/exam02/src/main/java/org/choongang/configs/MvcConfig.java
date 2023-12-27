package org.choongang.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  // 설정 클래스
@EnableJpaAuditing  // jpa? 활성화
public class MvcConfig implements WebMvcConfigurer {
}
