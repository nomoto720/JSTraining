import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		String input;
		String ans="name=input('名前は?')";
		System.out.println("Q1.名前は？と表示し入力させ値をnameに代入せよ");
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
		ans="age=int(input('年齢は?'))";
		System.out.println("Q2.年齢は？と表示し値を整数でageに代入せよ");
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
		ans="HelloHello";
		System.out.println("Q3.print('Hello'*2)はなんと表示されるか");
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
		ans="height=float(input('身長は?')";
		System.out.println("Q3.身長は?と表示し小数点のある値で受け取りheightに代入せよ");
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
		ans="1010";
		System.out.println("Q4.x='10' y='10' print(x+Y)はなんて表示される？");
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
		ans="print(i,end=' ')";
		System.out.println("Q5.fou文で繰り返されるprint(i)を半角スペースであけて表示");
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
		ans="num=random.randint(1,100)";
		System.out.println("Q6.1から100の整数の乱数をnumに代入せよ");
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
		ans="nums.append(5)";
		System.out.println("Q7.リストnumsに値5を追加せよ");
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
		ans="[1,2,3,1,2,3,1,2,3]";
		System.out.println("Q8.data=[1,2,3]*3　print(data)は何を表示するか");
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
		ans="5";
		System.out.println("Q9.data=[[0]*10]*10 data[1][1]=5 print(data[2][1])はなんと表示されるか");
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
		ans="kuku=[[i*j for j in range(1,10)]for i in range(1,10)]";
		System.out.println("Q10.内包表記で掛け算の二次元リストを作成しkukuに代入せよ");
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
		ans="print(set(nums))";
		System.out.println("Q11.nums=[1,2,2,3]を{1,2,3}と表示せよ");
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
		ans="print(len(set(nums)))";
		System.out.println("Q12.リストnumsの値の種類の数を表示せよ";
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
		ans="num=random.randrange(10,100,5)";
		System.out.println("Q13.10から99の数字で5の倍数でのランダム数をnumに代入せよ");
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
		ans="n.sort()";
		System.out.println("Q14.n=[3,2,4]を昇順に書き換えろ");
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
		ans="window.alert('n.sort(reverse=True)');";
		System.out.println("Q15.先ほどのリストnを降順に書き換えろ");	
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
		ans="n2=sorted(n,reverse=True)";
		System.out.println("Q16.先ほどのnはそのままに降順にしn2に代入せよ");
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
		ans="n3=sorted(n)";
		System.out.println("Q17.先ほどのnはそのままに昇順に書き換えn3に代入せよ");
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
		ans="(user+3-px)%3==2";
		System.out.println("Q18.pcとuserでじゃんけん。userが勝ったときの条件文を作成せよ");
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
		ans="random.shuffle(l)";
		System.out.println("Q19.リストlをランダムにシャッフルせよ");
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
		ans="";
		System.out.println("Q20.");
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
		ans="";
		System.out.println("Q21.");
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
		ans="$(function(){$('#logo').css({color:'yellow',fontSize:'30px'}).on('click',function(){$(this).css({color:'red'})});});";
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