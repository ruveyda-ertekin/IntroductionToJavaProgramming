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
		int bölen = 2;

		while (bölen <= n1 && bölen <= n2) {
			if (n1 % bölen == 0 && n2 % bölen == 0)
				EBOB = bölen;
			bölen++;
		}
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + EBOB);

	}

}
