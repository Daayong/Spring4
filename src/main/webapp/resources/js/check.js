/**
 * 
 */
 
 //회워가입버튼
 const btn = document.getElementById('btn'); 
 //전체동의 버튼
 const all = document.getElementById('all');
 //전체 동의 버튼 제외 
 const cn = document.getElementsByClassName('cn');
 //필수약관 버튼 
 const pill = document.getElementsByClassName('pill');
 //선택약관버튼 
 const marketing = document.getElementById('marketing');

//------------------------------------------------------------전체동의버튼 
all.addEventListener('click',function(){
	for(let ch of cn){
		ch.checked=all.checked;	
	}
});
 
//-----------------------------------------------------------밑에 버튼 다 클릭시 전체동의버튼 눌러지기 
for(let ch of cn){
	ch.addEventListener('click',function(){
		let result="true"
		for(c of cn){
			if(!c.checked){
				result=false;
				break;
			}
		}
		all.checked=result;
		
	});
}

//------------------------------------------------------------pill 버튼만 다 포함시 join페이지로 넘어가기 

	btn.addEventListener('click',function(){
		let result="true";
		for(let che of pill){
			if(!che.checked){
				result=false;
				break;
			}
		}
		pill.checked=result;
		if(result){
			location.href="./join";
		}else{
			alert("필수 약관에 동의하세요");
		}
	});






/*
btn.addEventListener('click', function(){
	if(pill.checked){
		location.href="./join";
	}else{
		alert('필수약관에 동의하세요');
	}
});

*/









