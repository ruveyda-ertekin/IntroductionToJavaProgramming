package chapter02;

import java.util.Scanner;

public class Exercise02_01 {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner (System.in);
		
		System.out.print("Enter a degree in Celcius : ");
		
		double celcius = klavye.nextDouble();
		
		double fahrenhayt = (9.0 / 5) * celcius + 32 ;
				
		System.out.println(celcius + " Celcius is "+ fahrenhayt+ " Fahrenhayt");
		
		

	}

}
