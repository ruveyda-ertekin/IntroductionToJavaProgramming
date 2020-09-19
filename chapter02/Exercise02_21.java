package chapter02;

import java.util.Scanner;

public class Exercise02_21 {

	public static void main(String[] args) {
		// Finans uygulamasi : Yatirim geri dönüþ degeri //
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount :");
		double yatirimMiktari = input.nextDouble();
		
		System.out.println("Enter annual interest rate in percentage :");
		double aylikFaizOrani = input.nextDouble();
		aylikFaizOrani /= 1200;
		
		System.out.println("Enter number of years : ");
		int yilSayisi = input.nextInt();
		
		double yatirimGeriDönüsDegeri = 
				yatirimMiktari * Math.pow(1 + aylikFaizOrani, yilSayisi * 12);
		
		System.out.println("Accumulated value is : "+yatirimGeriDönüsDegeri);
	}

}
