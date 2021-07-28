import java.util.Scanner;

public class Program{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num < 5){
			System.out.println("Enjoy the good luck a friend brings you");
		}
		else{
			System.out.println("Your shoe selection will make you very happy today");
		}
	}
}