import java.util.Scanner;

public class QA{
	public static void main(String[] args){
		String q = "What is the capital city of Indai?";
		String c1 = "Chennai";
		String c2 = "Mumbai";
		String c3 = "Delhi";
		
		String ca = c3;
		
		System.out.println(q);
		System.out.println("1." + c1 + " 2." + c2 + " 3." + c3);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your answer:");
		String ans = input.next();
		
		if(ans.equals(ca)){
			System.out.println("Congrats");
		}
		else{
			System.out.println("Sorry, the answer is " + ca);
		}
	}
}