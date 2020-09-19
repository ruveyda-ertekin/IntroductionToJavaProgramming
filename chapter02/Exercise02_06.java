package chapter02;

import java.util.Scanner;

public class Exercise02_06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		// 152     2    //
		int birler = number % 10;
		// 878      78     7    //
		int onlar =  (number % 100) / 10 ;
		// 152      //
		int yuzler = number / 100 ;
		
		int sum = birler + onlar + yuzler ;
				
		System.out.println("The sum of the digits is : "+sum);

	}

}
