/**
 * 
 */
 
 let b1 = document.getElementById("b1");
 
	b1.addEventListener("click",function(){
	const title = document.getElementById("title");
	const writer = document.getElementById("writer");	
	const frm= document.getElementById("frm");
	const warning=document.getElementById("warning");
	const warning2=document.getElementById("warning2");
	warning.innerHTML="";
	warning2.innerHTML="";
	
	let t = title.value;
	let w = writer.value;
	
	
	let check =true; 
	
	if(t==""){
		check=false;
		warning.innerHTML='필수입력사항입니다';
	}
	
	if(w==""){
		check=false;
		warning2.innerHTML='필수입력사항입니다';
	}
	
	
	
	if(check){
		frm.submit();	
	}else{
		alert('필수입력..');
	}
	
	
	
	
	/*if(t!="" && w != ""){
		alert(true);
	}else{
		alert(false);
	}
	*/
}); 





















