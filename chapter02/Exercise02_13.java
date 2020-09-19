package chapter02;

import java.util.Scanner;

public class Exercise02_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final double aylikFaizOrani = 0.00417 ;
		
		System.out.println("Enter the monthly saving amount : ");
		double amount = input.nextDouble();	
		
		double monthly = 100 * (1 + aylikFaizOrani);
		
		monthly = ( 100 + monthly ) * (1 + aylikFaizOrani); 
		monthly = ( 100 + monthly ) * (1 + aylikFaizOrani);
		monthly = ( 100 + monthly ) * (1 + aylikFaizOrani);
		monthly = ( 100 + monthly ) * (1 + aylikFaizOrani);
		monthly = ( 100 + monthly ) * (1 + aylikFaizOrani);
		
		System.out.println("After the sixth month, the account value is : "+monthly);
	}

}
