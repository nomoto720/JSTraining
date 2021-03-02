//'use strict';
window.onload=()=>{
	const entry1=document.getElementById('entry1');
	const entry2=document.getElementById('entry2');
	const entry3=document.getElementById('entry3');
	const btn1=document.getElementById('btn1');
	const btn2=document.getElementById('btn2');
	const result=document.getElementById('result');
	const waterColor=document.getElementById('waterColor');
	let alcohol=0;
	let degree=0;
	let water=0;
	let degree2=0;
	let r=242;
	let g=235;
	let b=165;
	

	function waterWave() {
			let wave=11;
var unit = 13,
    canvas, context, canvas2, context2,
    height, width, xAxis, yAxis,
    draw;

function init() {
    
    canvas = document.getElementById("sineCanvas");
    
    canvas.width =52; 
    canvas.height = 20;
    
    context = canvas.getContext("2d");
    
    height = canvas.height;
    width = canvas.width;
    
    xAxis = Math.floor(height/2);
    yAxis = 0;
    
    draw();
}

	function draw() {
    
    // キャンバスの描画をクリア
    context.clearRect(0, 0, width, height);

    //波を描画
    drawWave('#10c2cd', 1, 0.1, 0);
    
    // Update the time and draw again
    draw.seconds = draw.seconds + .009;
    draw.t = draw.seconds*Math.PI;
    setTimeout(draw, 10);
};
draw.seconds = 0;
draw.t = 0;

/**
* 波を描画
* drawWave(色, 不透明度, 波の幅のzoom, 波の開始位置の遅れ)
*/
function drawWave(color, alpha, zoom, delay) {
    context.fillStyle = color;
    context.globalAlpha = alpha;

    context.beginPath(); //パスの開始
    drawSine(draw.t / 0.3, zoom, delay);
    context.lineTo(width + 10, height); //パスをCanvasの右下へ
    context.lineTo(0, height); //パスをCanvasの左下へ
    context.closePath() //パスを閉じる
    context.fill(); //塗りつぶす
}

function drawSine(t, zoom, delay) {

    var x = t; //時間を横の位置とする
    var y = Math.sin(x)/zoom;
    context.moveTo(yAxis, unit*y+xAxis); //スタート位置にパスを置く
    
				// Loop to draw segments (横幅の分、波を描画)

		for (i = yAxis; i <= width + 10; i += 10) {
			x = t+(-yAxis+i)/unit/zoom;			
			y = Math.sin(x - delay)/wave;
		
			context.lineTo(i, unit*y+xAxis);
		}
		wave+=0.04;
}
init();

}
waterWave();

	function alcoholCalc(){
		alcohol=parseFloat(entry1.value);
		degree=parseFloat(entry2.value);
		water=parseFloat(entry3.value);
		degree/=100;
		degree2=(degree*alcohol)/(alcohol+water)*100;
		degree2=degree2.toFixed(1);
		colorChange();
		waterWave();
	}
	function hex(num){
		let hex=num.toString(16);
		if(num<16){
			hex='0'+hex;
		}
		return hex;
	}
	function colorChange(){
		let num=degree2*10;
		g=230-num;
		b=160-num;
		let cCode="#"+hex(r)+hex(g)+hex(b);
		waterColor.style.borderTopColor=cCode;
	}
	entry1.addEventListener("input",function(){
		alcoholCalc();
	});
	entry2.addEventListener("input",function(){
		alcoholCalc();
	});
	entry3.addEventListener("input",function(){
		alcoholCalc();
	});
	

	btn1.addEventListener('click',()=>{
		let msg=`アルコール度数は${degree2}度です`;
		result.innerHTML=msg;

	});
	btn2.addEventListener('click',()=>{
		entry1.value='';
		entry2.value='';
		entry3.value='';
		degree2=0;
		result.textContent='';
	});

}
