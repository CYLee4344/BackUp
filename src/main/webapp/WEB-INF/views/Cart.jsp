<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <title>THE SELECTION</title>
    <link rel="stylesheet" type="text/css" href="assets/css/reset.css" />
</head>
<body>
	<h2>장바구니 확인</h2>
	<c:choose>
		<c:when test="{map.count == 0}">
			장바구니가 비어있습니다.
		</c:when>
		<c:otherwise>
			<form name="form1" id="form1" method="post" action="${path}/shop/cart/update.do">
				<table>
					<tr>
						<th>이미지</th>
						<th>브랜드</th>
						<th>이름</th>
						<th>가격</th>
						<th>수량</th>
						<th>총금액</th>
					</tr>
					<c:forEach var="row" items="{map.list}" varStatus="i">
					<tr>
						<td>
							${row.img}
						</td>
						<td>
							${row.brand}
						</td>
						<td>
							${row.name}
						</td>
						<td>
							${row.price}
						</td>
						<td>
							${row.amount}
						</td>
					</tr>
					</c:forEach>
				</table>
			</form>
		</c:otherwise>
	</c:choose>

</body>
</html>