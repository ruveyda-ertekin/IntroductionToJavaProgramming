package chapter05;

import java.util.Scanner;

public class Exercise05_02 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int number1 = 1 + (int)( Math.random() * 15);
	int number2 = 1 + (int)( Math.random() * 15) ;

	System.out.println(number1+ " + " +number2+" = ? ");
	int answer = input.nextInt();
	
	while ( number1 + number2 != answer ) {
		System.out.println("Wrong answer.Try again.");
		answer = in
	}
	System.out.println("Congratulations!");
	}

}
