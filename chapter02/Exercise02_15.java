package chapter02;

import java.util.Scanner;

public class Exercise02_15 {

	public static void main(String[] args) {
		// geometri : iki nokta arasindaki mesafe //
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1 an y1 : ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter x2 ve y2 : ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double mesafe = Math.pow(Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2), 0.5);
		
		System.out.print("The distance between the two points is :"+mesafe);
		
	}

}
