package chapter05;

public class Exercise05_04 {

	public static void main(String[] args) {
		System.out.println("Mil         Kilometre");

		for (int mil = 1; mil <= 10; mil += 1) {
			double sonuc = mil * 1.609 ;

			System.out.printf("%d             %.1f\n", mil, sonuc);		
		}

	}

}
