'use strict';
window.onload=()=>{
	const entry1=document.getElementById('entry1');
	const entry2=document.getElementById('entry2');
	const entry3=document.getElementById('entry3');
	const btn1=document.getElementById('btn1');
	const btn2=document.getElementById('btn2');
	const result=document.getElementById('result');
	btn1.addEventListener('click',()=>{
		let alcohol=entry1.value;
		let degree=entry2.value;
		let water=entry3.value;
		degree*=0.01;
		let degree2=(degree*alcohol)/(alcohol+water);
		let msg=`アルコール度数は${water}度です`;
		result.innerHTML=msg;

	});
	btn2.addEventListener('click',()=>{
		entry1.value='';
		entry2.value='';
		entry3.value='';
		result.textContent='';
	});
}
