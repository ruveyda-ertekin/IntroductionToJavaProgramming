package chapter03;

import java.util.Scanner;

public class Exercise03_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sayi1 = (int)(Math.random() * 10) ;
		int sayi2 = (int)(Math.random() * 10) ;
		int sayi3 = (int)(Math.random() * 10) ;
		
		System.out.print(sayi1 + " + " + sayi2 +" + " +sayi3+" toplami nedir?" );
		int answer = input.nextInt();
		
		System.out.println(sayi1 + " + " + sayi2 +" + " +sayi3+ " cevabi "+(sayi1+sayi2+sayi3==answer));
		
	}

}
