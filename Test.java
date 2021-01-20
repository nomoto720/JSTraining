import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		String input;
		String ans="";
		System.out.print("Q1.>");
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
