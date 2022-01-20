<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2022/1/20
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>apple!</title>
</head>
<body>
    <h6>我的apple</h6>
    <form action="reg" method="get">
        <table>
            <tr>
                <td>id</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>学号</td>
                <td><input type="text" name="stdno"></td>
            </tr>
            <tr>
                <td>名字</td>
                <td><input type="text" name="stdname"></td>
            </tr>
            <tr>
                <td>教室</td>
                <td><input type="text" name="classno"></td>
            </tr>
            <td><input type="submit" value="提交"></td>
        </table>
    </form>
</body>
</html>
