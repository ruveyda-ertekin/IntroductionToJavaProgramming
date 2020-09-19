package chapter02;

import java.util.Scanner;

public class Exercise02_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Su miktarini kilogram cinsinden giriniz = ");
		double m =input.nextDouble();
		
		System.out.print("Ýlk sicakligi santigrat cinsinden giriniz = ");
		double ilkSicakligi = input.nextDouble();
		
		System.out.print("Son sicakligi giriniz = ");
		double sonSicaklik = input.nextDouble();
		
		double q = m * (sonSicaklik - ilkSicakligi) * 4184 ;
		
		System.out.print("Enerji = " + q + " joule'dür.");
		
	}

}
