package chapter04;

import java.util.Scanner;

public class Exercise04_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		
		if(Character.isLetter(ch)) {
			switch(Character.toUpperCase(ch))
			{
			case 'A' : System.out.print(ch+" is a vowel") ; break;
			case 'E' : System.out.print(ch+" is a vowel") ; break;
			case 'I' : System.out.print(ch+" is a vowel") ; break;
			case 'O' : System.out.print(ch+" is a vowel") ; break;
		    case 'U' : System.out.print(ch+" is a vowel") ; break;
		    default : System.out.println(ch + " is a consonant");
			}
		}
		else 
			System.out.println(ch + " is an invalid input");
	}

}
