<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">

<head>
    <meta charset="utf-8">
    <title>添加</title>
    <script type="text/javascript" src="jquery-1.8.3.js"></script>
    <script type="text/javascript">
        $(function() {
            $("form").submit(
                function() {
                    if ($(":text:eq(0)").val() == "")
                    {
                        //表单选择器,    :input标签type属性值
                        alert("BUG标题为空!");
                        //阻止默认行为
                        return false;
                    }
                })
        });

    </script>
</head>

<body style="text-align: center">
<form action="addDetails" method="post">
    <table border="1" align="center">
        <tr>
            <td colspan="2">增加BUG</td>
        </tr>
        <tr>
            <td>所属项目</td>
            <td>
              <select name="pid">
                    <#list userList as u>
                        <option value="${u.id}" >${u.name}</option>
                    </#list>
                </select>

            </td>
        </tr>
        <tr>
            <td>严重性</td>
            <td><select name="severity">
                    <option value="10">文字错误</option>
                    <option value="20">次要错误</option>
                    <option value="30">严重错误</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>BUG标题</td>
            <td>
                <input name="title" type="text" >
            </td>
        </tr>
        <tr>
            <td>报告人</td>
            <td>
                <input name="user">
            </td>
        </tr>
        <tr style="text-align: center;">
            <td colspan="2">
                <input type="submit" value="提交" >
                <input type="reset" value="返回">
            </td>
        </tr>
    </table>

</form>

</body>
</html>