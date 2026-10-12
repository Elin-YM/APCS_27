/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to the guessing game!");
		Scanner sc=new Scanner(System.in);
		int Number=(int)(Math.random()*1000+1);
		int Guess=0;
		while(Guess!=Number)
		{
			System.out.print("Please guess a number: ");
			Guess=sc.nextInt();
			if (Guess<Number)
			{
				System.out.println("The number is higher");
			}
			else if (Guess>Number)
			{
				System.out.println("The number is lower");
			}
			else if (Guess==Number)
			{
				System.out.println("You guessed the number!");
				break;
			}
		}




		
	}
}
