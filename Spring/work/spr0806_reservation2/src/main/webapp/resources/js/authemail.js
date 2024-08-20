$(function(){
	$(document).on("click", "#emailBtn", function(){ //[인증번호 발송] 버튼
		//alert($("#email").val())
		//alert($("#random").val())
		$.ajax({
			beforeSend: function(){
				//loadingBarStart();
				alert('메일전송시작');
			},
			type:"get",
			url: "/ex/createEmailCheck",
		    data: {
		        email: $("#email").val(),
		        random: $("#random").val()
		    },
		    //data: "userEmail="+encodeURIComponent($('#userEmail').val()),
			/* encodeURIComponent
			예를들어, http://a.com?name=egoing&job=programmer 에서 &job=programmer
 			중 '&'는 하나의 파라미터가 끝나고 다음 파라미터가 온다는 의미이다.
			그런데 다음과 같이 job의 값에 &가 포함된다면 시스템은 job의 값을 제대로 인식할수 없게 된다. */
			success : function(data){
					alert("인증번호가 발송되었습니다. 인증번호를 입력해주세요.");
			},
			error: function(data){
				alert("에러가 발생했습니다.");
				return false;
			}
		});
	});
	
	/*
 	이메일 인증번호 입력 후 인증 버튼 클릭 이벤트
	*/

	$(document).on("click", "#emailAuthBtn", function(){
		
		$.ajax({
			beforeSend: function(){
				//loadingBarStart();
				alert('인증번호 확인 시작');
			},
			type:"get",
			url:"/ex/emailAuth",
			data:"authCode=" + $('#emailAuth').val() + "&random=" + $("#random").val(),
			success:function(data){
				if(data=="complete"){
					alert("인증이 완료되었습니다.");
				}else if(data == "false"){
					alert("인증번호를 잘못 입력하셨습니다.")
				}
			},
			complete: function(){
				//loadingBarEnd();
				console.log(data)
				//alert('?');
			},
			error:function(data){
				console.log(data)
				//alert("에러가 발생했습니다.");
			}
		});
	});
});