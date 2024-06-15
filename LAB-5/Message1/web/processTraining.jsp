<%-- 
    Document   : processTraining
    Created on : 15 May 2024, 11:00:22 am
    Author     : amirf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Training Registration</title>
        <style>
        p{
                color: blue;
                font-family: 'Comic Sans MS', cursive;
                font-size: 20px;
            }
            </style>
    </head>
    <body>
        <h1>Training Registration Acknowledgement</h1>

        <%
            //retrieve the parameters from the form
            String icNo = request.getParameter("ic");
            String Name = request.getParameter("Name");
            int type = Integer.parseInt(request.getParameter("type"));
            int pax = Integer.parseInt(request.getParameter("noPax"));
            int student = Integer.parseInt(request.getParameter("student"));

            double fee = 0;
            double amount;
            double discount = 0.1;
            String typeOfTrain = "";

            if (student == 1) {
                if (type == 1) {
                    fee = 3000 -(discount * 3000);
                    typeOfTrain = "C++";
                } else if (type == 2) {
                    fee = 3000 - (discount * 3000);
                    typeOfTrain = "Java";
                } else if (type == 3) {
                    fee = 2800 - (discount * 2800);
                    typeOfTrain = "HTML5";
                } else if (type == 4) {
                    fee = 5500 - (discount * 5500);
                    typeOfTrain = "Java EEE";
                } else if (type == 5) {
                    fee = 3200 - (discount * 3200);
                    typeOfTrain = "Android Programming";
                }
            } else {
                if (type == 1) {
                    fee = 3000;
                    typeOfTrain = "C++";
                } else if (type == 2) {
                    fee = 3000;
                    typeOfTrain = "Java";
                } else if (type == 3) {
                    fee = 2800;
                    typeOfTrain = "HTML5";
                } else if (type == 4) {
                    fee = 5500;
                    typeOfTrain = "Java EEE";
                } else if (type == 5) {
                    fee = 3200;
                    typeOfTrain = "Android Programming";
                }
            }

            amount = pax * fee;
        %>
        
        
        <%
        // Output the results
        out.println("<p>IC No: " + icNo + "</p>");
        out.println("<p>Name: " + Name + "</p>");
        out.println("<p>Type of Training: " + typeOfTrain + "</p>");
        out.println("<p>Number of Pax: " + pax + " person/s</p>");
        out.println("<p>Student: " + (student == 1 ? "Yes" : "No") + "</p>");
        out.println("<p>Amount Due :Rm" + String.format("%.2f", amount) + "</p>");
        %>
    </body>
</html>
