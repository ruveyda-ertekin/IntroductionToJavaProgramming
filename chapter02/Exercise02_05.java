package chapter02;

import java.util.Scanner;

public class Exercise02_05 {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Ara toplam ve komisyon oranýný giriniz : ");
		double komisyonMiktari = klavye.nextDouble();
		double komisyonOrani = klavye.nextDouble(); 
		
		double araToplam = komisyonMiktari * (komisyonOrani / 100); 
		double komisyonToplami = komisyonMiktari + araToplam ;
		
		System.out.println("Ara toplam "+araToplam+" Komisyon toplamý "+komisyonToplami);
		
	}

}
