<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<html>
<head>
    <meta charset="utf-8">
    <title>校园失物招领系统</title>
</head>
<body>
<%-- <jsp：forward page="/WEB-INF/jsp/login.jsp"></jsp：forward> --%>
<script>
    window.location.href = "<%=path%>/client/swdt"
</script>
</body>
</html>
