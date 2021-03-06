<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <script src="//netdna.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">



</head>
<body>
<div class="container">

    <title>User Chat</title>
    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <td>
                <p>
                    <a class="btn btn-default btn-xs" href="/delete/currency/${currency.id}" role="button">delete</a>
                    <a class="btn btn-default btn-xs" href="/edit/currency/${currency.id}" role="button">edit</a>
                </p>
            </td>
        </tr>
        </thead>
    </table>

    <c:forEach items="${messages}" var="msg">
        ${msg.author} : ${msg.text}<br>
    </c:forEach>

    <%--
    <h1>Chat Page</h1>
    <form:form method="post" action="/save/message" commandName="messageForm">

        <div class="form-group">
            <label>Author Name</label>
           <form:input class="form-control" path="author" placeholder="Author"/>
            <form:errors path="author" cssStyle="color: #0002ff;"/>
        </div>
        <div class="form-group">
            <label>Author Text</label>
            <form:input class="form-control" path="text" placeholder="Text"/>
            <form:errors path="text" cssStyle="color: #0002ff;"/>
        </div>
        <input class="btn btn-default btn-xs" type="submit" value="save">
        <a class="btn btn-default btn-xs" href="/" role="button">cancel</a>
    </form:form>

    <input class="btn btn-default btn-xs" type="submit" value="add">
    --%>



    <p align="right"><a class="btn btn-info btn-xs" href="/add/user" role="button">add user</a></p>
    <a class="btn btn-primary btn-xs" href="/add/user" role="button">Add User</a>
</div>
</body>
</html>