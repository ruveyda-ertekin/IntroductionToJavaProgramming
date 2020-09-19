package chapter04;

import java.util.Scanner;

public class Exercise04_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of sides :");
	double sidesOfNumber = input.nextDouble();
	
	System.out.print("Enter the side :");
	double side = input.nextDouble();
	
	double area = (sidesOfNumber * Math.pow(side,2)) / (4 * Math.tan(Math.PI / sidesOfNumber));
	
	System.out.printf("The area of the polygon is  %4.2f\n",+area);
	
	}

}
