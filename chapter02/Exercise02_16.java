package chapter02;

import java.util.Scanner;

public class Exercise02_16 {

	public static void main(String[] args) {
		// Geometri : altigenin alani //
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side : ");
		double side = input.nextDouble();
		
		double area = ((3 * Math.pow(3, 0.5)) / 2 ) * Math.pow(side, 2);
		
		System.out.println("The area of the hexagon is :"+area);
		
	}

}
