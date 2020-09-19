package chapter04;

import java.util.Scanner;

public class Exercise04_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String entry = input.nextLine();
		
		System.out.println(entry.length());
		System.out.println(entry.charAt(0));
		

	}

}
