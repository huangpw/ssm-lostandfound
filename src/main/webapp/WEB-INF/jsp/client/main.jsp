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
            <a href="index.html">首页</a>&nbsp;>&nbsp;个人信息管理&nbsp;>&nbsp;信息维护
        </div>
        <div class="inside_box">
            <%--LEft--%>
            <jsp:include page="/WEB-INF/jsp/common/left.jsp"></jsp:include>

            <div class="ic_wrap fr">
                <form class="layui-form" action="<%=path%>/user/edit" method="post">
                    <%--id--%>
                    <input type="hidden" name="id" value="${record.id}">
                    <%-- 头像 --%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">头像</label>
                        <div class="layui-upload-drag" id="headImg" style="padding: 10px 40px;margin-left: 30px;">
                            <img class="layui-upload-img headImage" src="<%=path%>/upload/${record.photo}" id="demo1" style="width:100px;height:100px;">
                            <p id="demoText"></p>
                            <p style="text-indent: 0; text-align: center;">点击上传图片</p>
                        </div>
                        <input type="hidden" name="photo" id="photo"  value="${record.photo}" />
                    </div>
                    <%--学号--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">学号</label>
                        <div class="layui-input-block">
                            <input type="text" name="stuno" required  value="${record.stuno}" lay-verify="required" placeholder="请输入学号" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <%--密码--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">密码</label>
                        <div class="layui-input-block">
                            <input type="password" name="pwd" value="${record.pwd}"  required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <%--手机号--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">手机号</label>
                        <div class="layui-input-block">
                            <input type="text" name="phone"  value="${record.phone}"  required lay-verify="required" placeholder="请输入手机号" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <%--省份--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">省份</label>
                        <div class="layui-input-block">
                            <input type="text" name="province"  value="${record.province}" required lay-verify="required" placeholder="请输入省份" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <%--昵称--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">昵称</label>
                        <div class="layui-input-block">
                            <input type="text" name="nick_name" required lay-verify="required" placeholder="请输入昵称"  value="${record.nick_name}"  autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <%--年纪--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">年级</label>
                        <div class="layui-input-block">
                            <select name="grade" lay-verify="required">
                                <option value="大一" <c:if test="${record.grade=='大一'}">selected</c:if>>大一</option>
                                <option value="大二" <c:if test="${record.grade=='大二'}">selected</c:if>>大二</option>
                                <option value="大三" <c:if test="${record.grade=='大三'}">selected</c:if>>大三</option>
                                <option value="大四" <c:if test="${record.grade=='大四'}">selected</c:if>>大四</option>
                            </select>
                        </div>
                    </div>
                    <%--性别--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">性别</label>
                        <div class="layui-input-block">
                            <input type="radio" name="sex" value="1" title="男" <c:if test="${record.sex==1}">checked</c:if>>
                            <input type="radio" name="sex" value="2" title="女" <c:if test="${record.sex==2}">checked</c:if>>
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
<script src="${pageContext.request.contextPath}/static/layuiadmin/layui/layui.js"></script>
<script>
    layui.use(['form','upload','jquery'], function(){
        var $ = layui.$
            ,upload=layui.upload
            ,form = layui.form;

        // 图片上传
        var uploadInst = upload.render({

            elem: '#headImg'
            , url: '${pageContext.request.contextPath}/utils/add'
            ,method: 'post'
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
                //打印后台传回的地址: 把地址放入一个隐藏的input中, 和表单一起提交到后台, 此处略..
                /*   console.log(res.data.src);*/
                /* window.parent.uploadHeadImage(res.data.src); */
                console.log(res.data.src);
                $("#photo").val(res.data.src);
                var demoText = $('#demoText');
                demoText.html('<span style="color: #8f8f8f;">上传成功!!!</span>');
            }
            , error: function (res) {
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }

        });

        //提交
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
</script>
</body>
</html>
