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
            <a href="index.html">首页</a>&nbsp;>&nbsp;失物大厅&nbsp;>&nbsp;失物详情 <a href="<%=path%>/client/swdt">返回</a>
        </div>
        <div class="inside_box">
            <div class="ic_wrap " style="width: 1100px;">
                <%--<h3 class="e_title">失物名称: ${record.goods_name}</h3>--%>
                <%--<p>物品图片: <img src="${pageContext.request.contextPath}/upload/${record.gods_img }"--%>
                <%--             style="width: 80px;height: 80px"></p>--%>
                <%--<p>拾到地点: ${record.spot}</p>--%>
                <%--<p>拾到日期: ${record.create_date}</p>--%>
                <%--<p>备注: ${record.note}</p>--%>

                <table class="layui-table">
                    <thead>
                    <tr>
                        <th>标题</th>
                        <th>内容</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>失物图片</td>
                        <td>
                            <img src="${pageContext.request.contextPath}/upload/${record.gods_img }"
                                 style="width: 80px;height: 80px">
                        </td>
                    </tr>
                    <tr>
                        <td>失物名称</td>
                        <td>${record.goods_name}</td>
                    </tr>
                    <tr>
                        <td>拾到地点</td>
                        <td>${record.spot}</td>
                    </tr>
                    <tr>
                        <td>拾到日期</td>
                        <td>${record.create_date}</td>
                    </tr>
                    <tr>
                        <td>备注</td>
                        <td>${record.note}</td>
                    </tr>
                    <tr>
                        <td>操作</td>
                        <td>
                            <a class="layui-btn layui-btn-normal layui-btn-sm" href="${pageContext.request.contextPath}/goods/toAdd" style="text-decoration:none">
                                认领
                            </a>
                        </td>
                    </tr>
                    </tbody>
                </table>
                <div>
                    详情信息: ${record.detail}
                </div>
            </div>
            </div><div class="clear"></div>
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
