/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.81
 * Generated at: 2023-11-16 08:07:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.login.dto.BoardDto;
import java.util.List;
import com.login.dto.PageDto;
import com.login.dto.Criteria;

public final class board_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/PageNavi.jsp", Long.valueOf(1700121963012L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.login.dto.BoardDto");
    _jspx_imports_classes.add("com.login.dto.Criteria");
    _jspx_imports_classes.add("com.login.dto.PageDto");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	window.onload = function(){\r\n");
      out.write("		\r\n");
      out.write("		// 로그아웃버튼 처리\r\n");
      out.write("		let logoutBtn = document.querySelector(\"#logoutBtn\");\r\n");
      out.write("		if(logoutBtn != null){\r\n");
      out.write("			logoutBtn.onclick = function(){\r\n");
      out.write("				// 로그아웃 처리 -> 로그인 페이지로 이동\r\n");
      out.write("				location.href=\"/logoutAction\";\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		// 로그인버튼 처리\r\n");
      out.write("		let loginBtn = document.querySelector(\"#loginBtn\");\r\n");
      out.write("		if(loginBtn != null){\r\n");
      out.write("			loginBtn.addEventListener('click', function(){\r\n");
      out.write("				// 로그인 페이지로 이동\r\n");
      out.write("				location.href=\"/login.jsp\";\r\n");
      out.write("		});\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("	");

	if((session.getAttribute("id") != null)
		&& !"".equals(session.getAttribute("id".toString()))){
		// 로그인 사용자
		out.print(session.getAttribute("id".toString()) + "님 환영합니다.");
		out.print("<button id='logoutBtn' class='btn btn-primary'>로그아웃</button>");
	} else {
		// 로그인 전
		out.print("<button id='loginBtn' class='btn btn-primary'>로그인</button>");
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<h2>게시글 목록 조회</h2>\r\n");
      out.write("	\r\n");
      out.write("	<table class=\"table justify-content-center\">\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">번호</th>\r\n");
      out.write("      <th scope=\"col\">제목</th>\r\n");
      out.write("      <th scope=\"col\">작성자</th>\r\n");
      out.write("      <th scope=\"col\">작성일</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("  <tbody>\r\n");
      out.write(" ");

	if(request.getAttribute("list") == null){
		out.print("<td colspan='4'>게시물이 존재하지 않습니다.</td>");
	} else{
		List<BoardDto> list = (List<BoardDto>)request.getAttribute("list");
		for(BoardDto dto : list){
	
      out.write("\r\n");
      out.write("    	<tr>	\r\n");
      out.write("			<td>");
      out.print(dto.getNum() );
      out.write("</td>\r\n");
      out.write("			<td><a href=\"/view?num=");
      out.print(dto.getNum() );
      out.write('"');
      out.write('>');
      out.print(dto.getTitle() );
      out.write("</a></td>\r\n");
      out.write("			<td>");
      out.print(dto.getId() );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(dto.getPostdate() );
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	");
	
		}
	}
	
      out.write("\r\n");
      out.write("  </tbody>\r\n");
      out.write("  \r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\" crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 페이지네이션 -->\r\n");
      out.write("<!-- class를 추가하여 화면을 구성\r\n");
      out.write("	active : 현재 페이지를 활성화()\r\n");
      out.write("	disabled : 버튼의 비활성화 -->\r\n");
      out.write("	\r\n");
      out.write("\r\n");

	PageDto pageDto = null;
	// 페이지네비게이션을 생성하기 위해 필요한 데이터
	if(request.getAttribute("pageDto") != null && !"".equals(request.getAttribute("pageDto"))){
		pageDto = (PageDto)request.getAttribute("pageDto");
		
		out.print("pageDto.getCri().getStartNo() : "+  pageDto.getCri().getStartNo());//2
	} else {
		pageDto = new PageDto(0, new Criteria());
	}
	


      out.write("\r\n");
      out.write("<nav aria-label=\"...\">\r\n");
      out.write("  <ul class=\"pagination\">\r\n");
      out.write("  	\r\n");
      out.write("  	<!-- 이전 페이지 블럭으로 이동 -->\r\n");
      out.write("    <li class=\"page-item ");
      out.print(pageDto.isPrev()?"":"disabled" );
      out.write("\">\r\n");
      out.write("      <a class=\"page-link\" href=\"/list?pageNo=");
      out.print(pageDto.getStartNo()-1);
      out.write("\">Previous</a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <!-- 이전 페이지 블럭으로 이동 끝 -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- 페이지 버튼 시작 -->\r\n");
      out.write("    \r\n");
      out.write("    ");

    
   
    for(int i = pageDto.getCri().getStartNo(); i < pageDto.getCri().getEndNo(); i++){ 
      out.write("\r\n");
      out.write("    <li class=\"page-item\">\r\n");
      out.write("    	<a class=\"page-link ");
      out.print(pageDto.getCri().getPageNo() == i ? "active " : "" );
      out.write("\" href=\"/list?pageNo=");
      out.print(i);
      out.write("\">\r\n");
      out.write("    	");
      out.print(i );
      out.write("\r\n");
      out.write("    	</a>\r\n");
      out.write("    </li>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- 다음 페이지 블럭으로 이동 시작 -->\r\n");
      out.write("    <li class=\"page-item ");
      out.print(pageDto.isNext()?"":"disabled");
      out.write("\">\r\n");
      out.write("      <a class=\"page-link\" href=\"/list?pageNo=");
      out.print(pageDto.getEndNo()+1);
      out.write("\">Next</a>\r\n");
      out.write("    </li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- 페이지네이션 끝 -->\r\n");
      out.write(" <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
