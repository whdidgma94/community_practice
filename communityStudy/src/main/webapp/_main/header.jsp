<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티 연습</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link href="/communityStudy/src/main/webapp/css/style.css">
</head>
<body>
<header>
<div class="nav justify-content-center">
	<div class="col-2 py-3" onclick="location.href='memberJoin.jsp'"> 회원가입 </div>
	<div class="col-2 py-3" onclick="location.href='memberLogin.jsp'"> 로그인 </div>
	<div class="col-2 py-3" onclick="location.href='boardMain.jsp'"> 게시판 </div>
</div>
</header>
