package chapter05;

import java.util.Scanner;

public class Exercise05_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int yuksekPuan = 0;
		String yuksekPuanIsim = "";

		System.out.print("Toplam ogrenci sayisini giriniz: ");
		int ogrenciSayisi = input.nextInt();

		int puan;
		int IlkYuksekPuan = 0;
		int IkinciYuksekPuan = 0;

		String isim = "";
		String Ogrenci1 = "";
		String Ogrenci2 = "";

		System.out.println("Ogrencinin adini ve puanini giriniz  ");
		for (int i = 0; i < ogrenciSayisi; i++) {
			System.out.print("Ogrenci: " + (i + 1) + "\n  Isim: ");
			isim = input.next();
			System.out.print("  Puan: ");
			puan = input.nextInt();

			if (i == 0) {
				IlkYuksekPuan = puan;
				Ogrenci1 = isim;
			} else if (i == 1 && puan > IlkYuksekPuan) {
				IkinciYuksekPuan = IlkYuksekPuan;
				IlkYuksekPuan = puan;
				Ogrenci2 = Ogrenci1;
				Ogrenci1 = isim;
			} else if (i == 1 && puan > IlkYuksekPuan) {
				IkinciYuksekPuan = IlkYuksekPuan;
				IlkYuksekPuan = puan;
				Ogrenci2 = Ogrenci1;
				Ogrenci1 = isim;
			} else if (i == 1) {

				IkinciYuksekPuan = puan;
				Ogrenci2 = isim;
			} else if (i > 1 && puan > IlkYuksekPuan && puan > IkinciYuksekPuan) {

				IkinciYuksekPuan = IlkYuksekPuan;
				Ogrenci2 = Ogrenci1;
				IlkYuksekPuan = puan;
				Ogrenci1 = isim;
			} else if (i > 1 && puan > IkinciYuksekPuan) {

				Ogrenci2 = isim;
				IkinciYuksekPuan = puan;

			}

		}
		System.out.println("En yuksek puan: " + Ogrenci1 + "\nIkýnci yuksek puan: " + Ogrenci2);
	}
}
