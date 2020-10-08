package chapter05;

import java.util.Scanner;

public class Exercise05_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Second first integer: ");
		int n2 = input.nextInt();

		int EBOB = 1;
		int b�len = 2;

		while (b�len <= n1 && b�len <= n2) {
			if (n1 % b�len == 0 && n2 % b�len == 0)
				EBOB = b�len;
			b�len++;
		}
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + EBOB);

	}

}
