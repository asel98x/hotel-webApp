<%-- 
    Document   : useraccount.jsp
    Created on : Jul 10, 2022, 9:18:58 AM
    Author     : asel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="cus" items = "${cusDetails }">

            ${cus.id}
            ${cus.name}
            ${cus.email}
            ${cus.userName}
            ${cus.password}


        </c:forEach>
    </body>
</html>
