<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>edit</td>
        <td>delete</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td><a href="" onclick="editCategory(${c.id})">edit</a></td>
            <td><a href="">delete</a></td>
        </tr>
    </c:forEach>
</table>
<div style="text-align:center">
    <a href="?start=0">首  页</a>
    <a href="?start=${page.start-page.count <= 0 ? 0:page.start-page.count}">上一页</a>
    <a href="?start=${page.start+page.count < page.last ? page.start+page.count : page.last}">下一页</a>
    <a href="?start=${page.last}">末  页</a>
</div>

<form action="updateCategory" method="get">
    <input type="text" id="edit_id" placeholder="id"/>
    <input type="text" id="edit_name" placeholder="name"/>
    <input type="submit" value="提交"/>
</form>
<script type="text/javascript">
    function editCategory(id) {
        $.ajax({
            type:"get",
            url:"<%=request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"%>editCategory",

            data:{"id":id},
            success:function (data) {
                $("#edit_id").val(data.id)
                $("#edit_name").val(data.name)
            }
        })
        alert(url);
    }
</script>