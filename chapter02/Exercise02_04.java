package chapter02;

import java.util.Scanner;

public class Exercise02_04 {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		final double herPound= 0.454 ;
				
		System.out.println("Kilogramini hesaplamak icin pound degeri giriniz : ");
		double pound = klavye.nextDouble();
		
		double kilogram = pound * herPound ; 
		
		System.out.println(pound+ " pound "+kilogram+ " kilogramdir.");
		
		
	
	}

}
