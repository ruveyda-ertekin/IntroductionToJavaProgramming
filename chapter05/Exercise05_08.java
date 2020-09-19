package chapter05;

import java.util.Scanner;

public class Exercise05_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int yuksekPuan = 0;
		String yuksekPuanIsim = "";

		System.out.print("Toplam ogrenci sayisini giriniz: ");
		int ogrenciSayisi = input.nextInt();

		System.out.println("Ogrencinin adini ve puanini giriniz  ");
		for (int i = 0; i < ogrenciSayisi; i++) {
			System.out.print("Ogrenci: " + (i + 1) + "\n  Isim: ");
			String isim = input.next();

			System.out.print("  Puan: ");
			int puan = input.nextInt();

			if (puan > yuksekPuan) {
				yuksekPuan = puan;
				yuksekPuanIsim = isim;
			}
		}
		System.out.println("En yuksek ogrenci puani : " + yuksekPuanIsim);

	}

}
