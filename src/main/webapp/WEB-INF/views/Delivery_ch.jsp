<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
<title>THE SELECTION</title>
<link rel="stylesheet" type="text/css" href="assets/css/reset.css" />
<link rel="stylesheet" type="text/css" href="assets/css/header.css" />
<link rel="stylesheet" type="text/css" href="assets/css/bottom_bar.css" />
<link rel="stylesheet" href="assets/plugins/sweetalert/sweetalert2.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/Delivery_ch.css" />
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>


</head>

<body>
<!-- 헤더 -->

 <div id="header">
<ul>
<li class="back"><a href="#" onclick="history.back(); return false;"><img src="assets/image/back.png"></a></li>
<li class="search"><a href="#"><img src="assets/image/search.png"></a></li>
 <div class="searchbox">
<input placeholder="search..." type="text" />
<a href=""><img src="assets/image/search.png"></a>
 </div>
<li class="title"><h1>배송지 변경</h1></li>
<li class="cart"><a href="ShoppingCart.jsp"><img src="assets/image/shopping_cart.png"></a></li>
</ul>
 </div>



<hr />
<p id="essen"> <span class='identify'>*</span>&nbsp;&nbsp;&nbsp;필수입력</p>
        <li class="choi">
            선택사항을 미입력하더라도 불이익은 발생하지 않습니다.
        </li>

<!-- 가입폼 시작 -->
<form name="join_form" id="join_form">

<div class="form-group">
<label for='tel' class="col-md-2">주소 <span class='identify'>*</span></label>

<div class="col-md-10">
<div id="findadd">
<li><input type="text" id="sample4_postcode" placeholder="우편번호">
<input type="button" id="findbtn" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"></li>
<li><input type="text" id="sample4_roadAddress" placeholder="도로명주소">
<input type="text" id="sample4_jibunAddress" placeholder="지번주소"></li>
<span id="guide" style="color:#999;display:none"></span>
<li><input type="text" id="sample4_detailAddress" placeholder="상세주소">
<input type="text" id="sample4_extraAddress" placeholder="참고항목">   </li> </div>
</div>
</div>

<div class="form-group">
<label for='user_name' class="col-md-2">수령인 <span class='identify'>*</span></label>
<div class="col-md-10"><br />
<input type="text" name="user_name" id="user_name" class="form-control" />
</div>
</div>

<div class="form-group">
<label for='tel' class="col-md-2">연락처 <span class='identify'>*</span></label>
<div class="col-md-10"><br />
<input type="tel" name="tel" id="tel" class="form-control" />
</div>
</div>

<div class="form-group">
<label for='email' class="col-md-2">이메일 <span class='identify'></span></label>
<div class="col-md-10"><br />
<input type="email" name="email" id="email" class="form-control" />

<!-- 드롭다운(싱글타입) -->
<label for="emailD"></label>
<select name="emailD" id="emailD">
<option>----- 직접입력 -----</option>

</select>


</div>
</div>
<p id="asher">이메일 주소 입력시 사용가능한 특수 문자는 -, _입니다.</p>

<br/>

<div>
    <input type="checkbox" name="">기본배송지로 설정
</div>

<div class="form-group">
<div class="text-center">
<button type="submit" id="submit"><a href="index.jsp">취소</button></a>
<button type="submit" id="submit"><a href="index.jsp">확인</button></a>

</div>
</div>

</form>


<!-- 하단 메뉴바 -->
<div id="bottom_bar">
<ul>
<li><a href="#"><img src="assets/image/menu.png"></a></li>
<li><a href="Login.jsp"><img src="assets/image/lock.png"></a></li>
<li><a href="index.jsp"><img src="assets/image/home.png"></a></li>
<li><a href="MyHeart.jsp"><img src="assets/image/heart.png"></a></li>
<li><a href="Order_List.jsp"><img src="assets/image/person.png"></a></li>
</ul>
</div>

