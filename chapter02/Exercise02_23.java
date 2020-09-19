package chapter02;

import java.util.Scanner;

public class Exercise02_23 {

	public static void main(String[] args) {
		// Yakit maliyeti //
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance :");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon :");
		double miles = input.nextDouble();
		
		System.out.println("Enter price per gallon :");
		double price = input.nextDouble();
		
		double costDriving = ( distance / miles )  * price ;
		
		System.out.println("The cost of driving is :"+costDriving);

	}

}
