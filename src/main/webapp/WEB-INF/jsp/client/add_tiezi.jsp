<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<html>
<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>
<body>
<!--header start-->
<jsp:include page="/WEB-INF/jsp/common/nav.jsp"></jsp:include>

<!--inside content start-->
<div class="inside_wrap">
    <div class="inside_con">
        <div class="adr">
            <a href="index.html">首页</a>&nbsp;>&nbsp;校园论坛&nbsp;>&nbsp;发布帖子
        </div>
        <div class="inside_box">
            <%--LEFT菜单--%>
            <jsp:include page="/WEB-INF/jsp/common/left.jsp"></jsp:include>

            <div class="ic_wrap fr">
                <form class="layui-form" action="<%=path%>/tiezi/add" method="post">
                    <%--标题--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">标题</label>
                        <div class="layui-input-block">
                            <input type="text" name="title" required lay-verify="required" placeholder="请输入标题"
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <%--详细内容--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">内容：</label>
                        <div class="layui-input-block">
                            <textarea id="content" name="content" style="display: none;" placeholder="请输入详细内容" class="layui-textarea"></textarea>
                        </div>
                    </div>
                    <%--按钮组--%>
                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <button class="layui-btn" type="submit">立即提交</button>
                            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                        </div>
                    </div>
                </form>
            </div>
            <div class="clear"></div>
        </div>
    </div>
</div>
<!--footer start-->
<jsp:include page="/WEB-INF/jsp/common/footer.jsp"></jsp:include>
<script src="<%=path%>/static/js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="<%=path%>/static/js/jquery.SuperSlide.2.1.js" type="text/javascript"></script>
<script src="<%=path%>/static/js/common.js"></script>
<%-- 引入 layui.js --%>
<script src="<%=path %>/static/layuiadmin/layui/layui.js"></script>
<script>
    //Demo
    layui.use(['form', 'upload', 'jquery', 'layedit'], function () {
        var $ = layui.$
            , upload = layui.upload
            , form = layui.form
            , layedit = layui.layedit;


        // 富文本编辑器-图片上传
        layedit.set({
            uploadImage: {
                url: '${pageContext.request.contextPath}/uploadconimage', //接口url
                type: 'post' // 默认post
            }
        });
        //建立编辑器
        var index = layedit.build('content', {
            tool: ['strong', 'italic', 'underline', 'del', '|', 'left', 'center', 'right', 'link', 'unlink', 'image', 'face', 'video']
            , height: 400
        });

        //提交
        form.on('submit(formDemo)', function (data) {
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
</script>
</body>
</html>
