//'use strict';
window.onload=()=>{
	const entry1=document.getElementById('entry1');
	const entry2=document.getElementById('entry2');
	const entry3=document.getElementById('entry3');

	const entry4=document.getElementById('entry4');
	const entry5=document.getElementById('entry5');
	const entry6=document.getElementById('entry6');
	const entry7=document.getElementById('entry7');
	const entry8=document.getElementById('entry8');
	const entry9=document.getElementById('entry9');
	const entry10=document.getElementById('entry10');
	const entry11=document.getElementById('entry11');
	const entry12=document.getElementById('entry12');

	const btn1=document.getElementById('btn1');
	const btn2=document.getElementById('btn2');

	const btn3=document.getElementById('btn3');
	const btn4=document.getElementById('btn4');
	const btnADC=document.getElementById('btnADC');
	const alcoholDegreeBefore=document.getElementById('alcoholDegreeBefore');
	const result=document.getElementById('result');
	const result1=document.getElementById('result1');
	const result2=document.getElementById('result2');
	const result3=document.getElementById('result3');
	const result4=document.getElementById('result4');
	const result5=document.getElementById('result5');
	const bacBox7=document.getElementById('bacBox7');
	const bacBox8=document.getElementById('bacBox8');	
	const waterColor=document.getElementById('waterColor');
	const cup=document.getElementById('cup');
	const cup2=document.getElementById('cup2');
	const tvButtonBox=document.getElementById('tvButtonBox');
	const tvButton1=document.getElementById('tvButton1');
	const tvButton2=document.getElementById('tvButton2');
	const switchLabel=document.getElementById('switchLabel');
	const check=document.getElementById('switch');

	let alcohol=0;
	let degree=0;
	let water=0;
	let degree2=0;
	let mizuwari=0;
	let r=242;
	let g=235;
	let b=165;
	let wave=8;
	let cCode="#f2e6a0";

	let weight=0;
	let beer=0;
	let highball=0;
	let wine=0;
	let sake=0;
	let shochu=0;
	let whiskey=0;
	let otherAlcohol=0;
	let otherNum=0;
	let bloodCon=0;
	
	
	let mr=-4;
	let mt=28;
	let num=[3,7,10,12];
	for(let j=0;j<4;j++){
		for(let i=0;i<4;i++){
			if(j==0){	mr+=num[i]; mt-=num[3-i];
			}else if(j==1){ mr+=num[3-i]; mt+=num[i];		
			}else if(j==2){ mr-=num[i]; mt+=num[3-i];
			}else{ mr-=num[3-i]; mt-=num[i]; }		
		const elem=document.createElement('div');
		elem.style.position="absolute";
		elem.style.margin=mr+"px";	
		elem.style.marginTop=mt+"px";
		elem.style.width="8px";
		elem.style.height="8px";
		elem.style.backgroundColor="#000011";
		elem.style.borderRadius="50%";
		cup.appendChild(elem);	
		}
	}
	mr=-4;
	mt=28;
	for(let j=0;j<4;j++){
		for(let i=0;i<4;i++){
			if(j==0){	mr+=num[i]; mt-=num[3-i];
			}else if(j==1){ mr+=num[3-i]; mt+=num[i];		
			}else if(j==2){ mr-=num[i]; mt+=num[3-i];
			}else{ mr-=num[3-i]; mt-=num[i]; }		
		const elem=document.createElement('div');
		elem.style.position="absolute";
		elem.style.margin=mr+"px";	
		elem.style.marginTop=mt+"px";
		elem.style.width="8px";
		elem.style.height="8px";
		elem.style.backgroundColor="#000011";
		elem.style.borderRadius="50%";
		cup2.appendChild(elem);	
		}
	}
	
	
	
	
	
	function waterWave(){
		wave=8;
		var unit = 13,
		canvas, context, canvas2, context2,
		height, width, xAxis, yAxis,
		draw;

	function init() {
		canvas = document.getElementById("sineCanvas");
		canvas.width =64; 
		canvas.height = 22;
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
		drawWave(cCode, 1, 0.1, 0);
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
		//if(wave<=35){wave+=0.01;}	
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
		mizuwari=alcohol+water;
		//if(wave>=35){ waterWave(); }
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
		cCode="#"+hex(r)+hex(g)+hex(b);
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
		let msg1=`水割りの量 <span class="resultNum">${mizuwari}</span> ml`;
		let msg=`アルコール度数 <span class="resultNum">${degree2}</span> 度`;
		result1.innerHTML=msg1;
		result.innerHTML=msg;

	});
	btn2.addEventListener('click',()=>{
		entry1.value='';
		entry2.value='';
		entry3.value='';
		degree2=0;
		mizuwari=0;
		result1.textContent='';
		result.textContent='';
	});

	function alcoholBlood(){
		weight=parseFloat(entry4.value);
		beer=parseFloat(entry5.value);
		highball=parseFloat(entry6.value);
		wine=parseFloat(entry7.value);
		sake=parseFloat(entry8.value);
		shochu=parseFloat(entry9.value);
		whiskey=parseFloat(entry10.value);
		otherAlcohol=parseFloat(entry11.value);
		otherNum=parseFloat(entry12.value);

		let pureAlcohol=(beer*0.05)+(highball*0.07)+(wine*0.12)+(sake*0.15)+(shochu*0.25)+(whiskey*0.40)+(otherNum*(otherAlcohol/100));
		bloodCon=pureAlcohol/(833*weight)*100;
	}
	btn3.addEventListener('click',()=>{
		alcoholBlood();
		resultBC=Math.round(bloodCon*Math.pow(10,2))/Math.pow(10,2);
		let drunk;
		if(resultBC<0.05){
			drunk="爽快期";
		}else if(resultBC<0.10){
			drunk="ほろ酔い期";
		}else if(resultBC<0.15){
			drunk="酩酊初期";
		}else if(resultBC<0.30){
			drunk="酩酊期";
		}else if(resultBC<0.40){
			drunk="泥酔期";
		}else{
			drunk="昏睡期";
		}
		result2.innerHTML="アルコール血中濃度";
		result3.innerHTML=resultBC+"%";
		result4.innerHTML="酔いの程度";
		result5.innerHTML=drunk;
		btn4.innerHTML="<span class='smallFont2 result6'>クリア</span>ここをクリック";
		bacBox7.style.marginTop="40px";
		bacBox8.style.marginTop="40px";
		bacBox8.style.marginBottom="40px";
	});
	btn4.addEventListener('click',()=>{
		entry4.value=0;
		entry5.value=0;
		entry6.value=0;
		entry7.value=0;
		entry8.value=0;
		entry9.value=0;
		entry10.value=0;
		entry11.value=0;
		entry12.value=0;
		result2.textContent="";
		result3.textContent="";
		result4.textContent="";
		result5.textContent="";
		btn4.textContent="";
		bacBox7.style.marginTop="";
		bacBox8.style.marginTop="";
		bacBox8.style.marginBottom="";
	});
	let onOff=true;
	btnADC.addEventListener('click',()=>{
		if(onOff==true){
			onOff=false;
			alcoholDegreeBefore.style.opacity="1";	
		}else if(onOff==false){
			onOff=true;
			alcoholDegreeBefore.style.opacity="0";
		}
		alcoholDegreeBefore.style.transitionProperty="all";
		alcoholDegreeBefore.style.transitionDuration="3000ms";
		alcoholDegreeBefore.style.transitionTimingFunction="ease";

	});

	
	
	check.addEventListener("change", () => {

  if (check.checked === false) {
	tvButtonBox.style.marginTop="-65px";
	tvButtonBox.style.marginLeft="40px";
				tvButtonBox.style.left="0";
				tvButtonBox.style.padding="22px";
				switchLabel.style.padding="18px";
				switchLabel.style.background="linear-gradient(135deg,#444,#000)";
				switchLabel.style.border="none";
				switchLabel.style.boxShadow="2px 2px 1px #000,-1.3px -1.3px 3px #000"
				tvButton1.style.top="0.8px";
				tvButton1.style.left="0.8px";
				tvButton1.style.background="linear-gradient(135deg,#000,#444)";
				tvButtonBox.style.transitionProperty="";
				tvButtonBox.style.transitionDuration="";
				tvButtonBox.style.transitionTimingFunction="";
				tvButtonBox.style.transitionDelay="";
				tvButton1.style.transitionProperty="";
				tvButton1.style.transitionDuration="";
				tvButton1.style.transitionTimingFunction="";
				tvButton1.style.transitionDelay="";
				tvButton2.style.transitionProperty="";
				tvButton2.style.transitionDuration="";
				tvButton2.style.transitionTimingFunction="";
				tvButton2.style.transitionDelay="";
				switchLabel.style.transitionProperty="";
				switchLabel.style.transitionDuration="";
				switchLabel.style.transitionTimingFunction="";
				switchLabel.style.transitionDelay="";
				tvButton1.style.padding="22px";
				tvButton2.style.top="";
				tvButton2.style.left="";
				tvButton2.style.padding="0";
				tvButton2.style.opacity="0";
	}

if (check.checked === true) {
				tvButtonBox.style.marginTop="-500px";
				tvButtonBox.style.marginLeft="0";
				tvButtonBox.style.left="46%";
				switchLabel.style.padding="30px";
				switchLabel.style.top="4.4px";
				switchLabel.style.left="4.4px";
				switchLabel.style.background="linear-gradient(135deg,#444,#000 45px,#ea472c 60px, #240601)";
				switchLabel.style.borderBottom="1.5px solid #560f03";
				switchLabel.style.borderRight="1.5px solid #560f03";
				switchLabel.style.boxShadow="2px 2px 1px #000,-1.3px -1.3px 3px #000,2px 2px 1px #f59080 inset";
				switchLabel.style.backgroundSize="90px 150px";
				switchLabel.style.backgroundPosition="0 100%";
				tvButton1.style.padding="36px";
				tvButton1.style.background="linear-gradient(135deg,#000,#444 45px, #240601 60px,#bc311a )";
				tvButton1.style.backgroundSize="90px 150px";
				tvButton1.style.backgroundPosition="0 100%";
				tvButton2.style.padding="46px";
				tvButton2.style.top="-9px";
				tvButton2.style.left="-9px";
				tvButton2.style.opacity="1";
				tvButtonBox.style.transitionProperty="all";
				tvButtonBox.style.transitionDuration="3000ms";
				tvButtonBox.style.transitionTimingFunction="ease";
				tvButtonBox.style.transitionDelay="2s";
				tvButton1.style.transitionProperty="all";
				tvButton1.style.transitionDuration="3000ms";
				tvButton1.style.transitionTimingFunction="ease";
				tvButton1.style.transitionDelay="2s";
				tvButton2.style.transitionProperty="all";
				tvButton2.style.transitionDuration="3000ms";
				tvButton2.style.transitionTimingFunction="ease";
				tvButton2.style.transitionDelay="2s";
				switchLabel.style.transitionProperty="all";
				switchLabel.style.transitionDuration="3000ms";
				switchLabel.style.transitionTimingFunction="ease";
				switchLabel.style.transitionDelay="2s";
  }
	});

}