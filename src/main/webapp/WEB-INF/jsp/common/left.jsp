<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<div class="sidemenu fl">
    <div class="s_title">个人中心</div>
    <ul>
        <li class="on"><a <c:if test="${url=='info'}">style="color: #1E9FFF"</c:if> href="<%=path%>/user/info">个人信息管理</a></li>
        <li class="on"><a <a <c:if test="${url=='goods'}">style="color: #1E9FFF"</c:if> href="<%=path%>/goods/list">失物管理</a></li>
        <li class="on"><a <a <c:if test="${url=='tiezi'}">style="color: #1E9FFF"</c:if> href="<%=path%>/tiezi/list">帖子管理</a></li>
    </ul>
</div>