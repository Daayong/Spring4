/**
 * 
 */
 
 //모두 체크 버튼을 누르면 다 눌러지게 하는 버튼 코드 
 $("#all").click(function(){
	$(".cn").prop("checked",$(this).prop("checked"));
});

$(".cn").click(function(){
	let result=true;
	$(".cn").each(function(v1,v2){
		if(!$(v2).prop("checked")){
			result=false;
			console.log(v1,$(v2).prop("checked"));
			//break;   each문 안에서 사용 불가
			
		}
	});
	
	$("#all").prop("checked",result);
});


$("#btn").click(function(){
	
	if($(".pill").prop("checked")){
		location.href="join";
	}else{
		alert('약관동의필수');
	}
	
});




















