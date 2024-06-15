<%-- 
    Document   : registerTraining
    Created on : 15 May 2024, 10:43:21 am
    Author     : amirf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            label {
                width: 150px;
                display: inline-block;
                margin-bottom: 10px;
            }
        </style>
    </head>
    <body>
        <h1>Register IT Training</h1>
        <h1>Insurance Quotation</h1>
        <form action="processTraining.jsp" method="post">
            <fieldset>
                <legend>Training Registration</legend>
                <label for="icNo">ICNo*</label>
                <input type="text" id="icNo" name="ic" size="15" placeholder="E.g 821201-05-3478"><br>
                <label for="name">Name</label>
                <input type="text" id="name" name="Name" placeholder="Enter your name"><br>
                <label for="trainType">Type of Training</label>
                <select name="type" id="trainType">
                    <option value="1">C++ training</option>
                    <option value="2">Java</option>
                    <option value="3">HTML5</option>
                    <option value="4">Java EEE</option>
                    <option value="5">Android Programming</option>
                </select><br>
                <label for="noPax">No of Pax</label>
                <input type="text" id="noPax" name="noPax" placeholder="No of pax"><br>

                <label for="studentYes">Student</label>
                <input type="radio" id="studentYes" name="student" value="1">
                <label for="studentYes">Yes</label>
                <input type="radio" id="studentNo" name="student" value="2">
                <label for="studentNo">No</label><br>
                <input type="submit" value="Submit"><!-- comment -->
                <input type="reset" value="Cancel">
            </fieldset>
        </form>
        <footer><p>&#169 2016-Mohamad Nor;</p></footer>
    </body>
</html>
