package chapter03;

import java.util.Scanner;

public class Exercise03_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a three-digit integer : ");
		int integer = input.nextInt();

		int kalan1 = (int)(integer / 100);
		int basamak = integer % 100;
		int kalan3 = (int)(basamak % 10) ;

		if (kalan1 == kalan3)
			System.out.println(integer+" is a palindrome.");
		else 
			System.out.println(integer+ " is not a palindrome." );
	}

}
