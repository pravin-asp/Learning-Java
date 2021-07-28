import java.util.Scanner;

public class Function{
	public static void announceDevelpoerTeaTime(){
		System.out.println("Waiting for developer tea time...");
		System.out.println("Type a random word : ");
		Scanner input = new Scanner(System.in);
		input.next();
		System.out.println("It's developer tea time!");
	}
	public static void main(String[] args){
		System.out.println("Welcome to new Job!");
		
		announceDevelpoerTeaTime();
		
		System.out.println("Write code");
		System.out.println("Review code");
		
		announceDevelpoerTeaTime();
		
		System.out.println("Get promoted!");
	}
}