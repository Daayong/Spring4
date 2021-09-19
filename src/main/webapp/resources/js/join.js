/**
 * 
 */
 
 //id
 const id=document.getElementById("id");
 const idResult=document.getElementById("idResult");
 const idCheck=document.getElementById("idCheck");
 
 //pw1
 const pw1=document.getElementById("pw1");
  //pw2(패스워드확인)
 const pw2=document.getElementById("pw2");
 //pw틀렸을때
 const warnPw=document.getElementById("warnPw");
 //submit button
 const btn = document.getElementById("btn"); 
 //필수입력사항들 
 const put = document.getElementsByClassName("put");
 //패스워드 두개 
 const pws = document.getElementsByClassName("pw");

 const frm=document.getElementById("frm");

/*iden.addEventListener('change',function(){
	alert('change');		
});*/

idCheck.addEventListener('click',function(){
	open("./idCheck?id="+iden.value,"","width=400,height=200,top=200,left=300");
});

//id6글자 맞을떄까지  출력하게 
/*iden.addEventListener('keyup',function(){	
	if(iden.value.trim().length>=6){
		idResult.innerHTML='올바른ID';
	}else{
		idResult.innerHTML='ID는6글자이상입니다';
	}
});
*/
//focus를 잃었을때
/*iden.addEventListener('blur',function(){
	if(iden.value.trim().length<6){
		iden.focus();
	}
});
*/
//focus활용 (아이디 입력했다가 다른데 클릭했다가 다시 아이디 클릭하면 빈문자열로 바뀌기)
/*iden.addEventListener('focus',function(){
	iden.value="";
});
*/

	$('#id').blur(function() {
		let id=$('#id').val();
		$.get('./idCheckAjax?id='+id, function(data){
			data=data.trim(); 
			if(data=='1'){
				$('#idResult').html('사용가능');				
			}else{
				$('#idResult').html('사용 불가능');
			}
		
		
		});
	});



//비어있는 input이 있는지 없는지확인하는 함수 
function checkEmpty(puts){
	let result=true;
	for(let r of puts){
		if(r.value.trim()==""){
			result="false"
			break;
		}
	}
	return result;
}

//두개의 값이 같은지확인하는 함수 
function checkEqual(check1,check2){
	return check1.value==check2.value;
}

pw2.addEventListener('blur',function(){
	if(!checkEqual(pws[0],pws[1])){
		warnPw.innerHTML='패스워드가 일치하지 않습니다';
	}
	
});





//비밀번호 6글자 인지 확인 
function checkLength(){
	let l=pws[0].value.trim().length;
	
	if(l>=6){
		return true;
	}else{
		return false;
	}
}

//버튼 클릭 이벤트
 btn.addEventListener('click',function(){
	//비어있는것들 검사 
	let ce=checkEmpty(put);
	//pw 2개값이 같은지 검사
	let ce2=checkEqual(pws[0],pws[1]);
	
	//패스워드 길이
	let cl = checkLength();
			
	if(ce&&ce2&&cl){
		frm.submit();
	}else{
		alert("필수입력");	
	}
	
	
});
 
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 