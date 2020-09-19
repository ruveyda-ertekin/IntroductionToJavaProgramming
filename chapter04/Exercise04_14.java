package chapter04;

import java.util.Scanner;

public class Exercise04_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter grade: ");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		ch = Character.toUpperCase(ch);

		if (ch >= 'A'  && ch <= 'F' && ch != 'E')
		{
			System.out.print("The numeric value for grade " + ch + " is ");
			switch (Character.toUpperCase(ch)) 
		{
			case 'A':
				System.out.print(4);
				break;
			case 'B':
				System.out.print(3);
				break;
			case 'C':
				System.out.print(2);
				break;
			case 'D':
				System.out.print(1);
				break;
			case 'F':
				System.out.print(0);
			}
		}
		else
			System.out.println(ch + " is an invalid grade.");
	}
}
