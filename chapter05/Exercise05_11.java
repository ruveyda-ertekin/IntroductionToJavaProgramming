package chapter05;

public class Exercise05_11 {

	public static void main(String[] args) {

		for (int i = 100; i <= 200; i++) {

			if ((i % 5 == 0 || i % 6 == 0) && (i % 5 != 0 || i % 6 != 0)) {
				System.out.print(i + " ");
			}

		}

	}

}
