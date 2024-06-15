<%-- 
    Document   : business
    Created on : 22 May 2024, 8:33:03 pm
    Author     : amirf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            label{
                width:200px;
                display:inline-block;
            }
            </style>
            
            
    </head>
    <body>
        <fieldset>
            <legend>Rahim Stock</legend>
            <form action="processBusinessLogic.jsp" method="post" onsubmit="return calculation()">
                <label for="sos">Quantity Shares of Stocks</label>
                <input type="number" id="share" name="share" required><br/><br/>
                <label for="price">Price per Share</label><!-- comment -->
                <input type="number"  id="price" name="price" max="1000000" min="0" step="0.01" required placeholder="In MYR"><br/><br/><!-- comment -->
                <input type="submit" value="Submit"><!-- comment -->
                <input type="reset" value="Cancel">
            </form>
                
        </fieldset>
    </body>
</html>