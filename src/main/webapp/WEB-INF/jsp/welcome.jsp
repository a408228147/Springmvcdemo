<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/11
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- foreach --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<script>




</script>
<body>
Hello Mvc!!

<C:forEach items="${requestScope.selectAll}" var="user">
    ${user.username}
    ${user.password}
</C:forEach>
</body>
</html>
