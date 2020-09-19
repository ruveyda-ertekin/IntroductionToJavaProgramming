package chapter04;

import java.util.Scanner;

public class Exercise04_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the bounding circle : ");
		double radius = input.nextDouble();
		
		double P1 = (Math.PI / 10);
		double P2 = (Math.PI / 2);
		double P3 = P2 + 2 * Math.PI / 5 ;
		double P4 = P3 + 2 * Math.PI / 5 ;
		double P5 = P4 + 2 * Math.PI / 5 ;
		

		// y = r * sin(a)
		double x1 = radius * Math.cos(P1);
		double y1 = radius * Math.sin(P1);
		double x2 = radius * Math.cos(P2);
		double y2 = radius * Math.sin(P2);
		double x3 = radius * Math.cos(P3);
		double y3 = radius * Math.sin(P3);
		double x4 = radius * Math.cos(P4);
		double y4 = radius * Math.sin(P4);
		double x5 = radius * Math.cos(P5);
		double y5 = radius * Math.sin(P5);
		
		System.out.println("The coordinates of five points on the pentagon are ");
		System.out.printf("(%.4f, %10.4f)\n", x1, y1);
		System.out.printf("(%.20f, %d)\n", x2, (int) y2);
		System.out.printf("(%.4f, %.4f)\n", x3, y3);
		System.out.printf("(%.4f, %.4f)\n", x4, y4);
		System.out.printf("(%.4f, %.3f)\n", x5, y5);

		
	}
}
