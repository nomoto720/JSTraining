'use strict';
//onload　全ての文章の読み込みが終わったとき
window.onload=()=>{
	let images=document.getElementsByClassName('headerImage');
	let zIndexMax=0;
	let zIndexChange=(eve)=>{eve.target.style.zIndex=++zIndexMax;};
	let xChange=eve=>{
	}
	for(let i=0;i<images.length;i++){
		images[i].addEventListener("click",zIndexChange);
		images[i].addEventListener("mouseover",xChange);
	}
}
