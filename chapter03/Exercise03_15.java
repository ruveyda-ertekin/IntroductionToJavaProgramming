package chapter03;

import java.util.Scanner;

public class Exercise03_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int lottery = (int)(Math.random() * 1000);
		
		System.out.println("Enter a three-digit number : ");
		int guess = input.nextInt();
		
		int lotteryDigit1 = lottery / 100 ;
		int remainingDigits = lottery % 100 ;
		int lotteryDigit2 = remainingDigits / 10 ;
		int lotteryDigit3 = remainingDigits % 10 ;
		
		int guessDigit1 = guess / 100;
		remainingDigits = guess % 100;
		int guessDigit2 = remainingDigits / 10;
		int guessDigit3 = remainingDigits % 10;
		
		System.out.println("The lottery number is " + lottery);
	
		if (guess == lottery)
			System.out.println("Girilen sayý ile piyangoda çýkan sayý ayný ; ödül 10.000 TL");
		else if (guessDigit1 == (lotteryDigit1 ^ lotteryDigit2 ^ lotteryDigit3) ||  guessDigit2 == (lotteryDigit1 ^ lotteryDigit2 ^ lotteryDigit3) || guessDigit1 == (lotteryDigit1 ^ lotteryDigit2 ^ lotteryDigit3))
		System.out.println("Girilen sayýnýn tüm basamaklarý piyangoda kazanan sayý ile ayný ise ; ödül 3.000 TL");
		else if (guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit3 == lotteryDigit3 )
			System.out.println("Girilen sayýnýn bir basamaðý piyangoda çýkan sayý ile ayný ise ; ödül 1.00 TL");
		else
			System.out.println("Üzgünüz kazanýðýnýz para 0 TL");
		{	
			
		}

	}
}

