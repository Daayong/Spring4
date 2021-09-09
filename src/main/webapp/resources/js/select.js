/**
 * 
 */
 
 const c1=document.getElementsByClassName('c1');
 const btn=document.getElementById('btn');
 
 
 btn.addEventListener('click',function(){
	
	for(let ch of c1){
		ch.checked=true;	
	}
});
 
 
 
 
/* for(let ch of c1){
	if(ch.checked){
		ch.checked=!ch.cheked;
	}else{
		ch.checked=!ch.checked;
	}
}
 */
 
 
 /*of = 값 꺼내기*/
/* for(let ch of c1){
	ch.addEventListener('click',function(){
		
		alert(ch.checked);
		
	}); 
}
 */
 