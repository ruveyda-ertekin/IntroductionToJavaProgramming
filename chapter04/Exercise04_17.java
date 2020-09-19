package chapter04;

import java.util.Scanner;

public class Exercise04_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year :");
		int year = input.nextInt();
		System.out.print("Enter a month :");
		String month = input.next();
		
		boolean leapYear = 
				((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		int days = -1;
		
		switch (month) {
			case "Jan":
			case "Mar":
			case "May":
			case "July":
			case "Aug":
			case "Oct":
			case "Dec":
				days = 31;
				break;
	
			case "Apr":
			case "Jun":
			case "Sep":
			case "Nov":
				days = 30;
				break;
			
			case "Feb":
				if (leapYear) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			default:
				System.out.println("Wrong month!");
				System.exit(1);
		}
		System.out.println(month + " " + year + " has " + days + " days");
	}
}
