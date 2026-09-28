/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Pick a number between 1-1000: ");
		int Guess=sc.nextInt();
		int Number=(int)(Math.random()*1000+1);
		if(Number==Guess)
		{
			System.out.println("You got it right! The number was " + Number);
		}
		else if (Guess>Number)
		{
			System.out.println("Your number was bigger than the number. The number was " + Number);
		}
		else if (Guess<Number)
		{
			System.out.println("Your number was smaller than the number. The number was "  + Number);
		}
	}
}
