<%-- 
    Document   : circle
    Created on : 22 May 2024, 8:30:37 pm
    Author     : amirf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Calculate Area of Circle and it's perimeter</h1>
        
        <form action="circleProcess.jsp">
            <fieldset>
                <legend>Parameter Input</legend>
                <label for="rad" style="margin-right: 20px">Radius of the Circle : </label>
                <input type="number" name="rad">
                <br>
                <input type="submit" name="Submit">
                <input type="reset" name="reset">
            </fieldset>
        </form>
        
    </body>
</html>
