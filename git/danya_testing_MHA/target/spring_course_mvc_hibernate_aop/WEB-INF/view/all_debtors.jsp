<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html align="center" style="font-size: 18px">
<head>
    <title>Title</title>
</head>
<body>
    <h2>        All Debtors    </h2>

    <table align="center" style="font-size: 18px" border="1">
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Patronymic</th>
            <th>Debt value</th>
            <th>Operations</th>
        </tr>
        <c:forEach var="dbt" items="${allDebts}">

            <c:url var = "deleteButton" value="/deleteDebtors">
                <c:param name="dbtId" value="${dbt.id}"/>
            </c:url>

            <tr>
                <td>${dbt.name}</td>
                <td>${dbt.surname}</td>
                <td>${dbt.patronymic}</td>
                <td>${dbt.debtor_val}</td>
                <td>
                    <input type="button" value="Delete"
                           onclick = "window.location.href = '${deleteButton}'">
                </td>
            </tr>
        </c:forEach>
    </table>
<br>

<input type="button" value="Добавить нового должника"
    onclick="window.location.href = 'addNewDebtors'"/>
<input type="button" name = "ShowDebtors" value="Показать активных должников"
           onclick="window.location.href = 'showDebtors'"/>
<input type="button" name = "ShowAllDebtors"  value="Показать всех должников"
       onclick="window.location.href = '/danya/'"/>

<%--    <form action="#" data-th-action="@{/}" method="post">--%>
<%--        <input type="hidden"/>--%>
<%--        <button type="submit" name="action" value="Accept">Accept</button>--%>
<%--        <button type="submit" name="action" value="Reject">Reject</button>--%>
<%--    </form>--%>

</body>
</html>
