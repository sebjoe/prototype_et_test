<%-- 
    Document   : nameView
    Created on : Jun 18, 2015, 10:34:17 AM
    Author     : sebastien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <spring:nestedPath path="name">
                <form action="" method="post">
                    Name:
                        <spring:bind path="value">
                        <input type="text" name="${status.expression}" value="${status.value}">
                        </spring:bind>
                        <input type="submit" value="OK">
                        </form>
            </spring:nestedPath>
        </h1>
    </body>
</html>
