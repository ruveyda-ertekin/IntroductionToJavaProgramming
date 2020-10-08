package chapter05;

public class Exercise05_24 {

	public static void main(String[] args) {
		
		double seriToplami = 0;
		
		for (double i = 1.0; i <= 97.0; i += 2) {
			seriToplami+= i / (i + 2);
		}

		System.out.println("Seri Toplami: " + seriToplami);
	}
}
