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
            <a href="index.html">首页</a>&nbsp;>&nbsp;失物大厅&nbsp;
        </div>
        <div>
        <form action="<%=path%>/client/swdt" method="post" id="searchForm">
            <input type="hidden" name="pageNum" id="pageNum">
            <div class="layui-form-mid">关键词:</div>
            <div class="layui-input-inline" style="width: 100px;">
                <input type="text" name="goods_name" placeholder="失物名称" value="${requestScope.record.goods_name}" style="height:33px;"  class="layui-input">
            </div>

            <div class="layui-input-inline" style="width: 100px;">
                <input type="text" name="create_date" placeholder="拾到日期" id="create_date" value="${requestScope.record.create_date}" style="height:33px;"  class="layui-input">
            </div>
            <%--   <input type="hidden" name="pageNum" id="pageNum" />--%>
            <input type="hidden" name="pageSize" id="pageSize" value="${pageInfo.pageSize }">

            <button type="submit" class="layui-btn layui-btn-normal layui-btn-sm">查询</button>


        </form>
            <br>
        </div>
        <div class="inside_box">
            <%--LEft--%>
         <%--   <jsp:include page="/WEB-INF/jsp/common/left.jsp"></jsp:include>--%>

            <div class="ic_wrap " style="width: 1100px;">

                <ul class="img_list sc_list">

                <c:if test="${requestScope.pageInfo.list!=null}">

                    <c:forEach items="${requestScope.pageInfo.list}" var="row">
                        <li>
                            <a href="<%=path%>/goods/detail?id=${row.id}">
                                <img src="<%=path%>/upload/${row.gods_img}"/>
                                <span>${row.goods_name}</span>
                            </a>
                        </li>
                    </c:forEach>
                </c:if>
                </ul>

                <!--分页-->

            </div>
                <div class="pagelist" style="padding-bottom: 20px;text-align: center;">
                    <%-- <span class="prev"><a href="">上一页</a></span>
                     <span class="word"><a href="">1</a></span>
                     <span class="word"><a href="">2</a></span>
                     <span class="word"><a href="">3</a></span>
                     <span class="word"><a href="">4</a></span>
                     <span class="word"><a href="">5</a></span>
                     <span class="word"><a href="">6</a></span>
                     <span class="next"><a href="">下一页</a></span>
                     <span class="sum">共6页</span>--%>
                    <c:if test="${requestScope.pageInfo.list.size()!=null}">
                        <div  class="pagelist">
                            共有${pageInfo.total }条记录共${pageInfo.pages }页，每页
                            <select name="pageSize" onchange="changePageSize(this.value)" style="width: 50px;">
                                <option value="5" ${pageInfo.pageSize==5?"selected":"" }>5</option>
                                <option value="10"  ${pageInfo.pageSize==10?"selected":"" }>10</option>
                                <option value="15"  ${pageInfo.pageSize==15?"selected":"" }>15</option>
                                <option value="20"   ${pageInfo.pageSize==20?"selected":"" }>20</option>
                            </select>

                            <a  href="javascript:doPage(1)">首页</a>

                            <a href="javascript:doPage(${requestScope.pageInfo.pageNum -1})">上一页</a>

                            <c:if test="${pageInfo.pageNum<pageInfo.pages}">
                                <a href="javascript:doPage(${requestScope.pageInfo.pageNum +1})">下一页</a>
                            </c:if>
                            <a href="javascript:doPage(${requestScope.pageInfo.pages})">尾页</a>

                            转到 <select name="pageNum" onchange="doPage(this.value)" style="width: 50px;">
                            <c:forEach begin="1" end="${pageInfo.pages }" var="i">
                                <option class="option" value=${i }  ${pageInfo.pageNum==i?"selected":"" }>${i }</option>
                            </c:forEach>

                        </select>


                        </div>
                    </c:if>
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
