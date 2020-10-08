package chapter05;

public class Exercise05_25 {

	public static void main(String[] args) {

		double seriToplami;

		for (int i = 10000; i <= 100000; i += 10000) {
			seriToplami = 0;

			for (double n = 1; n <= i; n++) {
				seriToplami += (Math.pow(-1, (n + 1))) / ((2 * n) - 1);

			}

			double piDegeri = 4 * (seriToplami);
			System.out.println("i ==> "+ i + " = " + piDegeri);
		}
	}
}
