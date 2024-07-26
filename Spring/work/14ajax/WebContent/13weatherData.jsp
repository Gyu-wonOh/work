<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
//현재 날씨
//https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=4EdqFWkFGFpPGXHMByFibcMzkLKX2tfUMA7w%2FhRXSHXxdYUZykf0xkoD3bqTyeB8yVHviTexU%2BivC%2ByslhwyFw%3D%3D&pageNo=1&numOfRows=1000&dataType=json&base_date=20240726&base_time=0600&nx=55&ny=127
var url="https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=4EdqFWkFGFpPGXHMByFibcMzkLKX2tfUMA7w%2FhRXSHXxdYUZykf0xkoD3bqTyeB8yVHviTexU%2BivC%2ByslhwyFw%3D%3D&pageNo=1&numOfRows=1000&dataType=json&base_date=20240726&base_time=0600&nx=55&ny=127"
	/* $.ajax({
	      url:url,
	      success: function(data){
	         console.log(data);
	         console.log("온도:"+ data.response.body.items.item[3].obsrValue);
	      
	         var item =data.response.body.items.item[3];
	         var content="";
	         content+="날짜:"+item.baseDate+" 시간:"+item.baseTime
	         + " 온도:"+item.obsrValue;
	      
	         $(".result").text(content);
	      }
	});    */

	$.getJSON(url,function(data){
	console.log(data);
	console.log("온도"+data.response.body.items.item[3].obsrValue);
	var item=data.response.body.items.item[3]
	var content="";
	content+="날짜"+item.baseDate+"시간"+item.baseTime+
	"온도:"+item.obsrValue
	$(".result").text(content);
	})	
</script>
</head>
<body>
	<div class="result"></div>
</body>
</html>