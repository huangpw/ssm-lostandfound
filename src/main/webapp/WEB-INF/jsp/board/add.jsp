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
				<div class="layui-card-header">发布公告信息</div>
				<div class="layui-card-body">
					<span class="msg" style="color:red;">${requestScope.msg}</span>
					<form class="layui-form"  action="${pageContext.request.contextPath}/board/add" method="post">
						<%--<input type="hidden" name="id"   value="${record.id}">--%>
						<div class="layui-row layui-col-space10 layui-form-item">
							<%--标题--%>
							<div class="layui-col-lg10">
								<label class="layui-form-label">公告标题：</label>
								<div class="layui-input-block">
									<input type="text" name="title" id="title"  placeholder="请输入公告标题" autocomplete="off" class="layui-input">
								</div>
							</div>
						</div>
						<div class="layui-row layui-col-space10 layui-form-item">
							<%--详细内容--%>
							<div class="layui-col-lg10">
								<label class="layui-form-label">详细内容：</label>
								<div class="layui-input-block">
									<textarea id="content" name="content" style="display: none;" placeholder="请输入详细内容" class="layui-textarea"></textarea>
								</div>
							</div>
						</div>
						<%--按钮组--%>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" type="submit"  id="add" >立即添加</button>
								<button type="button" onclick="location.href='/board/list'" class="layui-btn layui-btn-normal">返回</button>
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
		// laydate.render({
		// 	elem: '#create_date'//指定元素
		//
		// });

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

		form.render(null, 'component-form-element');
		element.render('breadcrumb', 'breadcrumb');
	});
</script>
</body>
</html>