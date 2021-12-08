<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">

<head>
    <meta charset="utf-8">
    <title>index</title>

</head>

<body style="text-align: center">
<form action="/" method="post">
    所属项目：<select name="pid">
        <option value="0">全部</option>
        <#list userList as u>
            <#if pid==u.id>
                <option value="${u.id?c}" selected>${u.name }</option>
            <#else >
                 <option value="${u.id?c}" >${u.name}</option>
            </#if>
        </#list>
    </select>

    <input type="submit" value="搜索" onclick="m1(${u.id})">
</form>
    <a href="addUser"><span>添加BUG</span></a>
    <table border="1" align="center">
        <tr style="text-align: center;" height="100px">
            <td colspan="5" >BUG列表</td>

        </tr>
        <tr style="background-color: red">
            <td>BUG编号</td>
            <td>严重性</td>
            <td>标题</td>
            <td>报告人</td>
            <td>报告时间</td>
        </tr>
        <#list detailList as d>
            <tr>
                <td>${d.projectId}</td>
                <td>
                    <#if d.severity==10>
                        文字错误
                     <#elseif  d.severity==20>
                         次要错误
                     <#else >
                        严重错误
                    </#if>
                </td>
                <td>${d.title}</td>
                <td>${d.reportUser}</td>
                <td>${d.createDate}</td>
            </tr>

        </#list>

    </table>


</body>
</html>