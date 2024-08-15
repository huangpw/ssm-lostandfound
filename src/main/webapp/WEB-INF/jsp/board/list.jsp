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
    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/page.css" media="all">--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" media="all">
</head>
<body>

<div class="layui-card layadmin-header">
    <div class="layui-breadcrumb" lay-filter="breadcrumb">
        <a lay-href="">主页</a>
        <a><cite>公告管理</cite></a>
        <a><cite>公告列表</cite></a>
    </div>
</div>

<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">公告列表</div>
                <div class="layui-card-body">
                    <form action="<%=path%>/board/list" method="post" id="searchForm">
                        <input type="hidden" name="pageNum" id="pageNum">
                        <div class="layui-form-mid">关键词:</div>
                        <div class="layui-input-inline" style="width: 100px;">
                            <input type="text" name="title" placeholder="公告标题" value="${requestScope.record.title}"
                                   style="height:33px;" class="layui-input">
                        </div>

                        <button type="submit" class="layui-btn layui-btn-normal layui-btn-sm">查询</button>
                        <%--批量删除：方式2--%>
                        <button id="delmany" class="layui-btn layui-btn-danger layui-btn-sm" type="button">批量删除</button>

                        <a class="layui-btn layui-btn-normal layui-btn-sm" href="${pageContext.request.contextPath}/board/toAdd" style="text-decoration:none">
                            <i class="layui-icon layui-icon-add-1"></i>新增
                        </a>

                    </form>

                    <table class="layui-table">
                        <thead>
                        <tr>
                            <th>
                                <input type="checkbox" onclick="checkAll()" id="selectall"/>
                            </th>
                            <th>编号</th>
                            <th>标题</th>
                            <%--<th>内容</th>--%>
                            <th>发布日期</th>
                            <th style="text-align: center;">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:if test="${requestScope.pageInfo.list!=null}">
                            <c:forEach items="${requestScope.pageInfo.list}" var="row">
                                <tr>
                                    <td >
                                        <input type="checkbox" name="id" value="${row.id }"/>
                                    </td>
                                    <td class="rowid" style="display: none;">${row.id}</td>
                                    <td>${row.id}</td>
                                    <td>${row.title}</td>
                                    <%--<td>${row.content}</td>--%>
                                    <td>
                                        <fmt:formatDate value="${row.create_time}" pattern="yyyy-MM-dd HH:mm:ss"/>
                                    </td>
                                     <%-- 操作列 --%>
                                    <td style="text-align: center">
                                        <a class="layui-btn layui-btn-primary layui-btn-sm"
                                           href="${pageContext.request.contextPath}/board/detail?id=${row.id}" style="text-decoration:none">
                                            详情
                                        </a>
                                        <a class="layui-btn layui-btn-primary layui-btn-sm"
                                           href="javascript:void(0)" style="text-decoration:none" id="detail">
                                            详情弹窗
                                        </a>
                                        <%--修改--%>
                                        <a class="layui-btn layui-btn-normal layui-btn-sm"
                                           href="${pageContext.request.contextPath}/board/query?id=${row.id}" style="text-decoration:none">
                                            <i class="layui-icon">&#xe642;</i>
                                        </a>
                                        <%--删除：方式二--%>
                                        <a class="layui-btn layui-btn-danger layui-btn-sm layui-delete" href="javascript:void(0)" style="text-decoration:none">
                                            <i class="layui-icon">&#xe640;</i>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </c:if>
                        </tbody>
                    </table>

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
            </div>
        </div>
    </div>

