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
		ans="let func1=function(str){console.log(str);}";
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
		ans="let pele=document.getElementsByTagName('p')";
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
		ans="let num=document.getElementById(\"isNum\")";
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
		ans="let strs=[]";
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
		ans="document.createElement('li')";
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
		ans="ls.textContent='Item';";
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
		ans="document.querySelectorAll('a');";
		System.out.println("Q19."タグのaのドムを全て取得せよ);
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
		ans="";
		System.out.println("Q22.");
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
		System.out.println("Q23.");
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
		System.out.println("Q24.");
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
		System.out.println("Q25.");
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
		System.out.println("Q26.");
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
		System.out.println("Q27.");
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
