<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!doctype html>
<html>
<head>
	<%@ include file="assets/inc/same_css.jsp"%>
	<link rel="stylesheet" type="text/css" href="assets/css/header.css" />
	<link rel="stylesheet" type="text/css" href="assets/css/Find_PW.css" />
</head>

<body>
	<!-- 헤더 -->
    <div id="header">
        <ul>
            <li class="back"><a href="javascript:history.back()"><img src="assets/image/back.png"></a></li>
            <li class="search"><a href="#"><img src="assets/image/search.png"></a></li>
            <div class="searchbox">
                <input placeholder="search..." type="text" />
                <a href=""><img src="assets/image/search.png"></a>
            </div>
            <li class="title"><h1><strong>비밀번호 찾기</strong></h1></li>
            <li class="cart"><a href="ShoppingCart.do"><img src="assets/image/shopping_cart.png"></a></li>
        </ul>
    </div>

    <!-- 아이디로 찾기 -->
    <div class="content1">
        <div class="image">
            <h2>비밀번호 찾기</h2>
        </div>
        <div class="content2">
        <form action="searchPw.do" method="get">
            <div class="input_ID">
                <p>아이디와 이메일 주소를 입력하세요.</p>
                <input type='text' name="user_id" id="user_id" placeholder="아이디를 입력하세요." />
                <input type='text' name="user_email" id="user_email" placeholder="이메일을 입력하세요." />
            </div>
            <div class="nxt_bttn">
                <button type="submit" id="nxt">확인</button>
            </div>
            </form>
        </div> 
    </div>
    
    <!-- footer -->
    <%@ include file="assets/inc/footer.jsp"%>

    <!-- bottom_bar -->
    <%@ include file="assets/inc/bottom_bar.jsp"%>
    
    <!-- 스크립트 영역 -->
    <script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
    $(function() {

        $(".search").click(function() {
            $(".title").toggle();
            $(".searchbox").toggle();
        });

        $("#bottom_bar li:first-child").click(function(e) {
            e.preventDefault();
            $("#category_bar").slideToggle(100);
        });

        $("#user_id").focus(function() {
            $("#user_id").attr("placeholder", "");
        });

        $("#user_id").blur(function() {
            $("#user_id").attr("placeholder", "아이디를 입력하세요.");
        });

        /** 버튼 클릭시 이벤트 */
        /* $("#nxt").click(function() {
            // 입력값을 취득하고, 내용의 존재여부를 검사한다.
            var user_id_val = $("#user_id").val();

            if (!user_id_val) { // 입력되지 않았다면?
                alert("아이디를 입력하세요."); // <-- 메시지 표시
                $("#user_id").focus();         // <-- 커서를 강제로 넣기
                return false;                // <-- 실행중단
            } */

         	// 위의 if문을 무사히 통과했다면 내용이 존재한다는 의미이므로,
			// 입력된 내용을 Ajax를 사용해서 웹 프로그램에게 전달한다.
			/* $.post("../api/id_unique_check.do", { user_id: user_id_val }, function(req) {
				// 존재하는 아이디인 경우 --> req = { result: "OK" }
				// 존재하지 않는 아이디인 경우 --> req = { result: "FAIL" }
				if (req.result == 'OK') {
					location.href='Send_PW.jsp';
				} else {
					alert("존재하지 않는 회원입니다.");
					$("#user_id").val("");
					$("#user_id").focus();
				}
			}); // end $.get
		}); // end click */
    });
    </script>
</body>
</html>