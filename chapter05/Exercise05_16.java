package chapter05;

import java.util.Scanner;

public class Exercise05_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Bir sayi giriniz: ");
		int sayi = input.nextInt();

		int b�len = 2;
		while ((sayi / b�len) != 1) {
			if (sayi % b�len == 0) {
				System.out.print(b�len + ", ");
				sayi = sayi / b�len;
			} else {
				b�len++;
			}
		}
		System.out.print(sayi + ". ");
	}

}
