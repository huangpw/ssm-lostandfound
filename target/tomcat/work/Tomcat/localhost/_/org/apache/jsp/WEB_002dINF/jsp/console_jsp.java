/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-08-12 04:36:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class console_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  String path = request.getContextPath();//获得当前的项目根目录路径赋值给path

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>layuiAdmin 控制台主页一</title>\n");
      out.write("  <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/layuiadmin/layui/css/layui.css\" media=\"all\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/layuiadmin/style/admin.css\" media=\"all\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("  <div class=\"layui-fluid\">\n");
      out.write("    <div class=\"layui-row layui-col-space15\">\n");
      out.write("      <div class=\"layui-col-md8\">\n");
      out.write("        <div class=\"layui-row layui-col-space15\">\n");
      out.write("          <div class=\"layui-col-md6\">\n");
      out.write("            <div class=\"layui-card\">\n");
      out.write("              <div class=\"layui-card-header\">快捷方式</div>\n");
      out.write("              <div class=\"layui-card-body\">\n");
      out.write("                \n");
      out.write("                <div class=\"layui-carousel layadmin-carousel layadmin-shortcut\">\n");
      out.write("                  <div carousel-item>\n");
      out.write("                    <ul class=\"layui-row layui-col-space10\">\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"home/homepage1.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-console\"></i>\n");
      out.write("                          <cite>主页一</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"home/homepage2.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-chart\"></i>\n");
      out.write("                          <cite>主页二</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"component/layer/list.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-template-1\"></i>\n");
      out.write("                          <cite>弹层</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a layadmin-event=\"im\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-chat\"></i>\n");
      out.write("                          <cite>聊天</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"component/progress/index.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-find-fill\"></i>\n");
      out.write("                          <cite>进度条</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"app/workorder/list.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-survey\"></i>\n");
      out.write("                          <cite>工单</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"user/user/list.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-user\"></i>\n");
      out.write("                          <cite>用户</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"set/system/website.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-set\"></i>\n");
      out.write("                          <cite>设置</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"layui-row layui-col-space10\">\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"set/user/info.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-set\"></i>\n");
      out.write("                          <cite>我的资料</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"set/user/info.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-set\"></i>\n");
      out.write("                          <cite>我的资料</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"set/user/info.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-set\"></i>\n");
      out.write("                          <cite>我的资料</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"set/user/info.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-set\"></i>\n");
      out.write("                          <cite>我的资料</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"set/user/info.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-set\"></i>\n");
      out.write("                          <cite>我的资料</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"set/user/info.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-set\"></i>\n");
      out.write("                          <cite>我的资料</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"set/user/info.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-set\"></i>\n");
      out.write("                          <cite>我的资料</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs3\">\n");
      out.write("                        <a lay-href=\"set/user/info.html\">\n");
      out.write("                          <i class=\"layui-icon layui-icon-set\"></i>\n");
      out.write("                          <cite>我的资料</cite>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"layui-col-md6\">\n");
      out.write("            <div class=\"layui-card\">\n");
      out.write("              <div class=\"layui-card-header\">待办事项</div>\n");
      out.write("              <div class=\"layui-card-body\">\n");
      out.write("\n");
      out.write("                <div class=\"layui-carousel layadmin-carousel layadmin-backlog\">\n");
      out.write("                  <div carousel-item>\n");
      out.write("                    <ul class=\"layui-row layui-col-space10\">\n");
      out.write("                      <li class=\"layui-col-xs6\">\n");
      out.write("                        <a lay-href=\"app/content/comment.html\" class=\"layadmin-backlog-body\">\n");
      out.write("                          <h3>待审评论</h3>\n");
      out.write("                          <p><cite>66</cite></p>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs6\">\n");
      out.write("                        <a lay-href=\"app/forum/list.html\" class=\"layadmin-backlog-body\">\n");
      out.write("                          <h3>待审帖子</h3>\n");
      out.write("                          <p><cite>12</cite></p>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs6\">\n");
      out.write("                        <a lay-href=\"template/goodslist.html\" class=\"layadmin-backlog-body\">\n");
      out.write("                          <h3>待审商品</h3>\n");
      out.write("                          <p><cite>99</cite></p>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"layui-col-xs6\">\n");
      out.write("                        <a href=\"javascript:;\" onclick=\"layer.tips('不跳转', this, {tips: 3});\" class=\"layadmin-backlog-body\">\n");
      out.write("                          <h3>待发货</h3>\n");
      out.write("                          <p><cite>20</cite></p>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"layui-row layui-col-space10\">\n");
      out.write("                      <li class=\"layui-col-xs6\">\n");
      out.write("                        <a href=\"javascript:;\" class=\"layadmin-backlog-body\">\n");
      out.write("                          <h3>待审友情链接</h3>\n");
      out.write("                          <p><cite style=\"color: #FF5722;\">5</cite></p>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"layui-col-md12\">\n");
      out.write("            <div class=\"layui-card\">\n");
      out.write("              <div class=\"layui-card-header\">数据概览</div>\n");
      out.write("              <div class=\"layui-card-body\">\n");
      out.write("                \n");
      out.write("                <div class=\"layui-carousel layadmin-carousel layadmin-dataview\" data-anim=\"fade\" lay-filter=\"LAY-index-dataview\">\n");
      out.write("                  <div carousel-item id=\"LAY-index-dataview\">\n");
      out.write("                    <div><i class=\"layui-icon layui-icon-loading1 layadmin-loading\"></i></div>\n");
      out.write("                    <div></div>\n");
      out.write("                    <div></div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"layui-card\">\n");
      out.write("              <div class=\"layui-tab layui-tab-brief layadmin-latestData\">\n");
      out.write("                <ul class=\"layui-tab-title\">\n");
      out.write("                  <li class=\"layui-this\">今日热搜</li>\n");
      out.write("                  <li>今日热帖</li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"layui-tab-content\">\n");
      out.write("                  <div class=\"layui-tab-item layui-show\">\n");
      out.write("                    <table id=\"LAY-index-topSearch\"></table>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"layui-tab-item\">\n");
      out.write("                    <table id=\"LAY-index-topCard\"></table>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"layui-col-md4\">\n");
      out.write("        <div class=\"layui-card\">\n");
      out.write("          <div class=\"layui-card-header\">版本信息</div>\n");
      out.write("          <div class=\"layui-card-body layui-text\">\n");
      out.write("            <table class=\"layui-table\">\n");
      out.write("              <colgroup>\n");
      out.write("                <col width=\"100\">\n");
      out.write("                <col>\n");
      out.write("              </colgroup>\n");
      out.write("              <tbody>\n");
      out.write("                <tr>\n");
      out.write("                  <td>当前版本</td>\n");
      out.write("                  <td>\n");
      out.write("                    <script type=\"text/html\" template>\n");
      out.write("                      v{{ layui.admin.v }}\n");
      out.write("                      <a href=\"http://fly.layui.com/docs/3/\" target=\"_blank\" style=\"padding-left: 15px;\">更新日志</a>\n");
      out.write("                    </script>\n");
      out.write("                  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>基于框架</td>\n");
      out.write("                  <td>\n");
      out.write("                    <script type=\"text/html\" template>\n");
      out.write("                      layui-v{{ layui.v }}\n");
      out.write("                    </script>\n");
      out.write("                 </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>主要特色</td>\n");
      out.write("                  <td>零门槛 / 响应式 / 清爽 / 极简</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>获取渠道</td>\n");
      out.write("                  <td style=\"padding-bottom: 0;\">\n");
      out.write("                    <div class=\"layui-btn-container\">\n");
      out.write("                      <a href=\"http://www.layui.com/admin/\" target=\"_blank\" class=\"layui-btn layui-btn-danger\">获取授权</a>\n");
      out.write("                      <a href=\"http://fly.layui.com/download/layuiAdmin/\" target=\"_blank\" class=\"layui-btn\">立即下载</a>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                </tr>\n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"layui-card\">\n");
      out.write("          <div class=\"layui-card-header\">效果报告</div>\n");
      out.write("          <div class=\"layui-card-body layadmin-takerates\">\n");
      out.write("            <div class=\"layui-progress\" lay-showPercent=\"yes\">\n");
      out.write("              <h3>转化率（日同比 28% <span class=\"layui-edge layui-edge-top\" lay-tips=\"增长\" lay-offset=\"-15\"></span>）</h3>\n");
      out.write("              <div class=\"layui-progress-bar\" lay-percent=\"65%\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"layui-progress\" lay-showPercent=\"yes\">\n");
      out.write("              <h3>签到率（日同比 11% <span class=\"layui-edge layui-edge-bottom\" lay-tips=\"下降\" lay-offset=\"-15\"></span>）</h3>\n");
      out.write("              <div class=\"layui-progress-bar\" lay-percent=\"32%\"></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"layui-card\">\n");
      out.write("          <div class=\"layui-card-header\">实时监控</div>\n");
      out.write("          <div class=\"layui-card-body layadmin-takerates\">\n");
      out.write("            <div class=\"layui-progress\" lay-showPercent=\"yes\">\n");
      out.write("              <h3>CPU使用率</h3>\n");
      out.write("              <div class=\"layui-progress-bar\" lay-percent=\"58%\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"layui-progress\" lay-showPercent=\"yes\">\n");
      out.write("              <h3>内存占用率</h3>\n");
      out.write("              <div class=\"layui-progress-bar layui-bg-red\" lay-percent=\"90%\"></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"layui-card\">\n");
      out.write("          <div class=\"layui-card-header\">产品动态</div>\n");
      out.write("          <div class=\"layui-card-body\">\n");
      out.write("            <div class=\"layui-carousel layadmin-carousel layadmin-news\" data-autoplay=\"true\" data-anim=\"fade\" lay-filter=\"news\">\n");
      out.write("              <div carousel-item>\n");
      out.write("                <div><a href=\"http://fly.layui.com/docs/2/\" target=\"_blank\" class=\"layui-bg-red\">layuiAdmin 快速上手文档</a></div>\n");
      out.write("                <div><a href=\"http://fly.layui.com/vipclub/list/layuiadmin/\" target=\"_blank\" class=\"layui-bg-green\">layuiAdmin 会员讨论专区</a></div> \n");
      out.write("                <div><a href=\"http://www.layui.com/admin/#get\" target=\"_blank\" class=\"layui-bg-blue\">获得 layui 官方后台模板系统</a></div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"layui-card\">\n");
      out.write("          <div class=\"layui-card-header\">\n");
      out.write("            作者心语\n");
      out.write("            <i class=\"layui-icon layui-icon-tips\" lay-tips=\"要支持的噢\" lay-offset=\"5\"></i>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"layui-card-body layui-text layadmin-text\">\n");
      out.write("            <p>一直以来，layui 秉承无偿开源的初心，虔诚致力于服务各层次前后端 Web 开发者，在商业横飞的当今时代，这一信念从未动摇。即便身单力薄，仍然重拾决心，埋头造轮，以尽可能地填补产品本身的缺口。</p>\n");
      out.write("            <p>在过去的一段的时间，我一直在寻求持久之道，已维持你眼前所见的一切。而 layuiAdmin 是我们尝试解决的手段之一。我相信真正有爱于 layui 生态的你，定然不会错过这一拥抱吧。</p>\n");
      out.write("            <p>子曰：君子不用防，小人防不住。请务必通过官网正规渠道，获得 <a href=\"http://www.layui.com/admin/\" target=\"_blank\">layuiAdmin</a>！</p>\n");
      out.write("            <p>—— 贤心（<a href=\"http://www.layui.com/\" target=\"_blank\">layui.com</a>）</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/layuiadmin/layui/layui.js?t=1\"></script>\n");
      out.write("  <script>\n");
      out.write("  layui.config({\n");
      out.write("    base: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/layuiadmin/' //静态资源所在路径\n");
      out.write("  }).extend({\n");
      out.write("    index: 'lib/index' //主入口模块\n");
      out.write("  }).use(['index', 'console']);\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
