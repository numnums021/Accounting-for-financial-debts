<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html align="center" style="font-size: 18px">
<head>
    <title>Debtors Info</title>
    <h2>        Add info debtors    </h2>
</head>
<body>
    <form:form action="saveDebtors" modelAttribute="debtors" align="center" style="font-size: 18px">

        <%--скрытая форма--%>
        <form:hidden path="id"/>

        Name<form:input path="name"/>
        <br><br>
        surname<form:input path="surname"/>
        <br><br>
        Patronymic<form:input path="patronymic"/>
        <br><br>
        Debtor value<form:input path="debtor_val"/>
        <br><br>
        <input type="submit" value="Ok">
    </form:form>
</body>
</html>
