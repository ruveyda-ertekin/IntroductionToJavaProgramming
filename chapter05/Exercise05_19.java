package chapter05;

public class Exercise05_19 {

	public static void main(String[] args) {

		for (int sayi = 8; sayi > 0; sayi--) {
			int space;
			int solDizin;
			// space
			for (space = 1; space < sayi; space++) {
				System.out.printf("%4s", "  ");
			}

			// sayi
			for (solDizin = 0; solDizin < 8 - (space - 1); solDizin++) {
				System.out.printf(" %3d", (int) Math.pow(2, solDizin));
			}

			for (int sagDizin = solDizin - 2; sagDizin >= 0; sagDizin--) {
				System.out.printf(" %3d", (int) Math.pow(2, sagDizin));
			}
			System.out.println();

		}

	}

}
