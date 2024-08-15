<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="keywords" content="校园失物招领系统" />
    <meta name="description" content="校园失物招领系统" />
    <title>校园失物招领系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" media="all">
    <link rel="stylesheet" href="<%=path%>/static/css/style.css" />
</head>