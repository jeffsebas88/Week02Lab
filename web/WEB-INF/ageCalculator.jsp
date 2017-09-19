<%-- 
    Document   : ageCalculator.jsp
    Created on : Sep 18, 2017, 10:44:43 AM
    Author     : 643507
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to the Age Calculator</title>
    </head>
       <body>
    <div>
        <form action ="AgeCalculator" method="POST">
                
            Enter Your Current Age: <input type="number"  name="age" value="${realAge}"><br>
                
                <input type="submit" value="Calculate Next Birthday Age"> 
            </form>
        </div>
        ${errormessage}
       ${sentence} 
       ${realAge}
    </body>
</html>
