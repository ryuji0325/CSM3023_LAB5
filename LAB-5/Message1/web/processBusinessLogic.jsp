<%-- 
    Document   : processBusinessLogic
    Created on : 22 May 2024, 8:33:27 pm
    Author     : amirf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@page import="lab5.com.businnessLogic"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rahim Details</title>
    </head>
    <body>
        <h1>Rahim Share Details</h1>
        <%
            businnessLogic rbl=new businnessLogic(Double.parseDouble(request.getParameter("share")),Double.parseDouble(request.getParameter("price")));
            
                    %>
                    <p>Total Shares of Stock : RM<%=rbl.getShare()%></p>
                    <p>Price per Share : RM<%=rbl.getPrice()%></p>
                    <p>Amount Paid (No commission) :  RM<%=rbl.getAmountpaid()%></p>
                    <p>Amount Commision (Only) :  RM<%=rbl.getCommision()%></p>
                    <p>Total Amount Paid (Amount paid + commission) :  RM<%=rbl.getTotal()%></p>
                    
    </body>
</html>
