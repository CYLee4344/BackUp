<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <title>THE SELECTION</title>
    <link rel="stylesheet" type="text/css" href="assets/css/reset.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/header2.css">
    <link rel="stylesheet" type="text/css" href="assets/css/payment.css">


</head>
<body>
     <div id="header">
        <ul>
            <li class="back"><a href="#" class="back2" onclick="history.back(); return false;"><img src="assets/image/back.png"></a></li>
             <li class="home"><a href="index.do"><img src="assets/image/home.png"></a></li>
            <li class="search"><a href="#" class="search2"><img src="assets/image/search.png"></a></li>
            <li class="logo"><a href="#" class="logo2"><span> <strong>배송&결제정보 입력</strong></span></a></li>
            <li class="cart"><a href="ShoppingCart.do" class="cart2"><img src="assets/image/shopping_cart.png"></a></li>

            <div class="searchbox">
                <input placeholder="search..." type="text" />
                <a href=""><img src="image/search.png"></a>
            </div>
        </ul>
    </div>
    <hr />

    <div id="container">
        <div>
            <ul>
                <h1>주문상품(n개)</h1>
                <br/>
                    <label><li class="product"><a href="#"><img src="assets/image/2.jpg"></a></li></label>
                    <label><li class="product2"><a href="#">상품명</a></li></label>
                    <label><li class="product2"><a href="#">색상/사이즈/수량</a></li></label>
                    <br />
                    <br />
                    <label><li class="product2"><a href="#">가격</a></li></label>
                    <br />

                </ul>
                <div>
                    <h1 class="dcc">배송지 정보</h1>
                    <a href="Delivery_ch.do" class="DC">배송지 변경</a>
                    <h2>회원가입할 때 입력한 정보</h2>
                    <div class="ccp">
                        <select name="cp">
                        <option value="">쿠폰선택</option>
                        <option value="쿠폰1">쿠폰1</option>
                        <option value="쿠폰2">쿠폰2</option>
                    </select>
                </div>

                </div>

            </div>
    </div>

    <div id="footer">
         <hr />
                <div>
                    <h1 class="ch">결제수단선택</h1>
                    <div class="pay">
                        <input type="button" class="button" name="신용카드" value="신용카드" onclick="">
                        <input type="button" class="button" name="실시간 계좌이체"  value="가상계좌">
                        <input type="button" class="button" name="kakaopay" value="카카오페이">
                    </div>

                </div>

         <hr />
         <div >
            <ul>
                <li class="payall"><a href=""><span class="btn_t_1">최종 결제금액</span><span class="btn_t_2"><b>178,000</b>원</span></a></li>
                <li>
                    <div class="story">상품합계</div>
                    <div class="money">475,000</div>
                </li>
                <li>
                    <div class="story">배송비</div>
                    <div class="money">0</div>
                </li>
            </ul>

         </div>
         <hr />
         <!-- 구매자 동의 부분에 설명 볼수 있게 ??? 화살표 뭐시여 -->
         <div class="allch">
            <input type="checkbox" name="구매자 동의" value="구매자 동의" id="agree">
             구매자동의
         </div>


    <hr />
       <div class="btn2">
        <a href="Best.do" class="chor"  id="shcon"><span>쇼핑계속하기</span></a>
        <a href="Delivery.do" class="chor2"><span>주문하기</span></a>
    </div>
<!--         <div class="btn2">
        <a href="Delivery.html" class="chor"  id="shcon"><span>주문하기</span></a> -->

        <!-- <div id="fbtn">
            <label>
                <a href="Delivery.html">
                <button type="button" class="btn" id='Button1'>
                    <span class="btn6">주문하기</span>
                </button>
            </a>
        </label>

       </div>
    </div> -->
    </div>

     <script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
    $(function() {
		$("#mybutton").click(function(e) {
			$.ajax( {
				/** ajax 기본 옵션 */
				cache: false,			 // 캐쉬 사용 금지 처리
				url: '../api/hello.html',// 읽어들일 파일의 경로
				method: 'get',			 // 통신방법 (get(기본값), post)
				data: {},				 // 접속대상에게 전달할 파라미터
				dataType: 'html',		 // 읽어올 내용 형식 (html,xml,json)
				timeout: 30000,			 // 타임아웃 (30초)

				// 통신 시작전 실행할 기능 (ex: 로딩바 표시)
				beforeSend: function() {
					// 현재 통신중인 대상 페이지를 로그로 출력함
					console.log(">> Ajax 통신 시작 >> " + this.url);
				},
				// 통신 성공시 호출될 함수 (파라미터는 읽어온 내용)
				success: function(req) {
					console.log(">> 성공!!!! >> " + req);
					// 준비된 요소에게 읽어온 내용을 출력한다.
					$("#result").append(req);
				},
				// 통신 실패시 호출될 함수 (파라미터는 에러내용)
				error: function(error) {
					// 404 -> Page Not Found
					// 50x -> Server Error(웹 프로그램 에러)
					// 200, 0 -> 내용의 형식 에러(JSON,XML)
					console.log(">> 에러!!!! >> " + error.status);
				},
				// 성공,실패에 상관 없이 맨 마지막에 무조건 호출됨 ex) 로딩바 닫기
				complete: function() {
					console.log(">> Ajax 통신 종료!!!!");
				}
			} );
		}); // end #mybutton click
	});

            // 체크선택에의한 주문 활성화

    $(document).ready(function() {
        var button = $('#Button1');
        $(button).attr('disabled', 'disabled');

        $('#allcheck').click(function() {
            if($(button).attr('disabled')) $(button).removeAttr('disabled');
            else $(button).attr('disabled','disabled');
        });
    });

        $(document).ready(function() {
        var span = $('.btn6');
        $(span).attr('disabled', 'disabled');

        $('#allcheck').click(function() {
            if($(span).attr('disabled')) $(span).removeAttr('disabled');
            else $(span).attr('disabled','disabled');
        });
    });

               $(function(){
            $("#agree").click(function() {
                $(".chor").toggle();
                $(".chor2").toggle();
            });
        });
</script>
</body>
</html>