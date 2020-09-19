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
			System.out.println("Girilen say� ile piyangoda ��kan say� ayn� ; �d�l 10.000 TL");
		else if (guessDigit1 == (lotteryDigit1 ^ lotteryDigit2 ^ lotteryDigit3) ||  guessDigit2 == (lotteryDigit1 ^ lotteryDigit2 ^ lotteryDigit3) || guessDigit1 == (lotteryDigit1 ^ lotteryDigit2 ^ lotteryDigit3))
		System.out.println("Girilen say�n�n t�m basamaklar� piyangoda kazanan say� ile ayn� ise ; �d�l 3.000 TL");
		else if (guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit3 == lotteryDigit3 )
			System.out.println("Girilen say�n�n bir basama�� piyangoda ��kan say� ile ayn� ise ; �d�l 1.00 TL");
		else
			System.out.println("�zg�n�z kazan���n�z para 0 TL");
		{	
			
		}

	}
}

