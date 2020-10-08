package chapter05;

import java.util.Scanner;

public class Exercise05_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 1 and 15:");
		int sayi = input.nextInt();

		for (int sira = 1; sira <= sayi; sira++) {
			for (int space = sayi - sira; space >= 1; space--) {
				System.out.print("  ");
			}
			for (int numb1 = sira; numb1 >= 1; numb1--) {
				System.out.print(numb1 + " ");
			}
			for (int numb2 = 2; numb2 <= sira; numb2++) {
				System.out.print(numb2 + " ");
			}
			System.out.println();
		}

	}

}
