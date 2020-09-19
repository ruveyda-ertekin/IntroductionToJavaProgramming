package chapter02;

import java.util.Scanner;

public class Exercise02_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Her 7 saniyede bir dogum.");
		System.out.println("Her 13 saniyede bir olum.");
		System.out.println("her 45 saniyede yeni bir göcmen gelmektedir.");
		System.out.println("Suan nufus 312,032,486'dir");
		
		int SuankiNufus = 312032486 ;
		
		int birYilKacSaniye = 365 * 24 * 60 * 60 ;
		int yillikDogum = birYilKacSaniye / 7 ;
		int yillikOlum  = birYilKacSaniye / 13 ;
		int yillikMulteci = birYilKacSaniye / 45 ;
		
		System.out.print("Enter the number of years = ");
		int year = input.nextInt();
		
		
		int yillikArtis= yillikDogum - yillikOlum + yillikMulteci ;
		int population = SuankiNufus + (year * yillikArtis) ; 
		
		
		System.out.println("The population in "+year+" years is "+population);

	}

}
