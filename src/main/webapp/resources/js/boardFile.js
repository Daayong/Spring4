/**
 * boardFile.js
 	최대 5개 까지만 추가 가능 
 */
 
let files='<div class="input-group mb-3">';
 files=files+'<input type="file" class="form-control">';
 files=files+ '<button class="btn btn-outline-secondary del" type="button" id="button-addon2">Button</button>';
 files=files+'</div>';
 
 let count=0;
 
 $('#fileAdd').click(function(){
	if(count<5){
		count++;
		$("#fileAddResult").append(files);	
	}else{
		alert('최대 5개까지만 가능');
	}
});

$('.del').click(function(){
	alert('취소');
});

 
 
 
 
 
 
 