<!-- 카테고리 바 -->
<div id="category_bar">
<ul>
<li><a href="Best.jsp">BEST</a></li>
<li><a href="New.jsp">NEW</a></li>
<li><a href="Recommend.jsp">RECOMMEND</a></li>
<li><a href="Top.jsp">TOP</a></li>
<li><a href="Dress.jsp">DRESS</a></li>
<li><a href="Pants.jsp">PANTS</a></li>
<li><a href="Outer.jsp">OUTER</a></li>
<li><a href="Acc.jsp">ACCESSORY</a></li>
<li><a href="Announcement.jsp">NOTICE</a></li>
<li><a href="QnA.jsp">Q&A</a></li>
</ul>
</div>

<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
//본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
function sample4_execDaumPostcode() {
new daum.Postcode({
oncomplete: function(data) {
// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

// 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
var roadAddr = data.roadAddress; // 도로명 주소 변수
var extraRoadAddr = ''; // 참고 항목 변수

// 법정동명이 있을 경우 추가한다. (법정리는 제외)
// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
extraRoadAddr += data.bname;
}
// 건물명이 있고, 공동주택일 경우 추가한다.
if(data.buildingName !== '' && data.apartment === 'Y'){
extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
}
// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
if(extraRoadAddr !== ''){
extraRoadAddr = ' (' + extraRoadAddr + ')';
}

// 우편번호와 주소 정보를 해당 필드에 넣는다.
document.getElementById('sample4_postcode').value = data.zonecode;
document.getElementById("sample4_roadAddress").value = roadAddr;
document.getElementById("sample4_jibunAddress").value = data.jibunAddress;

// 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
if(roadAddr !== ''){
document.getElementById("sample4_extraAddress").value = extraRoadAddr;
} else {
document.getElementById("sample4_extraAddress").value = '';
}

var guideTextBox = document.getElementById("guide");
// 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
if(data.autoRoadAddress) {
var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
guideTextBox.style.display = 'block';

} else if(data.autoJibunAddress) {
var expJibunAddr = data.autoJibunAddress;
guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
guideTextBox.style.display = 'block';
} else {
guideTextBox.innerHTML = '';
guideTextBox.style.display = 'none';
}
}
}).open();
}
</script>

<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="assets/plugins/validate/jquery.validate.min.js"></script>
<script src="assets/plugins/validate/additional-methods.min.js"></script>
<!-- sweetalert 플러그인 참조 -->
<script src="assets/plugins/sweetalert/sweetalert2.min.js"></script>
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

function sample6_execDaumPostcode() {
new daum.Postcode({
oncomplete: function(data) {
// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

// 각 주소의 노출 규칙에 따라 주소를 조합한다.
// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
var addr = ''; // 주소 변수
var extraAddr = ''; // 참고항목 변수

//사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
addr = data.roadAddress;
} else { // 사용자가 지번 주소를 선택했을 경우(J)
addr = data.jibunAddress;
}

// 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
if(data.userSelectedType === 'R'){
// 법정동명이 있을 경우 추가한다. (법정리는 제외)
// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
extraAddr += data.bname;
}
// 건물명이 있고, 공동주택일 경우 추가한다.
if(data.buildingName !== '' && data.apartment === 'Y'){
extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
}
// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
if(extraAddr !== ''){
extraAddr = ' (' + extraAddr + ')';
}
// 조합된 참고항목을 해당 필드에 넣는다.
document.getElementById("sample6_extraAddress").value = extraAddr;

} else {
document.getElementById("sample6_extraAddress").value = '';
}

// 우편번호와 주소 정보를 해당 필드에 넣는다.
document.getElementById('sample6_postcode').value = data.zonecode;
document.getElementById("sample6_address").value = addr;
// 커서를 상세주소 필드로 이동한다.
document.getElementById("sample6_detailAddress").focus();
}
}).open();
}

