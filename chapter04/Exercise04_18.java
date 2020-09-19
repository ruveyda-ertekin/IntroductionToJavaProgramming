package chapter04;

import java.util.Scanner;

public class Exercise04_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two characters :");
		String letter = input.next();
		
		char m = Character.toUpperCase(letter.charAt(0));
		char s = letter.charAt(1);
		
		switch (m) {
		case 'M' : System.out.println("Mathematics"); break ; 
		case 'C' : System.out.println("Computer Science"); break ;
		case 'I' : System.out.println("Information Technologies"); break ;
		default : System.out.println("Invalid input");
		 System.exit(1);
		}
		switch(s)
		{
			case '1': System.out.println("Freshman"); break;
			case '2': System.out.println("Sophomore"); break;
			case '3': System.out.println("Junior"); break;
			case '4': System.out.println("Senior"); break;
			default : System.out.println("Invalid input");
		}
	}
}

