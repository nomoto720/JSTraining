'use strict';
//onload　全ての文章の読み込みが終わったとき
window.onload=function(){
	let images=document.getElementsByClassName('headerImage');
	let zIndexMax=0;
	for(let i=0;i<images.length;i++){
		images[i].addEventListener("click",function(){
			this.style.zIndex=++zIndexMax;
		});
	}
}
