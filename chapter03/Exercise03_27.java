package chapter03;

import java.util.Scanner;

public class Exercise03_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y- coordinates :");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double kesisenx = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double kesiseny = (-y * (200 * 100)) / (-y * 200 - x * 100);

		if (kesisenx < x || y > kesiseny) {
			System.out.println("The point is not in the triangle.");
		} else  {
			System.out.println("The point is in the triangle.");
		}
	}

}
