package chapter03;

import java.util.Scanner;

public class Exercise03_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter  point with two coordinates : ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		boolean withinCircle = (Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5) <= 10);

		if (withinCircle) {
			System.out.print("Point " + x + " " + y + " is in the circle.");
		} else {
			System.out.print("Point " + x + " " + y + " is not in the circle.");
		}
	}
}
