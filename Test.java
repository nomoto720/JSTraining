import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		String input;
		String ans="document.getElementById(\"name\").textContent=str;";
		System.out.println("Q1.Idがnameのhtmlにstrを表示できるようにせよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("一行目正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="const name=\"Tom\";";
		System.out.println("Q2.定数nameを宣言し文字列Tomを代入せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="let nums=[1,2,3]";
		System.out.println("Q3.配列numsを宣言し1,2,3を代入せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="console.log(nums[0])";
		System.out.println("Q3.配列nmusの一番目の要素をコンソールに表示せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="let fnc1=function(str){console.log(str);};";
		System.out.println("Q4.引数strをコンソールに表示するメソッドfnc1を作成せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="fnc1(\"あ\")";
		System.out.println("Q5.メソッドfnc1に文字列あを引数に宣言せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="let pele=document.getElementsByTagName(\"p\");";
		System.out.println("Q6.htmlのpタグのブロックを全て変数peleに代入せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="const func2=(x)=>{console.log(x);};";
		System.out.println("Q7.ラムダ式でコンソールに引数を表示するfunc2メソッドを作成せよ。");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="const func2=x=>{console.log(x);};";
		System.out.println("Q8.Q7の引数を略して表示せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="const func2=x=>console.log(x);";
		System.out.println("Q9.Q8のメソッドも略して表示せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="let num=document.getElementById(\"isNum\").value;";
		System.out.println("Q10.inputの名前inNumからきた文字列をインスタンスnumに代入せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="strs.push('hello');";
		System.out.println("Q11.strs配列の末尾に文字列helloを追加せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="let strs=[];";
		System.out.println("Q12.空の配列strsを作成せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="let obj1={name:\"Tom\",age:29};";
		System.out.println("Q13.オブジェクトobj1を作りプロパティに名前Tomと年齢29を代入せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="obj1.gender='man';";
		System.out.println("Q14.obj1にgenderのプロパティを追加しmanを代入せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="console.log(obj1.gender);";
		System.out.println("Q14.obj1のgenderプロパティの中身をコンソールに表示せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="window.alert('Hello');";
		System.out.println("Q15.暗黙オブジェクトのwindowのアラートでHelloと表示せよ");	
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="window.onload=function(){};";
		System.out.println("Q16.文章が読み込まれてからfunctionメソッドを実行する処理をかけ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="'3'===3";
		System.out.println("Q17.文字列の3とint型の３を型も含めて同じかどうか判断する条件文");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="document.createElement(\"li\");";
		System.out.println("Q18.jsでliタグを作成せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="li.textContent='Item';";
		System.out.println("Q19.Q18のliタグに文字列Itemを代入せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="ol.appendChild(li);";
		System.out.println("Q19.Q18で作ったliタグをolタグの子要素にせよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="document.querySelectorAll(\"a\");";
		System.out.println("Q19.セレクタタグのaのドムを全て取得せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="p.textContent=null;";
		System.out.println("Q20.p要素の子要素をすべて削除せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="num=parseInt(num);";
		System.out.println("Q21.文字列numの値5をInt型にしてnumに代入せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="const btCheck=()=>{console.log('送信完了');};";
		System.out.println("Q22.ボタンが押されたときに実行するbtCheckメソッドを書け。送信完了とコンソールに表示される");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="window.confirm('18歳以上ですか?');";
		System.out.println("Q23.暗黙オブジェクトのwindowでコンフォームを使って 18歳以上ですか？　と表示せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="let name=window.prompt('名前は?');";
		System.out.println("Q24.暗黙オブジェクトwindowで名前は？と聞き入力させよ。入力された値はnameに代入する");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="<button onclick=\"btCalc()\">計算</button>";
		System.out.println("Q25.計算ボタンを押したらbtCalcのファンクションが実行されるようにhtmlで記述せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="console.log(nums.join(','));";
		System.out.println("Q26.配列numsを,で区切ってコンソールで表示せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="<button onclick=\"goukaku('合格')\">合格</button>";
		System.out.println("Q27.合格ボタンを押すと文字列の合格が値に代入されgoukakuファンクションに飛んでくhtmlをかけ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="let n=Math.floor(Math.random()*4);";
		System.out.println("Q28.整数で0から3までの乱数を出しnに代入せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="const ele=document.getElementById(\"work\");";
		System.out.println("Q29.Idがworkのドムを定数eleに代入せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="ele.addEventListener('click',modify);";
		System.out.println("Q30.workをクリックしたらmodifyファンクションが実行されるようにせよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="ele.addEventListener('mouseover',modify);";
		System.out.println("Q31.workにマウスを乗っけたらmodifyファンクションが実行させるようにせよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="ele.addEventListener('mouseout',modify);";
		System.out.println("Q32.workからマウスを話したらmodifyファンクションが実行さ流用にせよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="ele.style.backgroundColor='yellow';";
		System.out.println("Q33.workの背景色をイエローにせよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="ele.style.borderRadius='100px';";
		System.out.println("Q34.workの角を丸くせよ100pxで");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="document.getElementById(\"a\").addEventListener('click',my);";
		System.out.println("Q35.イベントリスナーでボタンaが押されたらmyファンクションが実行されるようにせよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="const my=(e)=>{document.getElementById(\"result\").textContent=e.target.textContent;";
		System.out.println("Q36.Q35で登場したmyファンクションを作成せよ。事項されるとタグresultにaと表示される");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println("jQuery問題");
		ans="$(function(){$('#logo').css({color:'yellow',fontSize:'10px'});});";
		System.out.println("Q37.id logoの文字色を黄色、文字サイズを10pxにするファンクションを作成せよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="$(function(){$('#logo').css({color:'yellow',fontSize:'10px'}).on('click',function(){$(this).css({color:'red'})});});";
		System.out.println("Q38.メソッドチェーンで先程のメソッドにlogoをクリックしたときに文字色をredにするようにせよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="$(function(){$('#logo').on('click',function(){$(this).animete({opacity:0,fontSize:'0px'},2000);});});";
		System.out.println("Q39.先程のlogoをクリックしたらアニメーション2秒で消え文字が0pxになるようにせよ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="easeOutBounce";
		System.out.println("Q40.もとの戻す処理はanimateの最後にないをつけるか");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="use strict";
		System.out.println("Q41.スクリプトの冒頭で厳密に定義する文言");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="window.addEventListener('load',()=>{};";
		System.out.println("Q42.jsファイスが読み込んだら実行させる省略で");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
		ans="ele.innerHTML='<p>合格</p>';";
		System.out.println("Q43.eleというドムに<p>合格</p>と送れ");
		while(true){
			input=sc.nextLine();
			if(ans.equals(input)){
				System.out.println("正解です");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println();
	}
}
