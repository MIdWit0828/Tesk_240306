<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-06
  Time: 오후 2:39
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>메뉴 정보</title>
</head>
<body>
<h1>조회한 메뉴 정보</h1>
<table>
    <tr>
        <th>메뉴 코드</th>
        <th>메뉴 이름</th>
        <th>메뉴 가격</th>
        <th>카테고리</th>
        <th>판매 여부</th>
    </tr>

    <c:forEach items="${menuList}" var="menu">
        <tr>
            <td>${menu.menuCode}</td>
            <td>${menu.menuName}</td>
            <td>${menu.menuPrice}</td>
            <td>${menu.categoryName}</td>
            <td>${menu.orderableStatus}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
