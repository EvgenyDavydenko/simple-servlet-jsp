<%@page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello Servlet and JSP</title>
</head>
<body>
    <h1>Hello Servlet and JSP</h1>
    <%
    String userAgent = request.getHeader("user-agent");
    out.println("user-agent: " + userAgent);
    %>
    <br/>
    <br/>
    <form action="/simple-servlet-jsp/hello" method="get">
        <label for="">Введите Ваше имя:</label>
        <input type="text" name="username" id="">
        <button type="submit">Say Hello</button>
    </form>
</body>
</html>