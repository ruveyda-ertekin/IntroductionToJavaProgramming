package chapter05;

import java.util.Scanner;

public class Exercise05_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Loan amount :");
		double amount = input.nextDouble();

		System.out.print("Number of years: ");
		int years = input.nextInt();

		System.out.println("Interest Rate     Monthly Payment     Total Payment");

		for (double interestRate = 5.0; interestRate <= 8; interestRate += 0.125) {
			System.out.printf("%-5.3f", interestRate);
			System.out.print("%              ");

			double monthlyInterestRate = interestRate / 1200;

			double monthlyPayment = amount * monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));

			System.out.printf("%-19.2f", monthlyPayment);

			System.out.printf("%-8.2f\n", (monthlyPayment * years) * 12);
		}

	}

}
