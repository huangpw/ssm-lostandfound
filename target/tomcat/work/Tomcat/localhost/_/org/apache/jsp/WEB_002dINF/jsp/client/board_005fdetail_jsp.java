/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-08-15 07:58:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class board_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
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
      out.write('\n');

    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/common/header.jsp", out, false);
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/static/css/page.css\" />\n");
      out.write("<body>\n");
      out.write("<!--nav start-->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/common/nav.jsp", out, false);
      out.write("\n");
      out.write("<!--inside content start-->\n");
      out.write("<div class=\"inside_wrap\">\n");
      out.write("    <div class=\"inside_con\">\n");
      out.write("        <div class=\"adr\">\n");
      out.write("            <a href=\"index.html\">首页</a>&nbsp;>&nbsp;<a href=\"");
      out.print(path);
      out.write("/client/boards\">公告列表</a>&nbsp;>&nbsp;公告详情\n");
      out.write("        </div>\n");
      out.write("        <div class=\"inside_box\">\n");
      out.write("            <div class=\"topic_wrap fl\">\n");
      out.write("                <div class=\"t_label\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                        <div class=\"tl_tab fl\">\n");
      out.write("                            <a href=\"");
      out.print(path);
      out.write("/client/boards\" id=\"hot_week\" class=\"active\">返回列表</a>\n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"search fr\">\n");
      out.write("                        <input type=\"text\" name=\"topic\" id=\"topic\" value=\"\" placeholder=\"请输入话题名称\" class=\"input_tp\" />\n");
      out.write("                        <button type=\"button\" class=\"btn\">搜索</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tl_con\">\n");
      out.write("                    <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("                        <span class=\"addressor\">\n");
      out.write("                        发布者：XXXXXX&nbsp;&nbsp;&nbsp;\n");
      out.write("                        发布日期：");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("&nbsp;&nbsp;&nbsp;\n");
      out.write("                        </span>\n");
      out.write("                    </h3>\n");
      out.write("                    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div class=\"reply_wrap\" id=\"reply\">\n");
      out.write("                        <div class=\"r_title\">共4个回复</div>\n");
      out.write("                        <ul class=\"talk_list\">\n");
      out.write("                            <li class=\"backview\">\n");
      out.write("                                <div class=\"det_l\">\n");
      out.write("                                    <a href=\"ownTopic1.html\" class=\"avatar\"><img src=\"/static/images/favicon.jpg\"/></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"li_cont\">\n");
      out.write("                                    <div class=\"info\">\n");
      out.write("                                        <span class=\"i_name\"><a href=\"ownTopic1.html\">用户名称</a><span class=\"date\">2016-06-17 14:00</span></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"li_t editor_style\">\n");
      out.write("                                        <p>回复内容</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"info replyinfo\">\n");
      out.write("                                        <span class=\"replynum\"><a href=\"javascript:void(0);\">全部回复(1)</a></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"del_reply_wp\">\n");
      out.write("                                        <ul class=\"del_repy\">\n");
      out.write("                                            <li class=\"cl\">\n");
      out.write("                                                <a href=\"ownTopic1.html\" class=\"avatar\"><img src=\"/static/images/favicon.jpg\"/></a>\n");
      out.write("                                                <div class=\"cl_cont\">\n");
      out.write("                                                    <div class=\"info\">\n");
      out.write("                                                        <span class=\"i_name\"><a href=\"ownTopic1.html\">用户名称</a><span class=\"date\">2016-06-17 14:00</span></span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"li_t editor_style\">\n");
      out.write("                                                        <p>回复内容</p>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <div class=\"del_reply_input_cl\">\n");
      out.write("                                            <form action=\"\" method=\"post\">\n");
      out.write("                                                <textarea placeholder=\"回复XX\" name=\"content\" style=\"height: 68px;\"></textarea>\n");
      out.write("                                                <div class=\"del_reply_btn\">\n");
      out.write("                                                    <a href=\"javascript:void(0);\" class=\"cancel\">取消</a>\n");
      out.write("                                                    <button type=\"submit\" class=\"btn submit_btn\">回复</button>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clear\"></div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"backview\">\n");
      out.write("                                <div class=\"det_l\">\n");
      out.write("                                    <a href=\"ownTopic1.html\" class=\"avatar\"><img src=\"/static/images/favicon.jpg\"/></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"li_cont\">\n");
      out.write("                                    <div class=\"info\">\n");
      out.write("                                        <span class=\"i_name\"><a href=\"ownTopic1.html\">用户名称</a><span class=\"date\">2016-06-17 14:00</span></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"li_t editor_style\">\n");
      out.write("                                        <p>回复内容</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"info replyinfo\">\n");
      out.write("                                        <span class=\"replynum\"><a href=\"javascript:void(0);\">发表回复</a></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"del_reply_wp\">\n");
      out.write("                                        <div class=\"del_reply_input_cl\">\n");
      out.write("                                            <form action=\"\" method=\"post\">\n");
      out.write("                                                <textarea placeholder=\"回复XX\" name=\"content\" style=\"height: 68px;\"></textarea>\n");
      out.write("                                                <div class=\"del_reply_btn\">\n");
      out.write("                                                    <a href=\"javascript:void(0);\" class=\"cancel\">取消</a>\n");
      out.write("                                                    <button type=\"submit\" class=\"btn submit_btn\">回复</button>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clear\"></div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"editor\">\n");
      out.write("                        <div class=\"avatar\">\n");
      out.write("                            <a href=\"javascript:void(0)\";><img src=\"/static/images/favicon.jpg\"/></a>\n");
      out.write("                        </div>\n");
      out.write("                        <section id=\"editor\">\n");
      out.write("                            <div id='edit'></div>\n");
      out.write("                        </section>\n");
      out.write("                        <button type=\"submit\" class=\"btn submit_btn\">发表</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"topic_list fr\">\n");
      out.write("                <a href=\"public.html\"><button type=\"button\" class=\"btn\">发布话题</button></a>\n");
      out.write("                <div class=\"lively_user\">\n");
      out.write("                    <h4>活跃用户</h4>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"h_img\">\n");
      out.write("                                <a href=\"ownTopic1.html\"><img src=\"/static/images/favicon.jpg\" /></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"h_text\">\n");
      out.write("                                <b><a href=\"ownTopic1.html\">用户名称</a></b>\n");
      out.write("                                <p>发表了10个主题</p>\n");
      out.write("                                <p>发表了110个评论</p>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"h_img\">\n");
      out.write("                                <a href=\"ownTopic1.html\"><img src=\"/static/images/favicon.jpg\" /></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"h_text\">\n");
      out.write("                                <b><a href=\"ownTopic1.html\">用户名称</a></b>\n");
      out.write("                                <p>发表了10个主题</p>\n");
      out.write("                                <p>发表了110个评论</p>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"h_img\">\n");
      out.write("                                <a href=\"ownTopic1.html\"><img src=\"/static/images/favicon.jpg\" /></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"h_text\">\n");
      out.write("                                <b><a href=\"ownTopic1.html\">用户名称</a></b>\n");
      out.write("                                <p>发表了10个主题</p>\n");
      out.write("                                <p>发表了110个评论</p>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"h_img\">\n");
      out.write("                                <a href=\"ownTopic1.html\"><img src=\"/static/images/favicon.jpg\" /></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"h_text\">\n");
      out.write("                                <b><a href=\"ownTopic1.html\">用户名称</a></b>\n");
      out.write("                                <p>发表了10个主题</p>\n");
      out.write("                                <p>发表了110个评论</p>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"h_img\">\n");
      out.write("                                <a href=\"ownTopic1.html\"><img src=\"/static/images/favicon.jpg\" /></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"h_text\">\n");
      out.write("                                <b><a href=\"ownTopic1.html\">用户名称</a></b>\n");
      out.write("                                <p>发表了10个主题</p>\n");
      out.write("                                <p>发表了110个评论</p>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!--footer start-->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/common/footer.jsp", out, false);
      out.write("\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/static/js/jquery-1.11.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/static/js/jquery.SuperSlide.2.1.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/static/js/common.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/layuiadmin/layui/layui.js\"></script>\n");
      out.write("<script>\n");
      out.write("    //Demo\n");
      out.write("    layui.use(['form','upload','jquery','laydate','layedit'], function() {\n");
      out.write("        var $ = layui.$\n");
      out.write("            , upload = layui.upload\n");
      out.write("            , form = layui.form\n");
      out.write("            , laydate = layui.laydate\n");
      out.write("            , layedit = layui.layedit;\n");
      out.write("\n");
      out.write("        //执行一个laydate实例\n");
      out.write("        laydate.render({\n");
      out.write("            elem: '#create_date'//指定元素\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    function doPage(pageNo) {\n");
      out.write("        document.getElementById(\"pageNum\").value = pageNo;\n");
      out.write("        document.getElementById(\"searchForm\").submit();\n");
      out.write("    }\n");
      out.write("    function changePageSize(cur_pageSize){\n");
      out.write("        document.getElementById(\"pageSize\").value=cur_pageSize;\n");
      out.write("        document.getElementById(\"searchForm\").submit();//表单提交\n");
      out.write("    }\n");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    // /WEB-INF/jsp/client/board_detail.jsp(38,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.create_time}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/client/board_detail.jsp(38,29) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }
}
