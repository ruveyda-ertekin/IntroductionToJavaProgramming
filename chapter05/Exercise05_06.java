package chapter05;

public class Exercise05_06 {

	public static void main(String[] args) {
		double perMil = 1.609 ; 
		
		System.out.println("Mil       Kilometre             |           Kilometre       Mil");
		
		for (int m = 1, k = 20; m <= 10  &&  k <= 65 ; m += 1, k +=5  ) {
			System.out.printf("%-11d%-10.3f", m, ( m * perMil));
			System.out.print("           |           ");
			System.out.printf("%-15d%-6.3f\n", k,( k / perMil));
		}
	}

}
