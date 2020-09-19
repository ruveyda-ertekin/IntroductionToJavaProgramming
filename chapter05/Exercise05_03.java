package chapter05;

import java.util.Scanner;

public class Exercise05_03 {

	public static void main(String[] args) {
		
		System.out.println("Kilograms         Pounds");
		
		for (int kg = 1; kg <= 199 ; kg +=2) {
		double sonuc = kg * 2.2 ; 
		
		System.out.printf("%d                %.1f\n",kg,(sonuc));
		}

	}

}
