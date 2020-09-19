package chapter04;

import java.util.Scanner;

public class Exercise04_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee's name: ");
		String name = input.nextLine();

		System.out.print("Enter number of hours worked in a week :");
		double hoursWorked = input.nextDouble();

		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();

		System.out.print("Enter federal tax with holding rate: ");
		double federalTaxRate = input.nextDouble();

		System.out.print("Enter state tax with holding rate: ");
		double stateTaxRate = input.nextDouble();

		double federal, grossPay, state, totalDeduction;
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Rate: $" + hourlyPayRate);

		System.out.println("Gross Pay: $" + (grossPay = hoursWorked * hourlyPayRate));
		System.out.println("Deductions: ");

		System.out.println("  Fedaral Withholding (20.0 %) : $" + (federal = grossPay * federalTaxRate));

		System.out.println("  State Withholding ( 9.0 % ): $" + (state = grossPay * stateTaxRate));

		System.out.println("  Total Deduction: $" + (totalDeduction = federal + state));

		System.out.println("Net Pay: $" + (grossPay - totalDeduction));
	}

}
