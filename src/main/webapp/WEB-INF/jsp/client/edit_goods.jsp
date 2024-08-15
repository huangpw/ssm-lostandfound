<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>
<body>
<!--nav start-->
<jsp:include page="/WEB-INF/jsp/common/nav.jsp"></jsp:include>
<!--inside content start-->
<div class="inside_wrap">
    <div class="inside_con">
        <div class="adr">
            <a href="index.html">首页</a>&nbsp;>&nbsp;失物管理&nbsp;>&nbsp;修改失物信息
        </div>
        <div class="inside_box">
            <%--LEft--%>
            <jsp:include page="/WEB-INF/jsp/common/left.jsp"></jsp:include>
            <div class="ic_wrap fr">
                <form class="layui-form" action="<%=path%>/goods/edit" method="post">
                    <input type="hidden" name="id"   value="${record.id}">
                    <input type="hidden" name="user_id"   value="${record.user_id}">
                    <%--物品名称--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">物品名称</label>
                        <div class="layui-input-block">
                            <input type="text" name="goods_name" required lay-verify="required" placeholder="请输入物品名称"
                                   autocomplete="off" class="layui-input" value="${record.goods_name}">
                        </div>
                    </div>
                    <%--物品图片--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">物品图片</label>
                        <div class="layui-upload-drag" id="headImg" style="padding: 10px 40px;margin-left: 30px;">
                            <img class="layui-upload-img headImage" src="<%=path%>/upload/${record.gods_img}" id="demo1"
                                 style="width:100px;height:100px;">
                            <p id="demoText" style="text-indent: 0; text-align: center;"></p>
                            <p style="text-indent: 0; text-align: center;">点击上传图片</p>
                        </div>
                        <input type="hidden" name="gods_img" id="gods_img" value="${record.gods_img}" />
                    </div>
                    <%--拾到地点--%>
                    <div class="layui-form-item layui-form-text">
                        <label class="layui-form-label">拾到地点</label>
                        <div class="layui-input-block">
                            <textarea name="spot" placeholder="请输入拾到地点" class="layui-textarea">${record.spot}</textarea>
                        </div>
                    </div>
                    <%--备注--%>
                    <div class="layui-form-item layui-form-text">
                        <label class="layui-form-label">备注</label>
                        <div class="layui-input-block">
                            <textarea name="note" placeholder="请输入备注" class="layui-textarea">${record.note}</textarea>
                        </div>
                    </div>
                    <%--日期--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">日期</label>
                        <div class="layui-input-block">
                            <input type="text" name="create_date" id="create_date" required lay-verify="required"
                                   autocomplete="off" class="layui-input" value="${record.create_date}">
                        </div>
                    </div>
                    <%--详细内容--%>
                    <div class="layui-form-item">
                        <label class="layui-form-label">详细内容：</label>
                        <div class="layui-input-block">
                            <textarea id="detail" name="detail" style="display: none;" placeholder="请输入详细内容" class="layui-textarea">${record.detail}</textarea>
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
    //Demo
    layui.use(['form', 'upload', 'jquery', 'laydate', 'layedit'], function () {
        var $ = layui.$
            , upload = layui.upload
            , form = layui.form
            , laydate = layui.laydate
            , layedit = layui.layedit;

        //执行一个laydate实例日期
        laydate.render({
            elem: '#create_date'//指定元素

        });

        // 富文本编辑器-图片上传
        layedit.set({
            uploadImage: {
                url: '${pageContext.request.contextPath}/uploadconimage', //接口url
                type: 'post' // 默认post
            }
        });
        //建立编辑器
        var index = layedit.build('detail', {
            tool: ['strong', 'italic', 'underline', 'del', '|', 'left', 'center', 'right', 'link', 'unlink', 'image', 'face', 'video']
            , height: 400
        });

        // 图片上传
        var uploadInst = upload.render({

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
                //打印后台传回的地址: 把地址放入一个隐藏的input中, 和表单一起提交到后台, 此处略..
                /*   console.log(res.data.src);*/
                /* window.parent.uploadHeadImage(res.data.src); */
                console.log(res.data.src);
                $("#gods_img").val(res.data.src);
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
        form.on('submit(formDemo)', function (data) {
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
</script>
</body>
</html>
