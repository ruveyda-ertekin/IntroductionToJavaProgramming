package chapter03;

import java.util.Scanner;

public class Exercise03_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Enter the exchange rate from dollars to RMB :");
		double exchangeRate = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa :");
		double convert = input.nextDouble();
		
		if(convert == 0) {
			System.out.print("Enter the dollar amount: ");
			double usd = input.nextDouble();
			
			convert = exchangeRate * usd ;
			System.out.println("$"+usd+" is "+convert+" yuan.");
		} else if (convert == 1) {
			System.out.print("Enter the RMB amount: ");
			double rmb = input.nextDouble();
			
			convert = ((int)((rmb * 100) / exchangeRate)) / 100.0 ;
			System.out.println(rmb+" yun is $"+convert);
			
		} else {
		System.out.println("Incorrect input");
		}
	}

}
