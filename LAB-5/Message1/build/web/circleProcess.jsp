<%-- 
    Document   : circleProcess
    Created on : 22 May 2024, 8:30:49 pm
    Author     : amirf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Result : </h1>
        <c:set var="rad" value="${param.rad}" />
        <c:set var="area" value="${rad*rad*3.142}" />
        <c:set var="peri" value="${2*3.142*rad}" />
        <p>
            Area of The Circle: 
            <strong>
                <fmt:formatNumber type="number" maxFractionDigits ="3" value="${area}"/>
            </strong>
        </p>
        <p>
            Perimeter of The Circle: 
            <strong>
                <fmt:formatNumber type="number" maxFractionDigits ="3" value="${peri}"/>
            </strong>
        </p>
    </body>
</html>