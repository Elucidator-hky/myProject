/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-07-06 14:03:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>后台登录</title>\n");
      out.write("    <meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi\" />\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <link rel=\"icon\" href=\"/images/favicon.ico\" sizes=\"32x32\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/font.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/xadmin.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"./js/jquery-1.3.2.min.js\"></script>\n");
      out.write("    <script src=\"lib/layui/layui.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/xadmin.js\"></script>\n");
      out.write("    <script src=\"/layui_exts/excel.js\"></script>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        .o_div{\n");
      out.write("            background: url(\"/images/01.jpg\") no-repeat;\n");
      out.write("        }\n");
      out.write("        .o_span{\n");
      out.write("            display: block;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 20px;\n");
      out.write("            letter-spacing:8px\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- 顶部开始 -->\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"logo\"><a href=\"\">宿舍管理系统</a></div>\n");
      out.write("    <div class=\"left_open\">\n");
      out.write("        <i title=\"展开左侧栏\" class=\"iconfont\">&#xe699;</i>\n");
      out.write("    </div>\n");
      out.write("    ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <ul class=\"layui-nav right\" lay-filter=\"\">\n");
      out.write("        <li class=\"layui-nav-item\">\n");
      out.write("            <a href=\"javascript:;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.ad.a_username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\n");
      out.write("            <dl class=\"layui-nav-child\"> <!-- 二级菜单 -->\n");
      out.write("                <dd><a onclick=\"x_admin_show('切换帐号','loginOut')\">切换帐号</a></dd>\n");
      out.write("                <dd><a href=\"/loginOut\">退出</a></dd>\n");
      out.write("            </dl>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"layui-nav-item to-index\"><a href=\"/loginOut\">前台首页</a></li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- 顶部结束 -->\n");
      out.write("<!-- 中部开始 -->\n");
      out.write("<!-- 左侧菜单开始 -->\n");
      out.write("<div class=\"left-nav\">\n");
      out.write("    <div id=\"side-nav\">\n");
      out.write("        <ul id=\"nav\">\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#xe6b8;</i>\n");
      out.write("                    <cite>学生管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"/findStudent\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>学生信息</cite>\n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#xe723;</i>\n");
      out.write("                    <cite>班级管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"/findClass\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>班级列表</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#59095;</i>\n");
      out.write("                    <cite>宿舍管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"/findDormitory\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>宿舍列表</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"/findDormRepair\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>维修登记</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#59042;</i>\n");
      out.write("                    <cite>卫生管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"/findDormClean\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>宿舍卫生</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"/findStudentClean\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>学生卫生</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"layui-icon\">&#xe613;</i>\n");
      out.write("                    <cite>访客管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"/findVisitor\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>访客列表</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\">\n");
      out.write("                    <i class=\"iconfont\">&#xe726;</i>\n");
      out.write("                    <cite>管理员管理</cite>\n");
      out.write("                    <i class=\"iconfont nav_right\">&#xe697;</i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"sub-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a _href=\"/findAdmin\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <i class=\"iconfont\">&#xe6a7;</i>\n");
      out.write("                            <cite>管理员列表</cite>\n");
      out.write("                        </a>\n");
      out.write("                    </li >\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- <div class=\"x-slide_left\"></div> -->\n");
      out.write("<!-- 左侧菜单结束 -->\n");
      out.write("<!-- 右侧主体开始 -->\n");
      out.write("<div class=\"page-content\">\n");
      out.write("    <div class=\"layui-tab tab\" lay-filter=\"xbs_tab\" lay-allowclose=\"false\">\n");
      out.write("        <ul class=\"layui-tab-title\">\n");
      out.write("            <li class=\"home\"><i class=\"layui-icon\">&#xe68e;</i>我的桌面</li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"layui-tab-content\" >\n");
      out.write("            <div class=\"layui-tab-item layui-show o_div\" >\n");
      out.write("                <span class=\"o_span\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.ad.a_username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("管理员，欢迎来到宿舍管理系统！</span>\n");
      out.write("                <div class=\"layui-col-md6\" style=\"padding: 30px;left: 60px;background-color: #F2F2F2;\">\n");
      out.write("                <div class=\"layui-card\">\n");
      out.write("                <div class=\"layui-card-header\">个人信息\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"layui-card-body\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                           用户名：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.ad.a_username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"layui-card-body\">\n");
      out.write("                            姓名：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.ad.a_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"layui-card-body\">\n");
      out.write("                            电话：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.ad.a_phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"layui-card-body\">\n");
      out.write("                            级别描述：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.ad.a_describe}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"page-content-bg\"></div>\n");
      out.write("<!-- 右侧主体结束 -->\n");
      out.write("<!-- 中部结束 -->\n");
      out.write("<!-- 底部开始 -->\n");
      out.write("<div class=\"footer\">\n");
      out.write("    <div class=\"copyright\">寝室管理系统</div>\n");
      out.write("</div>\n");
      out.write("<!-- 底部结束 -->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    layui.config({\n");
      out.write("        base: 'layui_exts/',\n");
      out.write("    }).extend({\n");
      out.write("        excel: 'excel',\n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}