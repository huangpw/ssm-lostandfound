<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<html>
<head>
    <meta charset="utf-8">
    <title>注册 - 校园失物招领系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/style/login.css" media="all">
</head>
<body>


<div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;padding: 18px 0 0;">
    <div class="layadmin-user-login-main">
        <div class="layadmin-user-login-box layadmin-user-login-header">
            <h2>用户注册</h2>
            <p>校园失物招领系统</p>
        </div>
        <%--文字提示--%>
        <span class="msg" style="color:red;margin-left: 20px;">${requestScope.msg}</span>
        <div class="layadmin-user-login-box layadmin-user-login-body layui-form">
            <form action="${pageContext.request.contextPath}/user/add" method="post">
                <%--学号--%>
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="stuno"></label>
                    <input type="text" name="stuno" id="stuno" placeholder="学号" class="layui-input">
                </div>
                <%--昵称--%>
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="nick_name"></label>
                    <input type="text" name="nick_name" id="nick_name" placeholder="昵称" class="layui-input">
                </div>
                <%--密码--%>
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="pwd"></label>
                    <input type="password" name="pwd" id="pwd" placeholder="密码" class="layui-input">
                </div>
                <%--性别--%>
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="sex" style="z-index: 1;"></label>
                    <select name="sex" id="sex">
                        <option value="1">男</option>
                        <option value="2" selected>女</option>
                    </select>
                </div>
                <%--手机号--%>
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-cellphone" for="phone"></label>
                    <input type="text" name="phone" id="phone" placeholder="手机号" class="layui-input">
                </div>
                <%--年级--%>
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-template" for="grade" style="z-index: 1;"></label>
                    <%--<input type="text" name="grade" id="grade" placeholder="年级" class="layui-input">--%>
                    <select name="grade" id="grade">
                        <option value="大一" selected>大一</option>
                        <option value="大二">大二</option>
                        <option value="大三">大三</option>
                        <option value="大四">大四</option>
                    </select>
                </div>
                <%-- 省份 --%>
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-circle" for="province"></label>
                    <input type="text" name="province" id="province" placeholder="省份" class="layui-input">
                </div>
                    <div class="layui-form-item">
                        <div class="layui-upload-drag" id="headImg" style="height: fit-content;">
                            <img class="layui-upload-img headImage" src="<%=path%>/static/images/upload.png" id="demo1" style="width:100px;height:100%">
                            <p id="demoText"></p>
                            <p>点击上传图片</p>
                        </div>
                        <input type="hidden" name="photo" id="photo"  />
                    </div>
                <div class="layui-form-item">
                    <input type="checkbox" name="agreement" lay-skin="primary" title="同意用户协议" checked>
                </div>
                <div class="layui-form-item">
                    <button class="layui-btn layui-btn-fluid" id="register" type="submit">立即注册
                    </button>
                </div>
                <div class="layui-form-item">
                    <a class="layui-btn layui-btn-normal layui-btn-fluid" onclick="location.href='/toLogin'"  type="button">返回登录</a>
                </div>
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
    }).use(['index', 'user', 'upload'], function () {
        let $ = layui.$
            , form = layui.form
            , upload = layui.upload;

        $("#register").click(function () {
            let stunoText = $("#stuno").val();
            if (stunoText == "") {
                $("span.msg").text("用户名不许为空！");
                layer.alert('用户名不许为空！', {icon: 2});
                return false;
            }
        })

        //普通图片上传
        let uploadInst = upload.render({
            elem: '#headImg'
            , url: '${pageContext.request.contextPath}/utils/add'
            , method: 'post'
            , size: 5000
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
                console.log("图片地址：", res.data.src);
                $("#photo").val(res.data.src); // 获取图片地址,显示到页面
                let demoText = $('#demoText');
                demoText.html('<span style="color: blue;">上传成功!!!</span>');
            }
            , error: function () {
                //演示失败状态，并实现重传
                let demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });

        form.render();
    });
</script>
</body>
</html>