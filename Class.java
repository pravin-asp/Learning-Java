import java.util.Scanner;
public class Class{
	public static void main(String[] args){
		Triangle triangleA = new Triangle(15, 8, 15, 8, 7);
		Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
		
		double triangleAArea = triangleA.findArea();
		System.out.println(triangleAArea);
		
		double triangleBArea = triangleB.findArea();
		System.out.println(triangleBArea);
	}
}
