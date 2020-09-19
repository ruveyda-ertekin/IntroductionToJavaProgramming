package chapter02;

import java.util.Scanner;

public class Exercise02_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("v0, v1 ve zamani giriniz =  ");
		double ilkHiz = input.nextDouble() ;
		double ikinciHiz = input.nextDouble() ;
		double zaman = input.nextDouble() ;
		
		double ivme = ((ikinciHiz - ilkHiz) / zaman) ;
		
		System.out.print("Ývme = "+ivme);
		
		
	}

}
