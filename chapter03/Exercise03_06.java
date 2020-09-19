package chapter03;

import java.util.Scanner;

public class Exercise03_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.println("Enter feet :");
		double feet = input.nextDouble();

		System.out.println("Enter inches: ");
		double inches = input.nextDouble();

		final double poundBasinaKilogram = 0.45359237;
		final double inchBasinaMetre = 0.0254;
		final double feetBasinaInch = 0.0833333;

		double kilogramAgirligi = weight * poundBasinaKilogram;
		double toplamUzunluk = (inches += feet / feetBasinaInch) * inchBasinaMetre;
		double bmi = weight / (inches * inches);

		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30.0)
			System.out.println("Owerweight");
		else
			System.out.println("Obese");
	}

}
