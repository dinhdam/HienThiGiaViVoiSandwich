<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/25/2018
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <h1> Sandwich Condiments</h1>
  <form method ="post">
    <label for="lec">Lettuce</label>
    <input type ="checkbox" name = "condiment" id="lec" value = "Lettuce" />
    <label for="to">Tomato</label>
    <input type ="checkbox"name ="condiment" id ="to" value="Tomato"/>
    <label for="mu">Mustard</label>
    <input type = "checkbox"name ="condiment" id="mu" value ="Mustard"/>
    <label for="sp">Sprouts</label>
    <input type ="checkbox" name ="condiment" id="sp" value="Sprouts"/>
    <br>

    <td></td><button type="submit">Save</button></td>
  </br>
    ${say} ${result}
</form>
  </body>
</html>
