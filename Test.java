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
		ans="";
		System.out.println("Q2.");
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
