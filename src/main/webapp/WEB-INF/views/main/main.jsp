<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-06
  Time: 오후 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>메인화면</title>
</head>
<body>
<h1>메인화면</h1>
<h3>메뉴코드로 조회</h3>
<form action="${pageContext.servletContext.contextPath}/menudb/selectId" method="post">
    <label>매뉴 코드 : </label>
    <input type="text" name="menuCode">
    <button>조회하기</button>
</form>

<h3>일정 가격 이상의 메뉴 조회</h3>
<form action="${pageContext.servletContext.contextPath}/menudb/selectPrice" method="post">
    <label>가격 입력</label>
    <input type="text" name="price">
    <button>조회하기</button>
</form>

<h3>신규 매뉴 등록</h3>
<form action="${pageContext.servletContext.contextPath}/menudb/insert" method="post">
    매뉴 이름 : <input type="text" name="menuName"><br>
    매뉴 가격 : <input type="text" name="menuPrice"><br>
    카테고리
    <select name="categoryCode">
        <option value="4">한식</option>
        <option value="5">중식</option>
        <option value="6">일식</option>
        <option value="7">퓨전</option>
        <option value="8">커피</option>
        <option value="9">쥬스</option>
        <option value="10">기타</option>
        <option value="11">동양</option>
        <option value="12">서양</option>
    </select><br>
    판매 여부
    <select name="orderableStatus">
        <option value="Y">Y</option>
        <option value="N">N</option>
    </select><br>
    <button>추가하기</button>
</form>
<h3>메뉴 코드로 카테고리 변경</h3>
<form action="${pageContext.servletContext.contextPath}/menudb/update" method="post">
    <label>메뉴 코드</label>
    <input type="text" name="menuCode">
    <label>변경할 카테고리</label>
    <select name="categoryCode">
        <option value="4">한식</option>
        <option value="5">중식</option>
        <option value="6">일식</option>
        <option value="7">퓨전</option>
        <option value="8">커피</option>
        <option value="9">쥬스</option>
        <option value="10">기타</option>
        <option value="11">동양</option>
        <option value="12">서양</option>
    </select>
    <button>변경하기</button>
</form>
<h3>메뉴 코드로 매뉴 삭제</h3>
<form action="${pageContext.servletContext.contextPath}/menudb/delete" method="post">
    <label>메뉴 코드</label>
    <input type="text" name="menuCode">
    <button>삭제하기</button>
</form>
</body>
</html>
