/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-08-14 02:01:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_005fgoods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body>\n");
      out.write("<!--nav start-->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/common/nav.jsp", out, false);
      out.write("\n");
      out.write("<!--inside content start-->\n");
      out.write("<div class=\"inside_wrap\">\n");
      out.write("    <div class=\"inside_con\">\n");
      out.write("        <div class=\"adr\">\n");
      out.write("            <a href=\"index.html\">首页</a>&nbsp;>&nbsp;失物管理&nbsp;>&nbsp;修改失物信息\n");
      out.write("        </div>\n");
      out.write("        <div class=\"inside_box\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/common/left.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"ic_wrap fr\">\n");
      out.write("                <form class=\"layui-form\" action=\"");
      out.print(path);
      out.write("/goods/edit\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" name=\"id\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"user_id\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.user_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div class=\"layui-form-item\">\n");
      out.write("                        <label class=\"layui-form-label\">物品名称</label>\n");
      out.write("                        <div class=\"layui-input-block\">\n");
      out.write("                            <input type=\"text\" name=\"goods_name\" required lay-verify=\"required\" placeholder=\"请输入物品名称\"\n");
      out.write("                                   autocomplete=\"off\" class=\"layui-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.goods_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div class=\"layui-form-item\">\n");
      out.write("                        <label class=\"layui-form-label\">物品图片</label>\n");
      out.write("                        <div class=\"layui-upload-drag\" id=\"headImg\" style=\"padding: 10px 40px;margin-left: 30px;\">\n");
      out.write("                            <img class=\"layui-upload-img headImage\" src=\"");
      out.print(path);
      out.write("/upload/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.gods_img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"demo1\"\n");
      out.write("                                 style=\"width:100px;height:100px;\">\n");
      out.write("                            <p id=\"demoText\" style=\"text-indent: 0; text-align: center;\"></p>\n");
      out.write("                            <p style=\"text-indent: 0; text-align: center;\">点击上传图片</p>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"hidden\" name=\"gods_img\" id=\"gods_img\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.gods_img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("                    </div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div class=\"layui-form-item layui-form-text\">\n");
      out.write("                        <label class=\"layui-form-label\">拾到地点</label>\n");
      out.write("                        <div class=\"layui-input-block\">\n");
      out.write("                            <textarea name=\"spot\" placeholder=\"请输入拾到地点\" class=\"layui-textarea\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.spot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div class=\"layui-form-item layui-form-text\">\n");
      out.write("                        <label class=\"layui-form-label\">备注</label>\n");
      out.write("                        <div class=\"layui-input-block\">\n");
      out.write("                            <textarea name=\"note\" placeholder=\"请输入备注\" class=\"layui-textarea\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.note}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div class=\"layui-form-item\">\n");
      out.write("                        <label class=\"layui-form-label\">日期</label>\n");
      out.write("                        <div class=\"layui-input-block\">\n");
      out.write("                            <input type=\"text\" name=\"create_date\" id=\"create_date\" required lay-verify=\"required\"\n");
      out.write("                                   autocomplete=\"off\" class=\"layui-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.create_date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div class=\"layui-form-item\">\n");
      out.write("                        <label class=\"layui-form-label\">详细内容：</label>\n");
      out.write("                        <div class=\"layui-input-block\">\n");
      out.write("                            <textarea id=\"detail\" name=\"detail\" style=\"display: none;\" placeholder=\"请输入详细内容\" class=\"layui-textarea\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${record.detail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div class=\"layui-form-item\">\n");
      out.write("                        <div class=\"layui-input-block\">\n");
      out.write("                            <button class=\"layui-btn\" type=\"submit\">立即提交</button>\n");
      out.write("                            <button type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
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
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/layuiadmin/layui/layui.js\"></script>\n");
      out.write("<script>\n");
      out.write("    //Demo\n");
      out.write("    layui.use(['form', 'upload', 'jquery', 'laydate', 'layedit'], function () {\n");
      out.write("        var $ = layui.$\n");
      out.write("            , upload = layui.upload\n");
      out.write("            , form = layui.form\n");
      out.write("            , laydate = layui.laydate\n");
      out.write("            , layedit = layui.layedit;\n");
      out.write("\n");
      out.write("        //执行一个laydate实例日期\n");
      out.write("        laydate.render({\n");
      out.write("            elem: '#create_date'//指定元素\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // 富文本编辑器-图片上传\n");
      out.write("        layedit.set({\n");
      out.write("            uploadImage: {\n");
      out.write("                url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/uploadconimage', //接口url\n");
      out.write("                type: 'post' // 默认post\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        //建立编辑器\n");
      out.write("        var index = layedit.build('detail', {\n");
      out.write("            tool: ['strong', 'italic', 'underline', 'del', '|', 'left', 'center', 'right', 'link', 'unlink', 'image', 'face', 'video']\n");
      out.write("            , height: 400\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // 图片上传\n");
      out.write("        var uploadInst = upload.render({\n");
      out.write("\n");
      out.write("            elem: '#headImg'\n");
      out.write("            , url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/utils/add'\n");
      out.write("            , method: 'post'\n");
      out.write("            , size: 5000\n");
      out.write("\n");
      out.write("            , before: function (obj) {\n");
      out.write("                //预读本地文件示例，不支持ie8\n");
      out.write("                obj.preview(function (index, file, result) {\n");
      out.write("                    $('#demo1').attr('src', result); //图片链接（base64）\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            , done: function (res) {\n");
      out.write("                //如果上传失败\n");
      out.write("                if (res.code > 0) {\n");
      out.write("                    return layer.msg('上传失败');\n");
      out.write("                }\n");
      out.write("                //上传成功\n");
      out.write("                //打印后台传回的地址: 把地址放入一个隐藏的input中, 和表单一起提交到后台, 此处略..\n");
      out.write("                /*   console.log(res.data.src);*/\n");
      out.write("                /* window.parent.uploadHeadImage(res.data.src); */\n");
      out.write("                console.log(res.data.src);\n");
      out.write("                $(\"#gods_img\").val(res.data.src);\n");
      out.write("                var demoText = $('#demoText');\n");
      out.write("                demoText.html('<span style=\"color: #8f8f8f;\">上传成功!!!</span>');\n");
      out.write("            }\n");
      out.write("            , error: function (res) {\n");
      out.write("                //演示失败状态，并实现重传\n");
      out.write("                var demoText = $('#demoText');\n");
      out.write("                demoText.html('<span style=\"color: #FF5722;\">上传失败</span> <a class=\"layui-btn layui-btn-mini demo-reload\">重试</a>');\n");
      out.write("                demoText.find('.demo-reload').on('click', function () {\n");
      out.write("                    uploadInst.upload();\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        //提交\n");
      out.write("        form.on('submit(formDemo)', function (data) {\n");
      out.write("            layer.msg(JSON.stringify(data.field));\n");
      out.write("            return false;\n");
      out.write("        });\n");
      out.write("    });\n");
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
