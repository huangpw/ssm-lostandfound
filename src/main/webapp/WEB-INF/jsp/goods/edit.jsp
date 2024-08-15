<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() 
	                   + ":" + request.getServerPort() + path + "/";
%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>校园失物招领系统</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/layui/css/layui.css" media="all">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/style/admin.css" media="all">
</head>
<body>

<div class="layui-fluid">
	<div class="layui-row layui-col-space15">
		<div class="layui-col-md9">
			<div class="layui-card">
				<div class="layui-card-header">编辑失物信息</div>
				<div class="layui-card-body">
					<span class="msg" style="color:red;">${requestScope.msg}</span>
					<form class="layui-form"  action="${pageContext.request.contextPath}/goods/edit" method="post">
						<input type="hidden" name="id"   value="${record.id}">
						<%--<input type="hidden" name="create_time" value="${record.create_time}">--%>
						<input type="hidden" name="user_id"   value="${record.user_id}">
						<div class="layui-row layui-col-space10 layui-form-item">
							<%--物品名称--%>
							<div class="layui-col-lg5">
								<label class="layui-form-label">物品名称：</label>
								<div class="layui-input-block">
									<input type="text" name="goods_name" id="goods_name"  placeholder="请输入物品名称" value="${record.goods_name}" autocomplete="off" class="layui-input">
								</div>
							</div>
							<%--物品图片--%>
							<div class="layui-col-lg5">
								<label class="layui-form-label">物品图片</label>
								<div class="layui-input-inline uploadHeadImage">
									<div class="layui-upload-drag" id="headImg">
										<img class="layui-upload-img headImage" src="<%=path%>/upload/${record.gods_img}" id="demo1" style="width:100px;height:100%">
										<p id="demoText"></p>
										<p>点击上传图片</p>
									</div>
								</div>
								<input type="hidden" name="gods_img" id="gods_img"  value="${record.gods_img}" />
							</div>
						</div>
						<div class="layui-row layui-col-space10 layui-form-item">
							<%--拾到地点--%>
							<div class="layui-col-lg5">
								<label class="layui-form-label">拾到地点：</label>
								<div class="layui-input-block">
									<textarea name="spot" placeholder="请输入拾到地点" class="layui-textarea">${record.spot}</textarea>
								</div>
							</div>
							<%--备注--%>
							<div class="layui-col-lg5">
								<label class="layui-form-label">备注：</label>
								<div class="layui-input-block">
									<textarea name="note" placeholder="请输入备注" class="layui-textarea">${record.note}</textarea>
								</div>
							</div>
						</div>
						<div class="layui-row layui-col-space10 layui-form-item">
							<%--拾到日期日期--%>
							<div class="layui-col-lg5">
								<label class="layui-form-label">拾到日期</label>
								<div class="layui-input-block">
									<input type="text" name="create_date" id="create_date" required lay-verify="required"
										   autocomplete="off" class="layui-input" value="${record.create_date}">
								</div>
							</div>
						</div>
						<div class="layui-row layui-col-space10 layui-form-item">
							<%--详细内容--%>
							<div class="layui-col-lg5">
								<label class="layui-form-label">详细内容：</label>
								<div class="layui-input-block">
									<textarea id="detail" name="detail" style="display: none;" placeholder="请输入详细内容" class="layui-textarea">${record.detail}</textarea>
								</div>
							</div>

						</div>
						<%--按钮组--%>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" type="submit"  id="add" >立即修改</button>
								<button type="button" onclick="location.href='/goods/list'" class="layui-btn layui-btn-normal">返回</button>
								<button type="reset" class="layui-btn layui-btn-primary">重置</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>


<script src="${pageContext.request.contextPath}/static/layuiadmin/layui/layui.js"></script>
<script>
	layui.config({
		base: '${pageContext.request.contextPath}/static/layuiadmin/' //静态资源所在路径
	}).extend({
		index: 'lib/index' //主入口模块
	}).use(['index', 'form','upload', 'laydate', 'layedit'], function(){
		var $ = layui.$
				,element = layui.element
				,upload=layui.upload
				,form = layui.form
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

		form.render(null, 'component-form-element');
		element.render('breadcrumb', 'breadcrumb');
	});
</script>
</body>
</html>