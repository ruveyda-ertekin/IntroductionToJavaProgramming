package chapter05;

public class Exercise05_15 {

	public static void main(String[] args) {

		int sayac = 1;

		for (int i = 33; i < 127; i++) {
			System.out.print((char) i + " ");

			if (sayac % 15 == 0) {
				System.out.println();
			}
			sayac++;
		}

	}

}
