<%@ page language="java" contentType="text/html; charset=utf-8" 	pageEncoding="utf-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
<title>THE SELECTION</title>
<link rel="stylesheet" type="text/css" href="assets/css/reset.css" />
<link rel="stylesheet" type="text/css" href="assets/css/header2.css">
<link rel="stylesheet" type="text/css" href="assets/css/shoppingcart.css">
<link rel="stylesheet" type="text/css" href="assets/css/footer.css">


</head>
<body>
	<div id="header">
		<ul>
			<li class="back"><a href="#"
				onclick="history.back(); return false;"><img
					src="assets/image/back.png"></a></li>
			<li class="home"><a href="index.do"><img
					src="assets/image/home.png"></a></li>
			<li class="search"><a href="#"><img src="assets/image/search.png"></a></li>
			<div class="searchbox">
				<input placeholder="search..." type="text" /> <a href=""><img
					src="assets/image/search.png"></a>
			</div>
			<li class="title"><h1>장바구니</h1></li>
			<li class="cart"><a href="ShoppingCart.do"><img
					src="assets/image/shopping_cart.png"></a></li>
		</ul>
	</div>

	<div id="container">
		 <form name="form1" onsubmit="doSubmit(); return false;">
			<fieldset>
				<div class="input_group"></div>
				<br />
				<label for="allcheck">
					<input type="checkbox" id='allcheck' value="담은상품">담은상품</label>
				<br />
				<br />
				<label>
					<input type="checkbox" class="duct" value="담은상품">
				</label>
				<li class="product2" id="close">
					<a href="#"><img src="assets/image/close2.png"></a>
				</li>
				<label>
					<li class="product2">
						<a href="#"><img src="assets/image/heart.png"></a>
					</li>
				</label>
				
				<!-- <ul class="order_item_ul">
                    <li>
                        <div class="order_item_content">
                            <div class="order_item_img"><img src="image/SJSJ.jpg"></div>
                            <ul>
                                <li class="first"><span class="item_name">SJSJ</span><span> 3/4 벌룬 슬리브 탑</span></li>
                                <li class="second"><span>PALE BEIGE / 82 / 1개</span></li>
                                <li class="third"><span>275,500원</span></li>
                                <li class="fourth"><span class="stage">입금대기</span><span>(2020.08.04)</span></li>
                            </ul>
                        </div>
                    </li>
                </ul> -->
				

				<ul id="grid"></ul>
			</fieldset>
		</form>

		<div class="bl"></div>

		<ul class="don">
			<li><span><a href="#" class="tit">옵션수량</a></span></li>
			<li><span><a href="#" class="con">색상/사이즈/갯수</a></span></li>
			<li><span class="collapse-title"><a href="#content1"
					class="borderbtn">변경</a></span></li>
		</ul>

		<form action="ShoppingCart.do">
			<div class="collapse">
				<div class="collapse-item">
					<div id="content1" class="content">
						<label for="size">사이즈</label> <select id="size1" class="size_c">
							<option>XS</option>
							<option>XL</option>
							<option>L</option>
						</select> <br> <label for="size">수량</label> <input type="number"
							name="size" id="size1" class="num_c"> <br /> <br />
						<div id="btn4">
							<input id="btn4_1" type="submit" value="취소"> <input
								id="btn4_2" type="submit" value="확인">
						</div>
					</div>
				</div>
			</div>
		</form>
		<hr />
		<div class="allpro">
			<div>
				<span>총 0개 상품</span>
			</div>
			<br />
			<div>
				<span>상품합계</span> <span class="dduct1">0원</span>
			</div>
			<br />
			<div>
				<span>배송비</span> <span class="dduct2">0원</span>
			</div>
			<br />
			<div>
				<span>합계</span> <span class="dduct3">0원</span>
			</div>

		</div>
		<!--  <div id="delete">
            <form action="./delete.do" method="POST">
                <input type="submit" value="품절상품삭제">
                <input type="submit" name="선택상품삭제">
            </form>
        </div> -->

		<div class="btn3">
			<button class="soldout" onclick="removeCheck">품절상품삭제</button>
			<button class="chod">선택상품삭제</button>
		</div>
		<!--<div class="btn2"><button class="chor" >선택상품주문하기</button></div>-->
		<div class="btn2" id="box">
			<a href="Best.do" class="chor" id="shcon"><span class="conti">쇼핑계속하기</span></a>
			<a href="Delivery.do" class="chor2"><span class="conti2">주문하기</span></a>

			<!--  <a href="Payment.jsp" class="chor"  id="shcon">
                <span class="pay">선택상품 결제하기</span>
            </a> -->

		</div>



	</div>
	<br />
	<div id="fbtn">

		<label> <a href="Payment.do">
				<button type="button" class="btn" id='Button1'>
					<span class="btn5">0</span> <span class="btn6">주문하기</span>
				</button>
		</a>
		</label>

	</div>

	<br class="line">

	<!-- footer -->
		<%@ include file="assets/inc/footer.jsp"%>

	<!-- 동적으로 생성될 html 기본틀 -->
	<script type="text/x-handlebars-template" id="list-item-tmpl">
				{{#item}}
                    <label><li class="product"><a href="#"><img src="{{img}}"></a></li></label>
                    <label><li class="product4"><a href="#">{{brand}}</a></li></label>
                    <br />
                    <br />
                    <label><li class="product4"><a href="#">{{price}}</a></li></label>
                    <br />
				
				{{/item}}
				</script>


	<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src="assets/plugins/handlebars/handlebars-v4.0.11.js"></script>
	<script src="assets/js/item2.js"></script>
	<script type="text/javascript">
    
    /** json 데이터의 배열만큼 컨텐츠를 동적으로 추가하기 위한 함수 */
    function add_item() {
            var template = Handlebars.compile($("#list-item-tmpl").html());
            var html = template(data);
            $("#grid").append(html);
        }

    /** jquery 초기화 */
    $(function() {
        /** 컨텐츠 동적 추가를 위한 함수 호출 */
        add_item();

        /** 스크롤이벤트 정의 */
        $(window).scroll(function(e) {
            // 스크롤이 화면 맨 끝에 도달한 경우
            if ($(window).height() + $(window).scrollTop() == $(document).height()) {
                // 컨텐츠 동적 추가
                add_item();
            };
        });
    });
    
    $(function() {
		$("#mybutton").click(function(e) {
			$.ajax( {
				/** ajax 기본 옵션 */
				cache: false,			 // 캐쉬 사용 금지 처리
				url: '../js/item.js',// 읽어들일 파일의 경로
				method: 'get',			 // 통신방법 (get(기본값), post)
				data: {},				 // 접속대상에게 전달할 파라미터
				dataType: 'json',		 // 읽어올 내용 형식 (html,xml,json)
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
    
      // 검색창에 대한 토글
    $(function() {
    $(".search").click(function() {
                $(".logo").toggle();
                $(".searchbox").toggle();
            });
      });

    // 상품 상세 설정 변경
    $(function() {
        /** 게시글의 제목을 클릭한 경우 호출되는 이벤트 정의 */
        $(".collapse-title a").click(function(e) {
            // 링크의 기본 동작 (페이지 이동) 방지
            e.preventDefault();

            // 클릭한 요소의 href 속성을 가져온다 --> 내용영역의 id
            var target = $(this).attr('href');
            // 가져온 내용영역의 id를 화면에 표시한다.
            $(target).slideToggle(100);
            // 내용영역(.content)중에서
            // 클릭한 요소가 지정한 항목만 제외(not($(target)))
            // 하고 화면에서 숨긴다
            $(".content").not($(target)).slideUp(100);
        });
    });

    // 체크박스 전체선택 기능
    $(function(){

        $("#allcheck").change(function() {

            $(".duct").prop('checked', $(this).prop('checked'));
        });
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
        var span = $('.btn5');
        $(span).attr('disabled', 'disabled');

        $('#allcheck').click(function() {
            if($(span).attr('disabled')) $(span).removeAttr('disabled');
            else $(span).attr('disabled','disabled');


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

//     $('#Button1').click(function(){
//     if(!!$('#Button1').prop('checked')) {
//         $('#Button1').prop('checked',false);
//     } else {
//         $('#Button1').prop('checked',true);
//     }
// });

        // 선택상품에대한 주문활성화

            $(document).ready(function() {
        var button = $('#Button1');
        $(button).attr('disabled', 'disabled');

        $('.duct').click(function() {
            if($(button).attr('disabled')) $(button).removeAttr('disabled');
            else $(button).attr('disabled','disabled');
        });
    });



                // span 태그 비활성화 링크
         $(document).ready(function() {
        var span = $('.btn5');
        $(span).attr('disabled', 'disabled');

        $('.duct').click(function() {
            if($(span).attr('disabled')) $(span).removeAttr('disabled');
            else $(span).attr('disabled','disabled');
        });
    });

        $(document).ready(function() {
        var span = $('.btn6');
        $(span).attr('disabled', 'disabled');

        $('.duct').click(function() {
            if($(span).attr('disabled')) $(span).removeAttr('disabled');
            else $(span).attr('disabled','disabled');
        });
    });


// 팝업창 상품삭제

$(".soldout").click(function(){

  var result = confirm("품절상품 삭제 하시겠습니까?");

        if(!result){return false;}

  });

$(".chod").click(function(){

  var result = confirm("선택상품 삭제 하시겠습니까?");

        if(!result){return false;}

  });

// 링크변경 주문 쇼핑
               $(function(){
            $("#allcheck").click(function() {
                $(".chor").toggle();
                $(".chor2").toggle();
            });
        });


</script>

</body>
</html>