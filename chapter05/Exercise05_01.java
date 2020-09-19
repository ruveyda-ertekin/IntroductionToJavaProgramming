package chapter05;

import java.util.Scanner;

public class Exercise05_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int positives = 0;
		int negatives = 0;
		int girilenSayilar = 0;
		double sayilarinToplami = 0;

		System.out.println("Enter an intreger, the input ends if it is 0: ");
		int number = input.nextInt();

		if (number == 0) {
			System.out.print("No numbers are entered except 0");
			System.exit(1);
		}

		while (number != 0) {
			if (number > 0) {
				positives++;
				
			} else if (number < 0) {
				negatives++;
			
			}
			sayilarinToplami += number;
			girilenSayilar++;
			number = input.nextInt();
		}
		double ortalama = sayilarinToplami / girilenSayilar;
		
		System.out.println("The number of positives is " + positives);
		System.out.println("The number of negatives is " + negatives);
		System.out.println("The total is total "+sayilarinToplami);
		System.out.println("The average is "+ortalama);
	}

}
