<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();//获得当前的项目根目录路径赋值给path
%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>
<link rel="stylesheet" href="<%=path%>/static/css/page.css" />
<body>
<!--nav start-->
<jsp:include page="/WEB-INF/jsp/common/nav.jsp"></jsp:include>
<!--inside content start-->
<div class="inside_wrap">
    <div class="inside_con">
        <div class="adr">
            <a href="index.html">首页</a>&nbsp;>&nbsp;<a href="<%=path%>/client/boards">公告列表</a>&nbsp;>&nbsp;公告详情
        </div>
        <div class="inside_box">
            <div class="topic_wrap fl">
                <div class="t_label">
                    <%--<div class="tl_tab fl">--%>
                    <%--    <a href="javascript:void(0);" id="hot_week" class="active">本周热门</a>--%>
                    <%--    <a href="javascript:void(0);" id="newest">最新发表</a>--%>
                    <%--</div>--%>
                        <div class="tl_tab fl">
                            <a href="" id="hot_week" class="active"返回列表</a>
                        </div>
                    <div class="search fr">
                        <input type="text" name="topic" id="topic" value="" placeholder="请输入话题名称" class="input_tp" />
                        <button type="button" class="btn">搜索</button>
                    </div>
                </div>
                <div class="tl_con">
                    <h3>${record.title}
                        <span class="addressor">
                        发布者：XXXXXX&nbsp;&nbsp;&nbsp;
                        发布日期：<fmt:formatDate value="${record.create_time}" pattern="yyyy-MM-dd HH:mm:ss"/>&nbsp;&nbsp;&nbsp;
                        </span>
                    </h3>
                    <p>${record.content}</p>
                    <%--<p>冯·雷斯托夫效应告诉我们，某个元素越是违反常理，就越引人注目、令人难忘。Hedwig von Restorff在1933年检验了这个理论。她让实验对象观看一系列相似的物品。如果其中某个很特殊，比如说有聚光灯照射，那么相比其他物品，受试者就更容易回忆起这件物品。这条原则能以多种不同方式应用到设计中。最明显的是如果你想要让某物引人注目，就要使它特殊化，例如通过色彩、尺寸、留白等等。但是，由于人们更在意特殊物体，他们对于整体的印象就不深。思考是否要突出显示某物时，要牢记它的负面效应。你是想要人们记住一件事情，就只有这一件事，还是说其他元素也同样重要？如果所有都同等重要，你希望人们全部记住，就不要凸显其中某个。</p>--%>
                    <%--<p>冯·雷斯托夫效应告诉我们，某个元素越是违反常理，就越引人注目、令人难忘。Hedwig von Restorff在1933年检验了这个理论。她让实验对象观看一系列相似的物品。如果其中某个很特殊，比如说有聚光灯照射，那么相比其他物品，受试者就更容易回忆起这件物品。这条原则能以多种不同方式应用到设计中。最明显的是如果你想要让某物引人注目，就要使它特殊化，例如通过色彩、尺寸、留白等等。但是，由于人们更在意特殊物体，他们对于整体的印象就不深。思考是否要突出显示某物时，要牢记它的负面效应。你是想要人们记住一件事情，就只有这一件事，还是说其他元素也同样重要？如果所有都同等重要，你希望人们全部记住，就不要凸显其中某个。</p>--%>
                    <%--<p>冯·雷斯托夫效应告诉我们，某个元素越是违反常理，就越引人注目、令人难忘。Hedwig von Restorff在1933年检验了这个理论。她让实验对象观看一系列相似的物品。如果其中某个很特殊，比如说有聚光灯照射，那么相比其他物品，受试者就更容易回忆起这件物品。这条原则能以多种不同方式应用到设计中。最明显的是如果你想要让某物引人注目，就要使它特殊化，例如通过色彩、尺寸、留白等等。但是，由于人们更在意特殊物体，他们对于整体的印象就不深。思考是否要突出显示某物时，要牢记它的负面效应。你是想要人们记住一件事情，就只有这一件事，还是说其他元素也同样重要？如果所有都同等重要，你希望人们全部记住，就不要凸显其中某个。</p>--%>
                    <%--<p>冯·雷斯托夫效应告诉我们，某个元素越是违反常理，就越引人注目、令人难忘。Hedwig von Restorff在1933年检验了这个理论。她让实验对象观看一系列相似的物品。如果其中某个很特殊，比如说有聚光灯照射，那么相比其他物品，受试者就更容易回忆起这件物品。这条原则能以多种不同方式应用到设计中。最明显的是如果你想要让某物引人注目，就要使它特殊化，例如通过色彩、尺寸、留白等等。但是，由于人们更在意特殊物体，他们对于整体的印象就不深。思考是否要突出显示某物时，要牢记它的负面效应。你是想要人们记住一件事情，就只有这一件事，还是说其他元素也同样重要？如果所有都同等重要，你希望人们全部记住，就不要凸显其中某个。</p>--%>
                    <%--<p>冯·雷斯托夫效应告诉我们，某个元素越是违反常理，就越引人注目、令人难忘。Hedwig von Restorff在1933年检验了这个理论。她让实验对象观看一系列相似的物品。如果其中某个很特殊，比如说有聚光灯照射，那么相比其他物品，受试者就更容易回忆起这件物品。这条原则能以多种不同方式应用到设计中。最明显的是如果你想要让某物引人注目，就要使它特殊化，例如通过色彩、尺寸、留白等等。但是，由于人们更在意特殊物体，他们对于整体的印象就不深。思考是否要突出显示某物时，要牢记它的负面效应。你是想要人们记住一件事情，就只有这一件事，还是说其他元素也同样重要？如果所有都同等重要，你希望人们全部记住，就不要凸显其中某个。</p>--%>
                    <div class="reply_wrap" id="reply">
                        <div class="r_title">共4个回复</div>
                        <ul class="talk_list">
                            <li class="backview">
                                <div class="det_l">
                                    <a href="ownTopic1.html" class="avatar"><img src="/static/images/favicon.jpg"/></a>
                                </div>
                                <div class="li_cont">
                                    <div class="info">
                                        <span class="i_name"><a href="ownTopic1.html">用户名称</a><span class="date">2016-06-17 14:00</span></span>
                                    </div>
                                    <div class="li_t editor_style">
                                        <p>回复内容</p>
                                    </div>
                                    <div class="info replyinfo">
                                        <span class="replynum"><a href="javascript:void(0);">全部回复(1)</a></span>
                                    </div>
                                    <div class="del_reply_wp">
                                        <ul class="del_repy">
                                            <li class="cl">
                                                <a href="ownTopic1.html" class="avatar"><img src="/static/images/favicon.jpg"/></a>
                                                <div class="cl_cont">
                                                    <div class="info">
                                                        <span class="i_name"><a href="ownTopic1.html">用户名称</a><span class="date">2016-06-17 14:00</span></span>
                                                    </div>
                                                    <div class="li_t editor_style">
                                                        <p>回复内容</p>
                                                    </div>
                                                </div>
                                            </li>
                                        </ul>
                                        <div class="del_reply_input_cl">
                                            <form action="" method="post">
                                                <textarea placeholder="回复XX" name="content" style="height: 68px;"></textarea>
                                                <div class="del_reply_btn">
                                                    <a href="javascript:void(0);" class="cancel">取消</a>
                                                    <button type="submit" class="btn submit_btn">回复</button>
                                                </div>
                                                <div class="clear"></div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="backview">
                                <div class="det_l">
                                    <a href="ownTopic1.html" class="avatar"><img src="/static/images/favicon.jpg"/></a>
                                </div>
                                <div class="li_cont">
                                    <div class="info">
                                        <span class="i_name"><a href="ownTopic1.html">用户名称</a><span class="date">2016-06-17 14:00</span></span>
                                    </div>
                                    <div class="li_t editor_style">
                                        <p>回复内容</p>
                                    </div>
                                    <div class="info replyinfo">
                                        <span class="replynum"><a href="javascript:void(0);">发表回复</a></span>
                                    </div>
                                    <div class="del_reply_wp">
                                        <div class="del_reply_input_cl">
                                            <form action="" method="post">
                                                <textarea placeholder="回复XX" name="content" style="height: 68px;"></textarea>
                                                <div class="del_reply_btn">
                                                    <a href="javascript:void(0);" class="cancel">取消</a>
                                                    <button type="submit" class="btn submit_btn">回复</button>
                                                </div>
                                                <div class="clear"></div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div class="editor">
                        <div class="avatar">
                            <a href="javascript:void(0)";><img src="/static/images/favicon.jpg"/></a>
                        </div>
                        <section id="editor">
                            <div id='edit'></div>
                        </section>
                        <button type="submit" class="btn submit_btn">发表</button>
                    </div>
                </div>
            </div>
            <div class="topic_list fr">
                <a href="public.html"><button type="button" class="btn">发布话题</button></a>
                <div class="lively_user">
                    <h4>活跃用户</h4>
                    <ul>
                        <li>
                            <div class="h_img">
                                <a href="ownTopic1.html"><img src="/static/images/favicon.jpg" /></a>
                            </div>
                            <div class="h_text">
                                <b><a href="ownTopic1.html">用户名称</a></b>
                                <p>发表了10个主题</p>
                                <p>发表了110个评论</p>
                            </div>
                        </li>
                        <li>
                            <div class="h_img">
                                <a href="ownTopic1.html"><img src="/static/images/favicon.jpg" /></a>
                            </div>
                            <div class="h_text">
                                <b><a href="ownTopic1.html">用户名称</a></b>
                                <p>发表了10个主题</p>
                                <p>发表了110个评论</p>
                            </div>
                        </li>
                        <li>
                            <div class="h_img">
                                <a href="ownTopic1.html"><img src="/static/images/favicon.jpg" /></a>
                            </div>
                            <div class="h_text">
                                <b><a href="ownTopic1.html">用户名称</a></b>
                                <p>发表了10个主题</p>
                                <p>发表了110个评论</p>
                            </div>
                        </li>
                        <li>
                            <div class="h_img">
                                <a href="ownTopic1.html"><img src="/static/images/favicon.jpg" /></a>
                            </div>
                            <div class="h_text">
                                <b><a href="ownTopic1.html">用户名称</a></b>
                                <p>发表了10个主题</p>
                                <p>发表了110个评论</p>
                            </div>
                        </li>
                        <li>
                            <div class="h_img">
                                <a href="ownTopic1.html"><img src="/static/images/favicon.jpg" /></a>
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
    layui.use(['form','upload','jquery','laydate','layedit'], function() {
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
</script>
<script>


    function doPage(pageNo) {
        document.getElementById("pageNum").value = pageNo;
        document.getElementById("searchForm").submit();
    }
    function changePageSize(cur_pageSize){
        document.getElementById("pageSize").value=cur_pageSize;
        document.getElementById("searchForm").submit();//表单提交
    }
</script>
</body>
</html>
