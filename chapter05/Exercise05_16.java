package chapter05;

import java.util.Scanner;

public class Exercise05_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Bir sayi giriniz: ");
		int sayi = input.nextInt();

		int bölen = 2;
		while ((sayi / bölen) != 1) {
			if (sayi % bölen == 0) {
				System.out.print(bölen + ", ");
				sayi = sayi / bölen;
			} else {
				bölen++;
			}
		}
		System.out.print(sayi + ". ");
	}

}
