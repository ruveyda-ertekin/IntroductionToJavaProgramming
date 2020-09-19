package chapter04;

import java.util.Scanner;

public class Exercise04_25 {

	public static void main(String[] args) {
		int character1 = 65 + (int) (Math.random() * (90 - 65));
		int character2 = 65 + (int) (Math.random() * (90 - 65));
		int character3 = 65 + (int) (Math.random() * (90 - 65));

		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);
		int number4 = (int) (Math.random() * 10);

		System.out.println("" + (char) (character1) + ((char) (character2)) + ((char) (character3)) + number1 + number2
				+ number3 + number4);
	}

}