</div>
</div>
<%-- 引入 layui.js --%>
<script src="<%=path %>/static/layuiadmin/layui/layui.js"></script>
<script>
    layui.use(['layer', 'form', 'laydate', 'jquery'], function () {//调用layui组件
        var form = layui.form;
        var layer = layui.layer;
        var laydate = layui.laydate;
        $ = layui.jquery;

        //执行一个laydate实例日期
        laydate.render({
            elem: '#create_date'//指定元素

        });

        form.render();
        // 批量删除数据
        $("#delmany").click(function () {
            var checkbox = false;//默认复选框为空
            $("input[name='id']").each(function () {//获取复选框节点id
                if (this.checked == true) {
                    checkbox = true; //已勾选
                }
            });

            if (checkbox) {
                var obj = document.getElementsByName("id");//将复选框定义成一个jquery对象
                var check_val = [];//定义一个数组
                for (var k in obj) {//k相当于i,往这个jquery对象添加勾选的id;
                    if (obj[k].checked) //选中的都放进 数组里
                        check_val.push(obj[k].value);
                }
                layer.confirm('确认批量删除该记录吗?', {
                    btn: ['是', '否'], btn1: function () {
                        $.ajax({//利用ajax发出请求
                            type: "post",//post类型
                            /*dataType:"text",
                            data:{"ids":check_val},*/
                            url: "${pageContext.request.contextPath}/board/deletemany?ids=" + check_val,
                            success: function (data) {//删除成功后，deleteMany会返回一个"ok";
                                if (data == "ok") {
                                    layer.msg('删除成功', {
                                        icon: 1,
                                        time: 1000 //2秒关闭（如果不配置，默认是3秒）
                                    }, function () {
                                        document.location.reload();
                                    });


                                }

                            }
                        });

                    },
                    btn2: function (index) {
                        layer.close(index);
                    }
                })


            } else {
                layer.alert("你没有选中任何的记录信息！");
                /*	layer.msg("你没有选中任何的记录信息");*/
            }
        });

        // 删除一条数据
        $(".layui-delete").on('click', function () {
            //获取参数
            let rowid = $(this).parents("tr").find(".rowid").text();
            // 提示
            layer.confirm('确认删除本条记录吗?', {
                btn: ['是', '否'], btn1: function () {
                    $.ajax({
                        url: "${pageContext.request.contextPath}/board/delete",
                        type: "POST",
                        data: {'id': rowid},
                        success: function (data) {
                            console.log(data,"删除成功后的返回结果");
                            if (data == "ok") {
                                layer.msg('删除成功', {
                                    offset: ['50%'],
                                    time: 1000 //2秒关闭（如果不配置，默认是3秒）
                                }, function () {
                                    window.location.href = "${pageContext.request.contextPath}/board/list";//相当于刷新界面
                                });

                            } else {
                                layer.msg('删除失败', {
                                    offset: ['50%'],
                                    time: 1000 //2秒关闭（如果不配置，默认是3秒）
                                }, function () {
                                    window.location.href = "${pageContext.request.contextPath}/board/list";//相当于刷新界面
                                });
                            }
                        }
                    });
                },
                btn2: function (index) {
                    layer.close(index);
                }
            })

        });

        <%--function open(id) {--%>
        <%--    layer.open({--%>
        <%--        type: 2,--%>
        <%--        title: '添加',--%>
        <%--        shadeClose: true,--%>
        <%--        shade: false,--%>
        <%--        maxmin: true, //开启最大化最小化按钮--%>
        <%--        area: ['800px', '500px'],--%>
        <%--        content: '${pageContext.request.contextPath}/board/detail?id=' + id--%>
        <%--    })--%>
        <%--}--%>

        $("#detail").click(function () {
            let id = $(this).parents("tr").find(".rowid").text();
            layer.open({
                type: 2,
                area: ['800px', '500px'],
                content: '${pageContext.request.contextPath}/board/detail?id=' + id
            })
        })
    });
</script>
<script language="javascript">
    // 分页查询
    function doPage(pageNo) {
        document.getElementById("pageNum").value = pageNo;
        document.getElementById("searchForm").submit();
    }
    // 全选
    function checkAll(){
        //让所有复选框都选中
        //document.getElementsByName();是根据指定的name属性查询返回多个标签对象集合
        //这个集合的操作跟数组一样
        //集合中每个元素都是dom对象
        //这个集合中的元素顺序是他们在html页面中从上到下的顺序
        var ids = document.getElementsByName("id");
        //checked表示复选框的选中状态，如果选中是true,不选中是false
        //checked这个属性可读，可写
        for(var i=0;i<ids.length;i++){
            /*ids[i].checked=true;*/
            ids[i].checked = !ids[i].checked;
        }
    }
</script>
</body>
</html>