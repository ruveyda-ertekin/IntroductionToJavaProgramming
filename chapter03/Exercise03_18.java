package chapter03;

import java.util.Scanner;

public class Exercise03_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Kargonun aðýrlýðýný giriniz : ");
		double w = input.nextDouble();
		
		
		if (w > 50)
			System.out.println("Bu paket kargolanamaz.");

		else
		{
			double agirlikBasiKargoucreti ;
			if (0 < w && w <= 1)
				agirlikBasiKargoucreti = 3.5 ;
			else if (1 < w && w <= 3)
				agirlikBasiKargoucreti = 5.5;
			else if (3 < w && w <= 10)
				agirlikBasiKargoucreti = 8.5;
			else
				agirlikBasiKargoucreti = 10.5;
		System.out.println("Kargonun aðýrlýðý : "+(agirlikBasiKargoucreti * w)+" TL'dir.");
		}
	}
}
