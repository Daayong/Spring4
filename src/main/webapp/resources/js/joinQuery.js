/**
 * 
 */
 
 //id,pw,name,email,phone 비어있으면 안됨 
 $("#btn").click(function(){
	let result="true";
	let t;
 $(".put").each(function(s1,s2){
	
	if($(s2).val()==""){
		result=false;
		t=s2;
	}
});
if(result){
		alert('완료');
		//$("#frm").submit();
	}else{
		alert('필수입력미작성');
		$(t).focus();	
	}
	
});
 
