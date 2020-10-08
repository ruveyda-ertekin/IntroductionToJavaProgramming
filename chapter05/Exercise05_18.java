package chapter05;

public class Exercise05_18 {

	public static void main(String[] args) {

		// A

		for (int sayi = 1; sayi <= 6; sayi++) {

			for (int satir = 1; satir <= sayi; satir++) {
				System.out.print(satir + " ");
			}
			System.out.println();
		}

		System.out.print("\n*******************\n");

		// B

		for (int sayi = 6; sayi >= 1; sayi--) {

			for (int satir = 1; satir <= sayi; satir++) {
				System.out.print(satir + " ");
			}
			System.out.println();

		}

		System.out.print("\n*******************\n");

		// C

		for (int sayi = 1; sayi <= 6; sayi++) {
			// space
			for (int space = 0; space < 6 - sayi; space++) {
				System.out.print("  ");
			}
			// sayi
			for (int satir = sayi; satir > 0; satir--) {
				System.out.print(satir+" ");
			}
			System.out.println();
		}
		System.out.print("\n*******************\n");
		
		// D

		for (int sayi = 1; sayi <= 6; sayi++) {
			
			// space

			for (int space = sayi; space > 1; space--) {
				System.out.print("  ");
			}

			// sayi
			for (int satir = 1; satir <= 7 - sayi ; satir++) {
				System.out.print(satir+" ");
			}
			
			System.out.println();
		}
	}
}