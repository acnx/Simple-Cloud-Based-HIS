<%@ page import="java.util.List" %><%--
  User: Jayce
  Date: 2020/5/14
  Time: 14:57
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>

        table{
            border: solid 1px black;
            border-collapse: collapse;
        }
        th,td{
            border: solid 1px black;
            padding: 5px 10px;
        }
    </style>
</head>
<body>

<%--<%=--%>
<%--request.getAttribute("data")--%>
<%--%>--%>

<table>
    <thead>
    <tr>
        <th>sno</th>
        <th>name</th>
        <th>height</th>


    </tr>
    </thead>
    <tbody>

    <%--<%--%>
        <%--List<String> lists = (List<String>)request.getAttribute("data");--%>
        <%--for (String str:lists)--%>
        <%--{--%>
    <%--%>--%>
    <%--<tr>--%>
        <%--<td>--%>
            <%--<%=str%>--%>
        <%--</td>--%>
    <%--</tr>--%>
    <%--<%--%>
        <%--}--%>
    <%--%>--%>

    <c:forEach items="${data}" var="da">
        <tr>
            <td>
                ${da.sno}
            </td>
            <td>
                ${da.name}
            </td>
            <td>
                ${da.height}
            </td>
        </tr>

    </c:forEach>





    </tbody>
</table>


${data}




</body>
</html>
