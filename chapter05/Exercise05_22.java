package chapter05;

import java.util.Scanner;

public class Exercise05_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Kredi miktari: ");
		double krediMiktari = input.nextDouble();

		System.out.print("Yil: ");
		int yil = input.nextInt();

		System.out.print("Faiz orani: ");
		double yillikFaizOrani = input.nextDouble();

		double aylikFaizOrani = yillikFaizOrani / 1200;
		double aylikOdeme = krediMiktari * aylikFaizOrani / (1 - 1 / Math.pow(1 + aylikFaizOrani, yil * 12));
		double toplamOdeme = aylikOdeme * yil * 12;

		System.out.println("Aylik Odeme :  " + aylikOdeme);
		System.out.println("Toplam Odeme:  " + toplamOdeme);

		System.out.printf("%s %13s %18s %21s\n", "#Odeme", "Faiz", "Ana Para", "Kredi Miktari");

		double faiz, anaPara;

		for (int i = 1; i <= yil * 12; i++)
		{
			faiz = aylikFaizOrani * krediMiktari;
			anaPara = aylikOdeme - faiz;
			krediMiktari = krediMiktari - anaPara;

			System.out.printf("%d ", i);
			System.out.printf("%19.2f ", faiz);
			System.out.printf("%15.2f ", anaPara);
			System.out.printf("%17.2f ", krediMiktari);
			System.out.println();
		}

	}

}
