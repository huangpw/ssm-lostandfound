<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" media="all">
</head>
<body>

<div class="layui-card layadmin-header">
    <div class="layui-breadcrumb" lay-filter="breadcrumb">
        <a lay-href="">主页</a>
        <a><cite>公告管理</cite></a>
        <a><cite>公告详情</cite></a>
    </div>
</div>

<div class="layui-fluid">
    <h4>${record.title}</h4>
    <p style="padding: 10px 0;"><fmt:formatDate value="${record.create_time}" pattern="yyyy-MM-dd HH:mm:ss"/></p>
    <p>${record.content}</p>


    <br>
    <br>
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">公告详情</div>
                <div class="layui-card-body">
                    <table class="layui-table">
                        <thead>
                        <%--<tr>--%>
                        <%--    <th>编号</th>--%>
                        <%--    <th>标题</th>--%>
                        <%--    <th>发布内容</th>--%>
                        <%--    <th>发布日期</th>--%>
                        <%--</tr>--%>
                        <%--<tr>--%>
                        <%--    <a href="<%=path%>/board/list" class="layui-btn layui-btn-sm" style="text-decoration: none;">返回公告列表</a>--%>
                        <%--</tr>--%>
                        </thead>
                        <tbody>
                        <tr>
                            <td>编号</td>
                            <td>${record.id}</td>
                        </tr>
                        <tr>
                            <td>标题</td>
                            <td>${record.title}</td>
                        </tr>
                        <tr>
                            <td>发布内容</td>
                            <td>${record.content}</td>
                        </tr>
                        <tr>
                            <td>发布日期</td>
                            <td>
                                <fmt:formatDate value="${record.create_time}" pattern="yyyy-MM-dd HH:mm:ss"/>
                            </td>
                        </tr>
<%--                        <tr>--%>
<%--                            <td>${record.id}</td>--%>
<%--                            <td>${record.title}</td>--%>
<%--                            <td>${record.content}</td>--%>
<%--                            <td>--%>
<%--&lt;%&ndash;                                ${record.create_time}&ndash;%&gt;--%>
<%--                                <fmt:formatDate value="${record.create_time}" pattern="yyyy-MM-dd HH:mm:ss"/>--%>
<%--                            </td>--%>
<%--                        </tr>--%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>