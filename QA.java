import java.util.Scanner;

public class QA{
	public static void main(String[] args){
		String q = "What is the capital city of Indai?";
		String c1 = "chennai";
		String c2 = "mumbai";
		String c3 = "newdelhi";
		
		String ca = c3;
		
		System.out.println(q);
		System.out.println("1." + c1 + " 2." + c2 + " 3." + c3);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your answer:");
		String ans = input.next();
		
		if(ca.equals(ans.toLowerCase())){
			System.out.println("Congrats");
		}
		else{
			System.out.println("Sorry, the answer is " + ca);
		}
	}
}