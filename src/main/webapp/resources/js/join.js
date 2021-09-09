/**
 * 
 */
 
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
 
 
 let p1=pw1.value;
 let p2=pw2.value;
 let wp=warnPw.value;
 
 
 btn.addEventListener('click',function(){

 if(p1!=p2){
	wp.innerHTML='Password가 일치하지 않습니다';
}
	
	
});
 
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 