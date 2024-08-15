<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>
<link rel="stylesheet" href="<%=path%>/static/css/page.css"/>
<body>
<!--nav start-->
<jsp:include page="/WEB-INF/jsp/common/nav.jsp"></jsp:include>
<!--inside content start-->
<div class="inside_wrap">
    <div class="inside_con">
        <div class="adr">
            <a href="index.html">首页</a>&nbsp;>&nbsp;校园论坛
        </div>
        <div class="inside_box">
            <div class="topic_wrap fl">
                <div class="t_label">
                    <%--<div class="tl_tab fl">--%>
                    <%--    <a href="" id="hot_week" class="active">本周热门</a>--%>
                    <%--    <a href="" id="newest">最新发表</a>--%>
                    <%--</div>--%>
                    <div class="tl_tab fl">
                        <a href="" id="hot_week" class="active"返回首页</a>
                    </div>
                    <div class="search fr">
                        <form action="<%=path%>/board/list" method="post" id="searchForm">
                            <input type="text" name="title" id="title" value="" placeholder="请输入公告标题" class="input_tp"/>
                            <input type="hidden" name="pageNum" id="pageNum">
                            <input type="hidden" name="pageSize" id="pageSize" value="${pageInfo.pageSize }">
                            <button type="button" class="btn">搜索</button>
                        </form>
                    </div>
                </div>
                <div class="tl_list">
                    <ul>
                        <c:if test="${requestScope.pageInfo.list!=null}">
                            <c:forEach items="${requestScope.pageInfo.list}" var="row">
                                <li>
                                    <a href="tDetail.html#reply" class="reply">10回复</a>
                                    <div class="t_con">
                                        <h3>
                                            <a href="<%=path%>/board/detail2?id=${row.id}">${ row.title }</a>
                                            <span class="addressor">发布者：XXXXX&nbsp;&nbsp;&nbsp;发布日期：<fmt:formatDate value="${row.create_time}" pattern="yyyy-MM-dd HH:mm:ss"/>&nbsp;&nbsp;&nbsp;</span>
                                        </h3>
                                            <%--<p>话题内容话题内容话题内容话题内容话，题内容话题内容话题内容话题内容，话题内容话题内容话题内容话题内容话题，内容话题内容话题内容话题内容话题内容话。题内容话题内容话题内容话题内容话题内容...</p>--%>
                                    </div>
                                </li>
                            </c:forEach>
                        </c:if>
                    </ul>
                </div>
                <!--分页-->
                <%--<div class="record">--%>
                <%--    <span class="prev"><a href="">上一页</a></span>--%>
                <%--    <span class="word"><a href="">1</a></span>--%>
                <%--    <span class="word"><a href="">2</a></span>--%>
                <%--    <span class="word"><a href="">3</a></span>--%>
                <%--    <span class="word"><a href="">4</a></span>--%>
                <%--    <span class="word"><a href="">5</a></span>--%>
                <%--    <span class="word"><a href="">6</a></span>--%>
                <%--    <span class="next"><a href="">下一页</a></span>--%>
                <%--    <span class="sum">共6页</span>--%>
                <%--</div>--%>
                <nav aria-label="Page navigation" style="text-align: center">
                    <ul class="pagination">
                        <li>
                            <a href="javascript:doPage(1)" aria-label="Previous">
                                <span aria-hidden="true">首页</span>
                            </a>
                        </li>
                        <c:if test="${requestScope.pageInfo.pageNum>1}">
                            <li><a href="javascript:doPage(${requestScope.pageInfo.pageNum -1})">上一页</a></li>
                        </c:if>
                        <c:if test="${requestScope.pageInfo.pageNum<requestScope.pageInfo.pages}">
                            <li><a href="javascript:doPage(${requestScope.pageInfo.pageNum +1})">下一页</a></li>
                        </c:if>
                        <li><a href="#" disabled>${requestScope.pageInfo.pageNum}/${requestScope.pageInfo.pages}页</a></li>
                        <li>
                            <a href="javascript:doPage(${requestScope.pageInfo.pages})" aria-label="Next">
                                <span aria-hidden="true">末页</span>
                            </a>
                        </li>
                        <li>
                            <a> 共 ${requestScope.pageInfo.total} 条记录</a>
                        </li>
                    </ul>
                </nav>
            </div>
            <div class="topic_list fr">
                <a href="public.html">
                    <button type="button" class="btn">发布话题</button>
                </a>
                <div class="lively_user">
                    <h4>活跃用户</h4>
                    <ul>
                        <li>
                            <div class="h_img">
                                <a href="ownTopic1.html"><img src="images/favicon.jpg"/></a>
                            </div>
                            <div class="h_text">
                                <b><a href="ownTopic1.html">用户名称</a></b>
                                <p>发表了10个主题</p>
                                <p>发表了110个评论</p>
                            </div>
                        </li>
                        <li>
                            <div class="h_img">
                                <a href="ownTopic1.html"><img src="images/favicon.jpg"/></a>
                            </div>
                            <div class="h_text">
                                <b><a href="ownTopic1.html">用户名称</a></b>
                                <p>发表了10个主题</p>
                                <p>发表了110个评论</p>
                            </div>
                        </li>
                        <li>
                            <div class="h_img">
                                <a href="ownTopic1.html"><img src="images/favicon.jpg"/></a>
                            </div>
                            <div class="h_text">
                                <b><a href="ownTopic1.html">用户名称</a></b>
                                <p>发表了10个主题</p>
                                <p>发表了110个评论</p>
                            </div>
                        </li>
                        <li>
                            <div class="h_img">
                                <a href="ownTopic1.html"><img src="images/favicon.jpg"/></a>
                            </div>
                            <div class="h_text">
                                <b><a href="ownTopic1.html">用户名称</a></b>
                                <p>发表了10个主题</p>
                                <p>发表了110个评论</p>
                            </div>
                        </li>
                        <li>
                            <div class="h_img">
                                <a href="ownTopic1.html"><img src="images/favicon.jpg"/></a>
                            </div>
                            <div class="h_text">
                                <b><a href="ownTopic1.html">用户名称</a></b>
                                <p>发表了10个主题</p>
                                <p>发表了110个评论</p>
                            </div>
                        </li>
                    </ul>
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
<script src="${pageContext.request.contextPath}/static/layuiadmin/layui/layui.js"></script>
<script>
    //Demo
    layui.use(['form', 'upload', 'jquery', 'laydate', 'layedit'], function () {
        var $ = layui.$
            , upload = layui.upload
            , form = layui.form
            , laydate = layui.laydate
            , layedit = layui.layedit;

        //执行一个laydate实例
        laydate.render({
            elem: '#create_date'//指定元素

        });
    });
    // 分页查询
    function doPage(pageNo) {
        document.getElementById("pageNum").value = pageNo;
        document.getElementById("searchForm").submit();
    }
</script>
<script>


    function doPage(pageNo) {
        document.getElementById("pageNum").value = pageNo;
        document.getElementById("searchForm").submit();
    }

    function changePageSize(cur_pageSize) {
        document.getElementById("pageSize").value = cur_pageSize;
        document.getElementById("searchForm").submit();//表单提交
    }
</script>
</body>
</html>
