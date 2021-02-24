'use strict';
window.onload=()=>{
	const entry1=document.getElementById('entry1');
	const entry2=document.getElementById('entry2');
	const entry3=document.getElementById('entry3');
	const btn1=document.getElementById('btn1');
	const btn2=document.getElementById('btn2');
	const result=document.getElementById('result');
	btn1.addEventListener('click',()=>{
		let ans=entry.value.toLowerCase();
		let msg='';
		if (ans == animals[index][1]){
			correct++;
			msg='正解!';
		}else{
			msg=`不正解!${animals[index][0]}の英単語は${animals[index][1]}`;
		}
		if(index==animals.length-1){
			msg+=`<br>全${animals.length}問中,${correct}問正解`;
			index=-1;
		}
		result.innerHTML=msg;
		result.classList.remove('fade');
		setTimeout(function(){
			result.classList.add('fade');
		},1500);
		setItem(++index);
		entry.focus();
	});
	function setItem(index){
		entry.value='';
		ja.textContent=animals[index][0];
		img.src='images/'+animals[index][2];
	}
	setItem(index);
}
