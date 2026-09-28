/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Pick a number 1-1000: ");
		int Guess=sc.nextInt();
		int Number=(int)(Math.random()*1000+1);
		if (Guess==Number)
		{
			System.out.println("Your guess was correct!");
		}
		else
		{
			System.out.println("Your number wasn't the random number. The number was " + Number);
		}

	}
}
