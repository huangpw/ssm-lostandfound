/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-08-14 03:10:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>校园失物招领系统</title>\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("    <meta name=\"viewport\"\n");
      out.write("          content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/layuiadmin/layui/css/layui.css\" media=\"all\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/layuiadmin/style/admin.css\" media=\"all\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"layui-layout-body\">\n");
      out.write("\n");
      out.write("<div id=\"LAY_app\">\n");
      out.write("    <div class=\"layui-layout layui-layout-admin\">\n");
      out.write("        <div class=\"layui-header\">\n");
      out.write("            <!-- 头部区域 -->\n");
      out.write("            <ul class=\"layui-nav layui-layout-left\">\n");
      out.write("                <li class=\"layui-nav-item layadmin-flexible\" lay-unselect>\n");
      out.write("                    <a href=\"javascript:;\" layadmin-event=\"flexible\" title=\"侧边伸缩\">\n");
      out.write("                        <i class=\"layui-icon layui-icon-shrink-right\" id=\"LAY_app_flexible\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"layui-nav-item layui-hide-xs\" lay-unselect>\n");
      out.write("                    <a href=\"http://www.layui.com/admin/\" target=\"_blank\" title=\"前台\">\n");
      out.write("                        <i class=\"layui-icon layui-icon-website\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"layui-nav-item\" lay-unselect>\n");
      out.write("                    <a href=\"javascript:;\" layadmin-event=\"refresh\" title=\"刷新\">\n");
      out.write("                        <i class=\"layui-icon layui-icon-refresh-3\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"layui-nav layui-layout-right\" lay-filter=\"layadmin-layout-right\">\n");
      out.write("\n");
      out.write("                <li class=\"layui-nav-item layui-hide-xs\" lay-unselect>\n");
      out.write("                    <a href=\"javascript:;\" layadmin-event=\"fullscreen\">\n");
      out.write("                        <i class=\"layui-icon layui-icon-screen-full\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"layui-nav-item\" lay-unselect>\n");
      out.write("                    <a href=\"javascript:;\">\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                    <dl class=\"layui-nav-child\">\n");
      out.write("                        <dd><a lay-href=\"set/user/info.html\">基本资料</a></dd>\n");
      out.write("                        <dd><a lay-href=\"set/user/password.html\">修改密码</a></dd>\n");
      out.write("                        <hr>\n");
      out.write("                        <dd layadmin-event=\"logout\" style=\"text-align: center;\"><a href=\"/loginout\">退出</a></dd>\n");
      out.write("                    </dl>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"layui-nav-item layui-hide-xs\" lay-unselect>\n");
      out.write("                    <a href=\"javascript:;\" layadmin-event=\"about\"><i\n");
      out.write("                            class=\"layui-icon layui-icon-more-vertical\"></i></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"layui-nav-item layui-show-xs-inline-block layui-hide-sm\" lay-unselect>\n");
      out.write("                    <a href=\"javascript:;\" layadmin-event=\"more\"><i class=\"layui-icon layui-icon-more-vertical\"></i></a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- 侧边菜单 -->\n");
      out.write("        <div class=\"layui-side layui-side-menu\">\n");
      out.write("            <div class=\"layui-side-scroll\">\n");
      out.write("                <div class=\"layui-logo\" lay-href=\"/toConsole\">\n");
      out.write("                    <span>校园失物招领系统后台</span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul class=\"layui-nav layui-nav-tree\" lay-shrink=\"all\" id=\"LAY-system-side-menu\" lay-filter=\"layadmin-system-side-menu\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/jsp/main.jsp(86,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.type==4}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <li data-name=\"home\" class=\"layui-nav-item layui-nav-itemed\">\n");
          out.write("                            <a href=\"javascript:;\" lay-tips=\"主页\" lay-direction=\"2\">\n");
          out.write("                                <i class=\"layui-icon layui-icon-home\"></i>\n");
          out.write("                                <cite>主页</cite>\n");
          out.write("                            </a>\n");
          out.write("                            <dl class=\"layui-nav-child\">\n");
          out.write("                                <dd data-name=\"console\" class=\"layui-this\">\n");
          out.write("                                    <a lay-href=\"/toConsole\">控制台</a>\n");
          out.write("                                </dd>\n");
          out.write("                            </dl>\n");
          out.write("                        </li>\n");
          out.write("                        <li data-name=\"component\" class=\"layui-nav-item\">\n");
          out.write("                            <a href=\"javascript:;\" lay-tips=\"用户管理\" lay-direction=\"2\">\n");
          out.write("                                <i class=\"layui-icon layui-icon-component\"></i>\n");
          out.write("                                <cite>用户管理</cite>\n");
          out.write("                            </a>\n");
          out.write("                            <dl class=\"layui-nav-child\">\n");
          out.write("                                <dd>\n");
          out.write("                                    <a lay-href=\"/user/list\">用户列表</a>\n");
          out.write("                                </dd>\n");
          out.write("                            </dl>\n");
          out.write("                        </li>\n");
          out.write("                        <li data-name=\"component\" class=\"layui-nav-item\">\n");
          out.write("                            <a href=\"javascript:;\" lay-tips=\"失物管理\" lay-direction=\"2\">\n");
          out.write("                                <i class=\"layui-icon layui-icon-component\"></i>\n");
          out.write("                                <cite>失物管理</cite>\n");
          out.write("                            </a>\n");
          out.write("                            <dl class=\"layui-nav-child\">\n");
          out.write("                                <dd>\n");
          out.write("                                    <a lay-href=\"");
          out.print(path);
          out.write("/goods/list\">失物列表</a>\n");
          out.write("                                </dd>\n");
          out.write("                            </dl>\n");
          out.write("                        </li>\n");
          out.write("                        <li data-name=\"component\" class=\"layui-nav-item\">\n");
          out.write("                            <a href=\"javascript:;\" lay-tips=\"公告管理\" lay-direction=\"2\">\n");
          out.write("                                <i class=\"layui-icon layui-icon-component\"></i>\n");
          out.write("                                <cite>公告管理</cite>\n");
          out.write("                            </a>\n");
          out.write("                            <dl class=\"layui-nav-child\">\n");
          out.write("                                <dd>\n");
          out.write("                                    <a lay-href=\"");
          out.print(path);
          out.write("/board/list\">公告列表</a>\n");
          out.write("                                </dd>\n");
          out.write("                            </dl>\n");
          out.write("                        </li>\n");
          out.write("\n");
          out.write("                        <li data-name=\"set\" class=\"layui-nav-item\">\n");
          out.write("                            <a href=\"javascript:;\" lay-tips=\"设置\" lay-direction=\"2\">\n");
          out.write("                                <i class=\"layui-icon layui-icon-set\"></i>\n");
          out.write("                                <cite>设置</cite>\n");
          out.write("                            </a>\n");
          out.write("                            <dl class=\"layui-nav-child\">\n");
          out.write("                                <dd class=\"layui-nav-itemed\">\n");
          out.write("                                    <a href=\"javascript:;\">我的设置</a>\n");
          out.write("                                    <dl class=\"layui-nav-child\">\n");
          out.write("                                        <dd><a lay-href=\"set/user/info.html\">基本资料</a></dd>\n");
          out.write("                                        <dd><a lay-href=\"set/user/password.html\">修改密码</a></dd>\n");
          out.write("                                    </dl>\n");
          out.write("                                </dd>\n");
          out.write("                            </dl>\n");
          out.write("                        </li>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- 页面标签 -->\n");
      out.write("        <div class=\"layadmin-pagetabs\" id=\"LAY_app_tabs\">\n");
      out.write("            <div class=\"layui-icon layadmin-tabs-control layui-icon-prev\" layadmin-event=\"leftPage\"></div>\n");
      out.write("            <div class=\"layui-icon layadmin-tabs-control layui-icon-next\" layadmin-event=\"rightPage\"></div>\n");
      out.write("            <div class=\"layui-icon layadmin-tabs-control layui-icon-down\">\n");
      out.write("                <ul class=\"layui-nav layadmin-tabs-select\" lay-filter=\"layadmin-pagetabs-nav\">\n");
      out.write("                    <li class=\"layui-nav-item\" lay-unselect>\n");
      out.write("                        <a href=\"javascript:;\"></a>\n");
      out.write("                        <dl class=\"layui-nav-child layui-anim-fadein\">\n");
      out.write("                            <dd layadmin-event=\"closeThisTabs\"><a href=\"javascript:;\">关闭当前标签页</a></dd>\n");
      out.write("                            <dd layadmin-event=\"closeOtherTabs\"><a href=\"javascript:;\">关闭其它标签页</a></dd>\n");
      out.write("                            <dd layadmin-event=\"closeAllTabs\"><a href=\"javascript:;\">关闭全部标签页</a></dd>\n");
      out.write("                        </dl>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"layui-tab\" lay-unauto lay-allowClose=\"true\" lay-filter=\"layadmin-layout-tabs\">\n");
      out.write("                <ul class=\"layui-tab-title\" id=\"LAY_app_tabsheader\">\n");
      out.write("                    <li lay-id=\"/toConsole\" lay-attr=\"/toConsole\" class=\"layui-this\"><i\n");
      out.write("                            class=\"layui-icon layui-icon-home\"></i></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- 主体内容 -->\n");
      out.write("        <div class=\"layui-body\" id=\"LAY_app_body\">\n");
      out.write("            <div class=\"layadmin-tabsbody-item layui-show\">\n");
      out.write("                <iframe src=\"/toConsole\" frameborder=\"0\" class=\"layadmin-iframe\"></iframe>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- 辅助元素，一般用于移动设备下遮罩 -->\n");
      out.write("        <div class=\"layadmin-body-shade\" layadmin-event=\"shade\"></div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/layuiadmin/layui/layui.js\"></script>\n");
      out.write("<script>\n");
      out.write("    layui.config({\n");
      out.write("        base: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/layuiadmin/' //静态资源所在路径\n");
      out.write("    }).extend({\n");
      out.write("        index: 'lib/index' //主入口模块\n");
      out.write("    }).use('index');\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/main.jsp(52,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.admin != null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <cite>欢迎管理员：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.admin.nickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</cite>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/main.jsp(55,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user != null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <cite>欢迎用户：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.nick_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</cite>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
