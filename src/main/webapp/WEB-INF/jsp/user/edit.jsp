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
				<div class="layui-card-header">编辑用户信息</div>
				<div class="layui-card-body">
					<span class="msg" style="color:red;">${requestScope.msg}</span>
					<form class="layui-form"  action="${pageContext.request.contextPath}/user/edit" method="post">
						<input type="hidden" name="id"   value="${record.id}">
						<input type="hidden" name="create_time" value="${record.create_time}">
						<div class="layui-row layui-col-space10 layui-form-item">
							<%--昵称--%>
							<div class="layui-col-lg4">
								<label class="layui-form-label">昵称：</label>
								<div class="layui-input-block">
									<input type="text" name="nick_name" id="nick_name"  placeholder="请输入昵称" value="${record.nick_name}" autocomplete="off" class="layui-input">
								</div>

							</div>
							<%--学号--%>
							<div class="layui-col-lg4">
								<label class="layui-form-label">学号：</label>
								<div class="layui-input-block">
									<input type="text" name="stuno" id="stuno"  placeholder="请输入学号" value="${record.stuno}" autocomplete="off" class="layui-input">
								</div>

							</div>
							<%--性别--%>
							<div class="layui-col-lg4">
								<label class="layui-form-label">性别：</label>
								<div class="layui-input-block">
									<select name="sex" lay-verify="required" lay-filter="aihao">
										<option value="1"  <c:if test="${1==requestScope.record.sex}">selected="selected"</c:if>>男</option>
										<option value="2"  <c:if test="${2==requestScope.record.sex}">selected="selected"</c:if>>女</option>
									</select>
								</div>
							</div>
						</div>
						<div class="layui-row layui-col-space10 layui-form-item">
							<%--年级--%>
							<div class="layui-col-lg4">
								<label class="layui-form-label">年级：</label>
								<div class="layui-input-block">
									<select name="grade" lay-verify="required" lay-filter="aihao">
										<option value="大一"  <c:if test="${requestScope.record.grade=='大一'}">selected="selected"</c:if>>大一</option>
										<option value="大二"  <c:if test="${record.grade=='大二'}">selected="selected"</c:if>>大二</option>
										<option value="大三"  <c:if test="${record.grade=='大三'}">selected="selected"</c:if>>大三</option>
										<option value="大四"  <c:if test="${record.grade=='大四'}">selected="selected"</c:if>>大四</option>
									</select>
								</div>
							</div>
							<%--省份--%>
							<div class="layui-col-lg4">
								<label class="layui-form-label">省份：</label>
								<div class="layui-input-block">
									<input type="text" name="province" id="province"  placeholder="请输入省份" value="${record.province}" autocomplete="off" class="layui-input">
								</div>
							</div>
							<%--头像--%>
							<div class="layui-col-lg4">
								<label class="layui-form-label">头像</label>
								<div class="layui-input-inline uploadHeadImage">
									<div class="layui-upload-drag" id="headImg">
										<img class="layui-upload-img headImage" src="<%=path%>/upload/${record.photo}" id="demo1" style="width:100px;height:100%">
										<p id="demoText"></p>
										<p>点击上传图片</p>
									</div>
								</div>
								<input type="hidden" name="photo" id="photo"  value="${record.photo}" />
							</div>
						</div>
						<div class="layui-row layui-col-space10 layui-form-item">
							<%--手机号--%>
							<div class="layui-col-lg6">
								<label class="layui-form-label">手机号：</label>
								<div class="layui-input-block">
									<input type="text" name="phone" id="phone"  required  lay-verify="phone"  placeholder="请输入手机号" value="${record.phone}" autocomplete="off" class="layui-input">
								</div>
							</div>
							<%--登录密码--%>
							<div class="layui-col-lg6">
								<label class="layui-form-label">登录密码：</label>
								<div class="layui-input-block">
									<input type="text" name="pwd" id="pwd"  required  placeholder="请输入密码" value="${record.pwd}" autocomplete="off" class="layui-input">
								</div>
							</div>

						</div>
						<%--按钮组--%>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" type="submit"  id="add" >立即修改</button>
								<button type="button" onclick="location.href='/user/list'" class="layui-btn layui-btn-normal">返回</button>
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
	}).use(['index', 'form','upload'], function(){
		var $ = layui.$
				,element = layui.element
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

		form.render(null, 'component-form-element');
		element.render('breadcrumb', 'breadcrumb');
	});
</script>
</body>
</html>