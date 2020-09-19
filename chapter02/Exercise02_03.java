package chapter02;

import java.util.Scanner;

public class Exercise02_03 {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		final double birFeet = 0.305 ;
		
		System.out.println("Metresini hesaplamak icin feet giriniz : ");
		double feet= klavye. nextDouble();
		
		double metre = feet * birFeet ;
		
		System.out.println(feet+" feet "+metre+" metredir.");

	}

}
