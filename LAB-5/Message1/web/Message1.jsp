<%-- 
    Document   : Message1
    Created on : 15 May 2024, 10:20:53 am
    Author     : amirf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@page info="Using JSP Standard Action to call JavaBeans"%>
<%@page import="java.util.Date,lab5.com.Message"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Using JSP Scriplet</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            p{
                color: purple;
                font-family: 'Comic Sans MS', cursive;
                font-size: 20px;
            }
        </style>
    </head>
    <body>
        <h1>Using JSP Scriplet to call JavaBeans</h1>

        <%
            //create an object
            Message objMsg = new Message();

            objMsg.setMsg("Welcome to CSF3107 course...!");
            out.println("<p>" + objMsg.getMsg() + "</p>");
//add date..
            out.println("<p>Current date is " + new java.util.Date() + " </p>");
        %>
    </body>
</html>
