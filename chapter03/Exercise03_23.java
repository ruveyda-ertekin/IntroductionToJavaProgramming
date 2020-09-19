package chapter03;

import java.util.Scanner;

public class Exercise03_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two cordinates :");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean withInRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);
		
		if (withInRectangle) {
			System.out.println("Point "+x+" "+y+" is in the rectangle.");
		} else {
			System.out.println("Point "+x+" "+y+" is not in the rectangle.");
		}
	}

}
