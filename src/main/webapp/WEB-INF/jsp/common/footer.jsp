<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<div class="footer_wrap">
    <div class="line"></div>
    <div class="footer">
        <p>版权所有：XXXXXXXXX</p>
        <p>电话：029-8888888&nbsp;&nbsp;&nbsp;邮箱：XXXXXXXX@163.com</p>
        <p>地址：陕西省西安市XXXXXXXXX  更多模板：<a href="http://www.cssmoban.com/" target="_blank">模板之家</a></p>
        <img src="<%=path%>/static/images/er.png" class="er" />
    </div>
</div>