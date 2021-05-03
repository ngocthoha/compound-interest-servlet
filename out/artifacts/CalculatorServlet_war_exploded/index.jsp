<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/3/2021
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home</title>
  </head>
  <body>
  <h1>Compound Interest Formula</h1>
  <p>${error}</p>
  <form action="/" method="post">
      <label for="principal-amount">Principal Amount</label><br>
      <input id="principal-amount" type="number" name="principleAmount" value="${principle}"><br>

      <label for="interest">Interest Percentage</label><br>
      <input id="interest" type="number" min="1" max="100" name="interestPercentage" value="${interest}"><br>

      <label for="years">Years</label><br>
      <input id="years" type="number" name="years" value="${years}"><br>

      <label for="compounding-period">Times per Year</label><br>
      <input id="compounding-period" type="number" min="1" max="12" name="compoundingPeriod" value="${compound}"><br>
      <button type="submit">Calculator</button>

      <p>Result: ${result}</p>
  </form>
  </body>
</html>
