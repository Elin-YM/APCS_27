/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Fortune Cookie Generator!");
		System.out.println();
		String Password="Bob";
		System.out.print("Password: ");
		String Guess=sc.nextLine();
		System.out.println();
		if (Guess.equals(Password))
		{
			System.out.println("Password correct!");
			int FortuneCorrect=(int)(Math.random()*5+1);
			if (FortuneCorrect==1)
			{
				System.out.println("You will pass your test");
			}
			if (FortuneCorrect==2)
			{
				System.out.println("You will find a penny");
			}
			if (FortuneCorrect==3)
			{
				System.out.println("You will win a game of Rock Paper Scissors");
			}
			if (FortuneCorrect==4)
			{
				System.out.println("You will get extra credit");
			}
			if (FortuneCorrect==5)
			{
				System.out.println("You will get free snacks today");
			}
		}
		if (!(Guess.equals(Password)))
		{
			System.out.println("Password incorrect");
			int Fortune=(int)(Math.random()*5+1);
			{
				if (Fortune==1)
				{
					System.out.println("You will fail a class");
				}
				if (Fortune==2)
				{
					System.out.println("You will trip and fall today");
				}
				if (Fortune==3)
				{
					System.out.println("You will drop and break your phone");
				}
				if (Fortune==4)
				{
					System.out.println("You will turn into a frog");
				}
				if (Fortune==5)
				{
					System.out.println("You will wave to the wrong person");
				}
			}
		}
		


		
	}
}
