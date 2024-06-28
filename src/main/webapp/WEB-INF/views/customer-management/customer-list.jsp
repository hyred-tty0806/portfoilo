<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
    <h1>Customer List</h1>
    <a href="${pageContext.request.contextPath}/customers/register">Register New Customer</a>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Username</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="customer" items="${customers}">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.username}</td>
                    <td>${customer.name}</td>
                    <td>${customer.email}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
