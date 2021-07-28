import java.util.Scanner;

public class returnType{
	public static double calculateTotalMealPrice(double listedMealPrice,
												double tipRate,
												double taxRate){
		double tip = tipRate * listedMealPrice;
		double tax = taxRate * listedMealPrice;
		double result = listedMealPrice + tip + tax;
		return result;
	}
	public static void main(String[] args){
		double total = calculateTotalMealPrice(100, .2, 0.08);
		//calculateTotalMealPrice(25.0, .2, 0.08);
		System.out.println(total);
	}
}