<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<html>
<head>
    <meta charset="utf-8">
    <title>登入 - 校园失物招领系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/style/login.css" media="all">
</head>
<body>

<div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">

    <div class="layadmin-user-login-main">
        <div class="layadmin-user-login-box layadmin-user-login-header">
            <h2>用户登录</h2>
            <p>校园失物招领系统</p>
        </div>
        <span class="msg" style="color:#ff0000;margin-left: 20px;">${requestScope.msg}</span>
        <div class="layadmin-user-login-box layadmin-user-login-body layui-form">
            <form action="<%=path%>/login" method="post">
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="username"></label>
                    <input type="text" name="username" id="username" placeholder="用户名" class="layui-input">
                </div>
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="pwd"></label>
                    <input type="password" name="pwd" id="pwd" lay-verify="required" placeholder="密码"
                           class="layui-input">
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">请选择角色</label>

                    <%--	<div class="layui-input-block">
                            <input type="radio" name="type" value="1" title="学生">
                            <input type="radio" name="type" value="2" title="学校人员">
                            <input type="radio" name="type" value="3" title="管理员"   checked>
                            <input type="radio" name="type" value="4" title="家长"  >
                        </div>--%>

                    <div class="layui-input-block">
                        <select name="type" lay-verify="required" lay-filter="aihao">
                            <option value="1" selected>学生</option>
                            <option value="2"> 学校负责人</option>
                            <option value="3">银行负责人</option>
                            <option value="4">管理员</option>

                        </select>
                    </div>
                </div>

                <div class="layui-form-item">
                    <button class="layui-btn layui-btn-normal layui-btn-fluid" id="login" type="submit">立即登录</button>
                </div>

                <div class="layui-form-item">
                    <button class="layui-btn layui-btn-fluid" onclick="location.href='/toRegister'" type="button">注册</button>
                </div>
                <div class="layui-form-item">
                    <button class="layui-btn layui-btn-primary layui-btn-fluid" onclick="location.href='/'" type="button">返回网站</button>
                </div>
                <p>小提示：学生用学号登录，管理员用用户名登录</p>
            </form>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/static/layuiadmin/layui/layui.js"></script>
<script>
    layui.config({
        base: '${pageContext.request.contextPath}/static/layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index', 'user'], function () {
        var $ = layui.$
            , form = layui.form
            , router = layui.router()

        form.render();

        //提交
        $(function () {

            $("#login").click(function () {
                var usernameText = $("#username").val();
                if (usernameText == "") {
                    $("span.msg").text("用户名不许为空！");
                    layer.msg("用户名不许为空！", {icon: 2, time: 2000})
                    return false;
                }
                var pwdText = $("#pwd").val();
                if (pwdText == "") {
                    $("span.msg").text("密码不许为空！");
                    layer.msg("密码不许为空！", {icon: 2, time: 2000})
                    return false;
                }
            })

            setTimeout(function () {
                $("span.msg").html("")
            }, 2000)
        })


    });
</script>
</body>
</html>