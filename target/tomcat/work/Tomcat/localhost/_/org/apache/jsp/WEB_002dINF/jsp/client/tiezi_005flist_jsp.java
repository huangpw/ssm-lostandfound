/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-08-15 07:16:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tiezi_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\n");
      out.write("<html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/common/header.jsp", out, false);
      out.write("\n");
      out.write("<body>\n");
      out.write("<!--header start-->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/common/nav.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<!--inside content start-->\n");
      out.write("<div class=\"inside_wrap\">\n");
      out.write("    <div class=\"inside_con\">\n");
      out.write("        <div class=\"adr\">\n");
      out.write("            <a href=\"index.html\">首页</a>&nbsp;>&nbsp;校园论坛&nbsp;>&nbsp;我的帖子\n");
      out.write("        </div>\n");
      out.write("        <div class=\"inside_box\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/common/left.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"ic_wrap fr\">\n");
      out.write("\n");
      out.write("                <form action=\"");
      out.print(path);
      out.write("/tiezi/list\" method=\"post\" id=\"searchForm\">\n");
      out.write("                    <input type=\"hidden\" name=\"pageNum\" id=\"pageNum\">\n");
      out.write("                    <div class=\"layui-form-mid\">关键词:</div>\n");
      out.write("                    <div class=\"layui-input-inline\" style=\"width: 100px;\">\n");
      out.write("                        <input type=\"text\" name=\"title\" placeholder=\"标题\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.record.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"height:33px;\"  class=\"layui-input\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <input type=\"hidden\" name=\"pageSize\" id=\"pageSize\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageSize }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"layui-btn layui-btn-normal layui-btn-sm\">查询</button>\n");
      out.write("                    <button id=\"delmany\" class=\"layui-btn layui-btn-danger layui-btn-sm\" type=\"button\">批量删除</button>\n");
      out.write("\n");
      out.write("                    <a class=\"layui-btn layui-btn-normal layui-btn-sm\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/tiezi/toAdd\" style=\"text-decoration:none\">\n");
      out.write("                        <i class=\"layui-icon layui-icon-add-1\"></i>新增\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <table class=\"layui-table\">\n");
      out.write("                    <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            <input type=\"checkbox\" onclick=\"checkAll()\" id=\"selectall\"/>\n");
      out.write("                        </th>\n");
      out.write("                        <th>标题</th>\n");
      out.write("                        <th>发布日期</th>\n");
      out.write("                        <th style=\"text-align: center;\">操作</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/jsp/client/tiezi_list.jsp(56,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.pageInfo.list!=null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          //  c:forEach
          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
          _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
          // /WEB-INF/jsp/client/tiezi_list.jsp(57,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
          _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/client/tiezi_list.jsp(57,24) '${requestScope.pageInfo.list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.pageInfo.list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
          // /WEB-INF/jsp/client/tiezi_list.jsp(57,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fforEach_005f0.setVar("row");
          int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
          try {
            int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
            if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n");
                out.write("                            <tr>\n");
                out.write("                                <td >\n");
                out.write("                                    <input type=\"checkbox\" name=\"id\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
                out.write("\"/>\n");
                out.write("                                </td>\n");
                out.write("                                <td class=\"rowid\" style=\"display: none;\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
                out.write("</td>\n");
                out.write("\n");
                out.write("                                <td><a href=\"");
                out.print(path);
                out.write("/tiezi/detail?id=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
                out.write('"');
                out.write('>');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
                out.write("</a></td>\n");
                out.write("                                <td>");
                if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                  return;
                out.write("</td>\n");
                out.write("                                ");
                out.write("\n");
                out.write("                                ");
                out.write("\n");
                out.write("                                ");
                out.write("\n");
                out.write("                                    ");
                out.write("\n");
                out.write("                                <td style=\"text-align: center\">\n");
                out.write("                                        ");
                out.write("\n");
                out.write("                                    ");
                out.write("\n");
                out.write("                                    ");
                out.write("\n");
                out.write("                                    ");
                out.write("\n");
                out.write("                                        ");
                out.write("\n");
                out.write("                                    <a class=\"layui-btn layui-btn-danger layui-btn-sm layui-delete\"\n");
                out.write("                                       href=\"javascript:void(0)\"\n");
                out.write("                                       style=\"text-decoration:none\">\n");
                out.write("                                        <i class=\"layui-icon\">&#xe640;</i>\n");
                out.write("                                    </a>\n");
                out.write("                                </td>\n");
                out.write("                            </tr>\n");
                out.write("                        ");
                int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              return;
            }
          } catch (java.lang.Throwable _jspx_exception) {
            while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
              out = _jspx_page_context.popBody();
            _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
          } finally {
            _jspx_th_c_005fforEach_005f0.doFinally();
            _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
          }
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                <nav aria-label=\"Page navigation\" style=\"text-align: center\">\n");
      out.write("                    <ul class=\"pagination\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"javascript:doPage(1)\" aria-label=\"Previous\">\n");
      out.write("                                <span aria-hidden=\"true\">首页</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <li><a href=\"#\" disabled>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.pageInfo.pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.pageInfo.pages}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("页</a></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"javascript:doPage(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.pageInfo.pages}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(")\" aria-label=\"Next\">\n");
      out.write("                                <span aria-hidden=\"true\">末页</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a> 共 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.pageInfo.total}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" 条记录</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
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
      out.write("\n");
      out.write("<script src=\"");
      out.print(path );
      out.write("/static/layuiadmin/layui/layui.js\"></script>\n");
      out.write("<script>\n");
      out.write("    layui.use(['layer', 'form', 'laydate', 'jquery'], function () {//调用layui组件\n");
      out.write("        var form = layui.form;\n");
      out.write("        var layer = layui.layer;\n");
      out.write("        var laydate = layui.laydate;\n");
      out.write("        $ = layui.jquery;\n");
      out.write("\n");
      out.write("        //执行一个laydate实例日期\n");
      out.write("        // laydate.render({\n");
      out.write("        //     elem: '#create_date'//指定元素\n");
      out.write("        //\n");
      out.write("        // });\n");
      out.write("\n");
      out.write("        form.render();\n");
      out.write("        // 批量删除数据\n");
      out.write("        $(\"#delmany\").click(function () {\n");
      out.write("            var checkbox = false;//默认复选框为空\n");
      out.write("            $(\"input[name='id']\").each(function () {//获取复选框节点id\n");
      out.write("                if (this.checked == true) {\n");
      out.write("                    checkbox = true; //已勾选\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            if (checkbox) {\n");
      out.write("                var obj = document.getElementsByName(\"id\");//将复选框定义成一个jquery对象\n");
      out.write("                var check_val = [];//定义一个数组\n");
      out.write("                for (var k in obj) {//k相当于i,往这个jquery对象添加勾选的id;\n");
      out.write("                    if (obj[k].checked) //选中的都放进 数组里\n");
      out.write("                        check_val.push(obj[k].value);\n");
      out.write("                }\n");
      out.write("                layer.confirm('确认批量删除该记录吗?', {\n");
      out.write("                    btn: ['是', '否'], btn1: function () {\n");
      out.write("                        $.ajax({//利用ajax发出请求\n");
      out.write("                            type: \"post\",//post类型\n");
      out.write("                            /*dataType:\"text\",\n");
      out.write("                            data:{\"ids\":check_val},*/\n");
      out.write("                            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/tiezi/deletemany?ids=\" + check_val,\n");
      out.write("                            success: function (data) {//删除成功后，deleteMany会返回一个\"ok\";\n");
      out.write("                                if (data == \"ok\") {\n");
      out.write("                                    layer.msg('删除成功', {\n");
      out.write("                                        icon: 1,\n");
      out.write("                                        time: 1000 //2秒关闭（如果不配置，默认是3秒）\n");
      out.write("                                    }, function () {\n");
      out.write("                                        document.location.reload();\n");
      out.write("                                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                    },\n");
      out.write("                    btn2: function (index) {\n");
      out.write("                        layer.close(index);\n");
      out.write("                    }\n");
      out.write("                })\n");
      out.write("\n");
      out.write("\n");
      out.write("            } else {\n");
      out.write("                layer.alert(\"你没有选中任何的记录信息！\");\n");
      out.write("                /*\tlayer.msg(\"你没有选中任何的记录信息\");*/\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // 删除一条数据\n");
      out.write("        $(\".layui-delete\").on('click', function () {\n");
      out.write("            //获取参数\n");
      out.write("            var rowid = $(this).parents(\"tr\").find(\".rowid\").text();\n");
      out.write("            var filename = $(this).parents(\"tr\").find(\".filename\").text();\n");
      out.write("            // 提示\n");
      out.write("            layer.confirm('确认删除本条记录吗?', {\n");
      out.write("                btn: ['是', '否'], btn1: function () {\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/tiezi/delete\",\n");
      out.write("                        type: \"POST\",\n");
      out.write("                        data: {'id': rowid, 'filename': filename},\n");
      out.write("                        success: function (data) {\n");
      out.write("                            console.log(data,\"删除成功后的返回结果\");\n");
      out.write("                            if (data == \"ok\") {\n");
      out.write("                                layer.msg('删除成功', {\n");
      out.write("                                    offset: ['50%'],\n");
      out.write("                                    time: 1000 //2秒关闭（如果不配置，默认是3秒）\n");
      out.write("                                }, function () {\n");
      out.write("                                    window.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/tiezi/list\";//相当于刷新界面\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                            } else {\n");
      out.write("                                layer.msg('删除失败', {\n");
      out.write("                                    offset: ['50%'],\n");
      out.write("                                    time: 1000 //2秒关闭（如果不配置，默认是3秒）\n");
      out.write("                                }, function () {\n");
      out.write("                                    window.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/tiezi/list\";//相当于刷新界面\n");
      out.write("                                });\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                },\n");
      out.write("                btn2: function (index) {\n");
      out.write("                    layer.close(index);\n");
      out.write("                }\n");
      out.write("            })\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script language=\"javascript\">\n");
      out.write("    // 分页查询\n");
      out.write("    function doPage(pageNo) {\n");
      out.write("        document.getElementById(\"pageNum\").value = pageNo;\n");
      out.write("        document.getElementById(\"searchForm\").submit();\n");
      out.write("    }\n");
      out.write("    // 全选\n");
      out.write("    function checkAll(){\n");
      out.write("        //让所有复选框都选中\n");
      out.write("        //document.getElementsByName();是根据指定的name属性查询返回多个标签对象集合\n");
      out.write("        //这个集合的操作跟数组一样\n");
      out.write("        //集合中每个元素都是dom对象\n");
      out.write("        //这个集合中的元素顺序是他们在html页面中从上到下的顺序\n");
      out.write("        var ids = document.getElementsByName(\"id\");\n");
      out.write("        //checked表示复选框的选中状态，如果选中是true,不选中是false\n");
      out.write("        //checked这个属性可读，可写\n");
      out.write("        for(var i=0;i<ids.length;i++){\n");
      out.write("            /*ids[i].checked=true;*/\n");
      out.write("            ids[i].checked = !ids[i].checked;\n");
      out.write("        }\n");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/client/tiezi_list.jsp(65,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.create_time}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/client/tiezi_list.jsp(65,36) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
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
    // /WEB-INF/jsp/client/tiezi_list.jsp(95,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.pageInfo.pageNum>1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li><a href=\"javascript:doPage(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.pageInfo.pageNum -1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write(")\">上一页</a></li>\n");
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

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/client/tiezi_list.jsp(98,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.pageInfo.pageNum<requestScope.pageInfo.pages}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li><a href=\"javascript:doPage(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.pageInfo.pageNum +1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write(")\">下一页</a></li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }
}
