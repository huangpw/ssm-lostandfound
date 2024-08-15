<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<html>
<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>
<body>
<!--header start-->
<jsp:include page="/WEB-INF/jsp/common/nav.jsp"></jsp:include>

<!--inside content start-->
<div class="inside_wrap">
    <div class="inside_con">
        <div class="adr">
            <a href="index.html">首页</a>&nbsp;>&nbsp;考试必备&nbsp;>&nbsp;考试安排
        </div>
        <div class="inside_box">
            <jsp:include page="/WEB-INF/jsp/common/left.jsp"></jsp:include>

            <div class="ic_wrap fr">
                <ul class="news_list">
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                    <li><a href="eDetail.html">课程名称课程名称课程名称课程名称</a></li>
                </ul>
                <!--分页-->
                <div class="record">
                    <span class="prev"><a href="">上一页</a></span>
                    <span class="word"><a href="">1</a></span>
                    <span class="word"><a href="">2</a></span>
                    <span class="word"><a href="">3</a></span>
                    <span class="word"><a href="">4</a></span>
                    <span class="word"><a href="">5</a></span>
                    <span class="word"><a href="">6</a></span>
                    <span class="next"><a href="">下一页</a></span>
                    <span class="sum">共6页</span>
                </div>
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
</body>
</html>
