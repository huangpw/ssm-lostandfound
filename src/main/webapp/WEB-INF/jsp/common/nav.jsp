<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<!--header start-->
<div class="header_wrap">
    <div class="header">
        <span class="wel_word fl">欢迎访问校园失物招领系统！</span>
        <span class="corner fr">
					<ul>
                        <c:if test="${ sessionScope.user == null }">
                            <li><a href="<%=path%>/toRegister">注册</a>|</li>
                            <li><a href="<%=path%>/toLogin">登录</a></li>
                        </c:if>
                        <li><a href="<%=path%>/tiezi/toAdd">发布帖子</a></li>
                        <c:if test="${ sessionScope.user != null }">
                            <li class="user_li nLi">
                                <a href="javascript:void(0);">登录用户：${sessionScope.user.nick_name}</a>
                                <div class="user_handle">
                                    <a href="">个人中心</a>
                                    <a href="">我的话题</a>
                                    <a href="<%=path%>/loginout">退出</a>
                                </div>
                            </li>
                        </c:if>
					</ul>
					<div class="clear"></div>
				</span>
        <div class="clear"></div>
    </div>
</div>
<!--nav start-->
<div class="nav_menu">
    <a href="index.html" class="logo fl">
        <img style="width: 256px;height: 53px;" src="<%=path%>/static/images/logo2.png" />
    </a>
    <div class="nav_list fr">
        <ul id="nav" class="nav clearfix">
            <li class="nLi">
                <h3><a class="active" href="/client/main">首页</a></h3>
            </li>
            <li class="nLi">
                <h3><a href="<%=path%>/client/swdt">失物大厅</a></h3>
                <%--<ul class="sub">--%>
                <%--    <li><a href="news.html">教育新闻</a></li>--%>
                <%--    <li><a href="news.html">工作动态</a></li>--%>
                <%--</ul>--%>
            </li>
            <li class="nLi">
                <h3><a href="<%=path%>/client/tiezi">校园论坛</a></h3>
            </li>
            <li class="nLi">
                <h3><a href="<%=path%>/client/boards">公告列表</a></h3>
            </li>
            <li class="nLi">
                <h3><a href="schoolmate.html">学友之家</a></h3>
            </li>
        </ul>
    </div>
    <div class="clear"></div>
</div>