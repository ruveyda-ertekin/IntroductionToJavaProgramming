package chapter03;

import java.util.Scanner;

public class Exercise03_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);
		
		if (sayi2 > sayi1) {
			int temp = sayi1 ;
			sayi1 = sayi2    ;
			sayi2 = temp ;
		}
		
		System.out.println(sayi1+" - "+sayi2+" = ? ");
		int answer = input.nextInt();
		
		if (sayi1 - sayi2 == answer) {
			System.out.println("Do�ru cevap!");
		} else {
			System.out.println("Yanl�� cevap.");
			System.out.println("Do�ru cevap : "+(sayi1 - sayi2)+" olmal�");
		}
		
		

	}

}