$(function() {
$(".search").click(function() {
$(".title").toggle();
$(".searchbox").toggle();
});

$("#bottom_bar li:first-child").click(function(e) {
e.preventDefault();
$("#category_bar").slideToggle(100);
});

$(".top").click(function(e) {
e.preventDefault();
$("#container").moveTo($(this).index() + 1);
});
/** 플러그인의 기본 설정 옵션 추가 */
jQuery.validator.setDefaults({
onkeyup:false, // 키보드입력시 검사 안함
onclick:false, // <input>태그 클릭시 검사 안함
onfocusout:false, // 포커스가 빠져나올 때 검사 안함
// 에러 발생시 호출되는 함수 재정의
showErrors:function(errorMap, errorList){
// 에러가 있을 때만..
if(this.numberOfInvalids()) {
// 0번째 에러 메시지에 대한 javascript 기본 alert 함수 사용
// alert(errorList[0].message);
// 0번째 에러 발생 항목에 포커스 지정
// $(errorList[0].element).focus();

swal({
title: "에러",
text: errorList[0].message,
type: "error"
}).then(function(result){
// 창이 닫히는 애니메이션의 시간이 있으므로,
// 0.1초의 딜레이 적용 후 포커스 이동
setTimeout(function() {
$(errorList[0].element).val('');
$(errorList[0].element).focus();
},100);
});
}
}
});

/** 유효성 검사 추가 함수 */
$.validator.addMethod("kor", function(value, element) {
return this.optional(element) || /^[ㄱ-ㅎ가-힣]*$/i.test(value);
});

$.validator.addMethod("phone", function(value, element) {
return this.optional(element) || /^01(?:0|1|[6-9])(?:\d{3}|\d{4})\d{4}$/i.test(value) || /^\d{2,3}\d{3,4}\d{4}$/i.test(value);
});

/** form태그에 부여한 id속성에 대한 유효성 검사 함수 호출 */
$("#join_form").validate({
submitHandler: function() {
swal('가입완료', '성공적으로 가입되었습니다.', 'success');
},
/** 입력검사 규칙 */
rules: {
// [아이디] 필수 + 알파벳, 숫자 조합만 허옹
user_id: { required: true, alphanumeric: true },
// [비밀번호] 필수 + 글자수 길이 제한
user_pw: { required: true, minlength: 4, maxlength: 20 },
// [비밀번호 확인] 필수 + 특정 항목과 일치 (id로 연결)
user_pw_re: { required: true, equalTo: "#user_pw" },
// [이름] 필수
user_name: { required: true, kor: true },
// [이메일] 필수 + 이메일 형식 일치 필요
email: { required: true, email: true },
// [연락처] 필수
tel: { required: true, phone: true },
// [생년월일] 필수 + 날짜 형식 일치 필요
birthdate: { required: true, date: true },
// [성별] 필수 입력,
gender: "required",
// [수강과목] 필수, 최소2개, 최대4개
subject: { required: true, minlength: 2, maxlength: 4 },
// 허용할 확장자 명시
profile_img: { extension: "jpg|gif|png" }
},
/** 규칙이 맞지 않을 경우의 메시지 */
messages: {
user_id: {
required: "아이디를 입력하세요.",
alphanumeric: "아이디는 영어, 숫자만 입력 가능합니다."
},
user_pw: {
required: "비밀번호를 입력하세요.",
minlength: "비밀번호는 4글자 이상 입력하셔야 합니다.",
maxlength: "비밀번호는 최대 20자까지 가능합니다."
},
user_pw_re: {
required: "비밀번호 확인값을 입력하세요.",
equalTo: "비밀번호 확인이 잘못되었습니다."
},
user_name: {
required: "이름을 입력하세요.",
kor: "이름은 한글만 입력 가능합니다."
},
email: {
required: "이메일을 입력하세요.",
email: "이메일 형식이 잘못되었습니다."
},
tel: {
required: "연락처를 입력하세요.",
phone: "연락처 형식이 잘못되었습니다."
},
birthdate: {
required: "생년월일을 입력하세요.",
date: "생년월일의 형식이 잘못되었습니다."
},
gender: "성별을 선택해 주세요.",
subject: {
required: "수강과목을 선택하세요.",
minlength: "수강과목은 최소 2개 이상 선택하셔야 합니다.",
maxlength: "수강과목은 최대 4개 까지 선택 가능합니다."
},
profile_img: {
extension: "프로필 사진은 jpg,png,gif 형식만 가능합니다."
}
}
}); // end validate()
});
</script>
</body>
</html>