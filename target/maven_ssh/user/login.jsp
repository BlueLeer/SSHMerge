<%--
  Created by IntelliJ IDEA.
  User: KingIsHappy
  Date: 2018/4/27
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript">
        function checkInput() {
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;

            if (username == '') {
                alert("用户名不能为空!");
                return false;
            }

            if (password == '') {
                alert("密码不能为空!");
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
<a href="${pageContext.request.contextPath}/user/login.action">登录</a><br>

<form action="${pageContext.request.contextPath}/user/login.action" onsubmit="return checkInput()">
    用户名:<input type="text" name="userName" id="username"/><br>
    密 码:<input type="text" name="password" id="password"/><br>
    <button type="submit" name="btn_submit" id="btn_submit">登录</button>
</form>

</body>
</html>
