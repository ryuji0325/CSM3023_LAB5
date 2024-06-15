<%-- 
    Document   : jstlCore1
    Created on : 15 May 2024, 11:49:43 am
    Author     : amirf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Using JSTL tag library</title>
        <style>
            p{
                color: palevioletred;
                font-family: 'Comic Sans MS', cursive;
             
            }
        </style>
    </head>
    <body>
        <h1>Use JSTL's features</h1>
        <c:set var="message" value="Welcome to CSF3107 -Web Programming courses...!"/>
        <p> <c:out value="${message}"/> </p>
    </body>
</html>
