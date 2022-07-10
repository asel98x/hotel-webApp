<%-- 
    Document   : login.jsp
    Created on : Jul 10, 2022, 8:45:35 AM
    Author     : asel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="log" method="post">
		Username: <input type="text" name = "uid"><br>
		Password: <input type = "password" name = "pass"><br>
		
		<input type = "submit" name = "submit" value = "login">
	</form>
    </body>
</html>
