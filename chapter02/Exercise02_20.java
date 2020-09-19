package chapter02;

import java.util.Scanner;

public class Exercise02_20 {

	public static void main(String[] args) {
		//  Faiz hesaplama //
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter balance and interest rate ( e.g., 3 for 3%): ");
		double bakiye  = input.nextDouble();
		double yillikFaizOrani = input.nextDouble();
		
		double faizGetirisi = bakiye * ( yillikFaizOrani / 1200) ;
		
		System.out.println("The interest is : "+faizGetirisi);
	}

}
