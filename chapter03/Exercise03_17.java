package chapter03;

import java.util.Scanner;

public class Exercise03_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int computer = (int) (Math.random()* 3 );
		
		System.out.println("makas (0), taþ (1), kaðýt(2) : ");
		int user = input.nextInt();
		
		System.out.print("The computer is ");
		
		switch(computer)
		{
		
		case 0 : System.out.print(" scissor.");break ;
		case 1 : System.out.print(" rock."); break ;
		case 2 : System.out.print(" paper.");
		}
		System.out.print(" You are ");
	    switch (user)
	    {
	    case 0 : System.out.print(" scissor");break ;
		case 1 : System.out.print(" rock"); break ;
		case 2 : System.out.print(" paper");
	    }
	    
	    if (computer == user)
	    	System.out.print(" too.It is a draw.");
	    else
	    {
	    	boolean win = (user == 0 && computer == 2) ||
	    			(user == 1 && computer == 0) || 
					  (user == 2 && computer == 1);
	    	if(win)
	    		System.out.print(". You won.");
	    	else 
	    		System.out.print(". You lose. ");
	    }
	}
	
	

}
