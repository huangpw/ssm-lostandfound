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
        <a><cite>用户管理</cite></a>
        <a><cite>用户列表</cite></a>
    </div>
</div>

<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">用户列表</div>
                <div class="layui-card-body">
                    <form action="/user/list" method="post" id="searchForm">
                        <input type="hidden" name="pageNum" id="pageNum">
                        <%--	<button type="button" onclick="location.href='${pageContext.request.contextPath}/pet/toAdd.action'" class="layui-btn  layui-btn-sm">新增</button>--%>
                        <div class="layui-form-mid">关键词:</div>
                        <div class="layui-input-inline" style="width: 100px;">
                            <input type="text" name="stuno" placeholder="学号" value="${requestScope.record.stuno}"
                                   style="height:33px;" class="layui-input">
                        </div>

                        <div class="layui-input-inline" style="width: 100px;">
                            <input type="text" name="nick_name" placeholder="昵称"
                                   value="${requestScope.record.nick_name}" style="height:33px;" class="layui-input">
                        </div>

                        <button type="submit" class="layui-btn layui-btn-normal layui-btn-sm">查询</button>
                        <%--批量删除：方式1--%>
                        <%--<button id="delmany" class="layui-btn layui-btn-danger layui-btn-sm" onclick="return deleteMany()">批量删除</button>--%>
                        <%--批量删除：方式2--%>
                        <button id="delmany" class="layui-btn layui-btn-danger layui-btn-sm" type="button">批量删除</button>
                    </form>

                    <table class="layui-table">
                        <thead>
                        <tr>
                            <th>
                                <input type="checkbox" onclick="checkAll()" id="selectall"/>
                            </th>
                            <th>昵称</th>
                            <th>头像</th>
                            <th>学号</th>
                            <th>手机号</th>
                            <th>性别</th>
                            <th>省份</th>
                            <th>年级</th>
                            <th>登录密码</th>
                            <th>发布时间</th>
                            <th style="text-align: center;">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:if test="${requestScope.pageInfo.list!=null}">
                            <c:forEach items="${requestScope.pageInfo.list}" var="row">
                                <tr>
                                    <td ><input type="checkbox" name="id" value="${row.id }"/></td>
                                    <td class="rowid" style="display: none;">${row.id}</td>
                                    <td class="filename" style="display: none;">${row.photo}</td>
                                    <td>${row.nick_name}</td>
                                    <td style="width: 80px;text-align: center;">
                                        <img src="${pageContext.request.contextPath}/upload/${row.photo }"
                                             style="width: 60px;height: 60px">
                                    </td>
                                    <td>${row.stuno}</td>
                                    <td>${row.phone}</td>
                                    <td><c:if test="${row.sex==1}">男</c:if>
                                        <c:if test="${row.sex==2}">女</c:if>
                                    </td>
                                    <td>${row.province}</td>
                                    <td>${row.grade}</td>

                                    <td>${vo.pwd}</td>
                                    <td>
                                        <fmt:formatDate value="${row.create_time}" pattern="yyyy-MM-dd HH:mm:ss"/>
                                    </td>
                                        <%-- 操作列 --%>
                                    <td style="text-align: center">
                                        <%--修改--%>
                                        <a class="layui-btn layui-btn-normal layui-btn-sm"
                                           href="${pageContext.request.contextPath}/user/query?id=${row.id}"
                                           style="text-decoration:none"><i class="layui-icon">&#xe642;</i></a>
                                        <%--删除:方式一--%>
                                        <%--<a class="layui-btn layui-btn-danger layui-btn-sm"--%>
                                        <%--   href="javascript:deleteRow(${row.id},'${row.photo}')"--%>
                                        <%--   style="text-decoration:none">--%>
                                        <%--    <i class="layui-icon">&#xe640;</i>--%>
                                        <%--</a>--%>
                                        <%--删除：方式二--%>
                                        <a class="layui-btn layui-btn-danger layui-btn-sm layui-delete"
                                           href="javascript:void(0)"
                                           style="text-decoration:none">
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
    layui.use(['layer', 'form', 'jquery'], function () {//调用layui组件
        var form = layui.form;
        var layer = layui.layer;
        $ = layui.jquery;
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
                            url: "${pageContext.request.contextPath}/user/deletemany?ids=" + check_val,
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
            var rowid = $(this).parents("tr").find(".rowid").text();
            var filename = $(this).parents("tr").find(".filename").text();
            // 提示
            layer.confirm('确认删除本条记录吗?', {
                btn: ['是', '否'], btn1: function () {
                    $.ajax({
                        url: "${pageContext.request.contextPath}/user/delete1",
                        type: "POST",
                        data: {'id': rowid, 'filename': filename},
                        success: function (data) {
                            console.log(data,"删除成功后的返回结果");
                            if (data == "ok") {
                                layer.msg('删除成功', {
                                    offset: ['50%'],
                                    time: 1000 //2秒关闭（如果不配置，默认是3秒）
                                }, function () {
                                    window.location.href = "${pageContext.request.contextPath}/user/list";//相当于刷新界面
                                });

                            } else {
                                layer.msg('删除失败', {
                                    offset: ['50%'],
                                    time: 1000 //2秒关闭（如果不配置，默认是3秒）
                                }, function () {
                                    window.location.href = "${pageContext.request.contextPath}/user/list";//相当于刷新界面
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
    });
</script>
<script language="javascript">
    // 删除
    function deleteRow(id, filename) {
        console.log(id, filename)
        if (confirm('您确定删除该条记录吗？')) {
            window.location.href = "${pageContext.request.contextPath}/user/delete?id=" + id + '&filename=' + filename;
        }
    }
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
    // 批量删除
    function deleteMany(){
        let checkbox=false;//默认复选框为空
        $("input[name='id']").each(function(){//获取复选框节点id
            if (this.checked==true) {
                checkbox=true;    //已勾选
            }
        });
        if (checkbox){//boolean值为true
            var t=confirm("您确认要删除选中的内容吗？");//弹出对话进行警告
            if (t==false) return false;    //不勾选不处理
            obj = document.getElementsByName("id");//将复选框定义成一个jquery对象
            check_val = [];//定义一个数组
            for(k in obj) {//k相当于i,往这个jquery对象添加勾选的id;
                if (obj[k].checked) {//选中的都放进 数组里
                    check_val.push(obj[k].value);
                }
            }
            alert(check_val);
            $.ajax({//利用ajax发出请求
                type:"POST",//post类型
                url:"${pageContext.request.contextPath}/user/deletemany?ids="+check_val,
                success:function(data){//删除成功后，deleteMany会返回一个"ok";
                    alert("删除成功！", data);//返回ok后弹出一个对话框。
                    document.location.reload();//当前页面
                    <%--window.location.href = "${pageContext.request.contextPath}/user/list"--%>
                }
            });
        }
        else{
            alert("请选择您要删除的内容!");//不勾选不提交，弹出警告框。
            return false;
        }
    }

    /*function del(empid){
        var url = "${pageContext.request.contextPath}/deleteEmp?empid=" + empid;
		if(confirm("您确认要删除吗？")){
			location.href = url;
			return true;
		}else{
			return false;
		}
	}*/

</script>
</body>
</html>