package chapter02;

import java.util.Scanner;

public class Exercise02_14 {

	public static void main(String[] args) {
		// Vücut kitle endeksi //
		
		final double onePound = 0.45359237 ;  // kilogram//
		final double oneInch  = 0.0254 ;     // metre //
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds : ");
		double weight = input.nextDouble();
		
		System.out.println("Enter height in inches : ");
		double height = input.nextDouble();
		
		double bmi =  weight * onePound / ((height * oneInch) * (height * oneInch));
		
		System.out.println("BMI is : "+bmi);

	}

}
