package chapter05;

public class Exercise05_20 {

	public static void main(String[] args) {
		
		int herSatirdakiNumara = 8;
		int count = 0;

		for (int number = 2; number <= 1000; number++) {

			boolean asal = true;

			for (int bölen = 2; bölen <= number / 2; bölen++) {
				if (number % bölen == 0) {
					asal = false;
					break;
				}
			}

			if (asal) {
				count++;

				if (count % herSatirdakiNumara == 0) {
					System.out.println(number);

				} else
					System.out.print(number + " ");
			}
		}
	}
}
