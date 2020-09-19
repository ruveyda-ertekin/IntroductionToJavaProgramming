package chapter05;

public class Exercise05_05 {

	public static void main(String[] args) {

		System.out.println("Kilograms       Pounds        |          Pound          Kilogram");

		for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
			System.out.printf("%-12d%7.1f", k, (k * 2.2));
			System.out.print("           |           ");
			System.out.printf("%-9d%12.2f\n", p, (p / 2.2));

		}
	}

}
