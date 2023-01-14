<%--
  Created by IntelliJ IDEA.
  User: Евгений Желев
  Date: 04.01.2023
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Anketa</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/AnketaServlet" method="POST">
    <h1><%="ANKETA"%></h1>
    <br>
    <%="Do you love Java?"%>
    <br>
    <label><input type="radio" name="question1" value="yes" checked> yes</label>
    <br>
    <label><input type="radio" name="question1" value="no"> no</label>

    <br>
    <%="Do you love Python?"%>
    <br>
    <label><input type="radio" name="question2" value="yes" checked> yes</label>
    <br>
    <label><input type="radio" name="question2" value="no"> no</label>

    <br>
    <br>
    <input type="submit" name="submit" value="Подсчитать" />
</form>
    <br>
    Click this link to move <a href="${pageContext.request.contextPath}/">Back</a>

</body>
</html>
