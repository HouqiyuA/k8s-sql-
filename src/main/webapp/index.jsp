<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
</h1>
<br/>

<form action = "./login" method = "post">
    <table>
        <tr>
            <td> 用户名; </td>
            <td>  <input type = "text" name = "username"> </td>
        </tr>

        <tr>
            <td> 密码; </td>
            <td>  <input type = "password" name = "password"> </td>
        </tr>

        <tr>
            <td>  <input type = "submit" value = "提交">
                <input type = "reset" value = "重置">
            </td>
        </tr>
    </table>
</form>
<form action = "./find" method = "get">
    <table>
        <tr>
            <td> id: </td>
            <td>  <input type = "text" name = "id"> </td>
        </tr>
        <tr>
            <td>  <input type = "submit" value = "提交">
                <input type = "reset" value = "重置">
            </td>
        </tr>
    </table>
</form>
<form action = "./upload" method = "get">
    <table>
        <tr>
            <td> 头像 <input type = "file" name = "photo"> </td>
        </tr>
        <tr>
            <td>  <input type = "submit" value = "上传">
            </td>
        </tr>
    </table>
</form>
</body>
</html>