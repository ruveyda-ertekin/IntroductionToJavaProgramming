package chapter03;

import java.util.Scanner;

public class Exercise03_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the time zone offset to GMT: ");
		int gmt = input.nextInt();

		long toplamMilisaniye = System.currentTimeMillis();

		System.out.println("toplamMilisaniye = " + toplamMilisaniye);
		long toplamSaniye = toplamMilisaniye / 1000;

		System.out.println("toplamSaniye = " + toplamSaniye);
		long suankiSaniye = toplamSaniye % 60;

		System.out.println("suankiSaniye = " + suankiSaniye);
		long toplamDakika = toplamSaniye / 60;

		System.out.println("toplamDakika = " + toplamDakika);
		long suankiDakika = toplamDakika % 60;

		System.out.println("suankiDakika = " + suankiDakika);
		long toplamSaat = toplamDakika / 60;

		System.out.println("toplamSaat = " + toplamSaat);
		long suankiSaat = toplamSaat % 24;

		System.out.println("suankiSaat = " + suankiSaat);
		suankiSaat = suankiSaat + gmt;

		if (suankiSaat > 12) {
			suankiSaat = suankiSaat - 12;
			System.out.println("Suanki saat "+suankiSaat + ":" + suankiDakika + ":" + suankiSaniye + " PM");
		} else {
			System.out.println("Suanki saat "+suankiSaat + ":" + suankiDakika + ":" + suankiSaniye + " AM");
		}
	}

}
