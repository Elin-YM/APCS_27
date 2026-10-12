/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int Slots(String args[], int Money)
	{
		Scanner sc=new Scanner(System.in);
		int Wager=0;
		boolean Check=false;
		System.out.print("You have $" + Money +  ". How much would you like to wager? ");
		Wager=sc.nextInt();
		sc.nextLine();
		while ((Wager>Money)||(Wager<=0))
		{
			if (Wager>Money)
			{
				System.out.print("You only have $" + Money + "!");
			}
			if (Wager<=0)
			{
				System.out.println("Sneaky! No negatives or 0!");
			}
			System.out.print("Please enter a smaller number: ");
			Wager=sc.nextInt();
			sc.nextLine();
			
		}
		System.out.println();
		System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are:");
		System.out.println();
		System.out.println("----------------");
		int R1=(int)(Math.random()*10+1);
		int R2=(int)(Math.random()*10+1);
		int R3=(int)(Math.random()*10+1);
		System.out.println(" | " + R1 + " | " + R2 + " | " + R3 + " | ");
		System.out.println("----------------");
		if ((R1==R2)||(R1==R3)||(R2==R3))
		{
			System.out.println("You won! Your wager has now been doubled!");
			Money+=Wager;
		}
		else if ((R1==R2)&&(R2==R3))
		{
			System.out.println("You hit the jackpot!!! Your wager has now been tripled!");
			Money+=Wager*2;
		}
		else
		{
			System.out.println("Didn't win this time, better luck next time!");
			Money-=Wager;

		}
		return Money;
			

	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100");
		System.out.println("2. Input a wager less than your total amount of money");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10");
		System.out.println("   a. If two numbers match, you double your money");
		System.out.println("   b. If three numbers match, you triple your money");
		System.out.println("   c. If none match, you lose your money");
		String Play="";
		int Money=100;
		boolean PlaySlots=true;
		while (PlaySlots&&Money>0)
		{
			Play="";
			while (!Play.equalsIgnoreCase("Yes")&&(!Play.equalsIgnoreCase("Y"))||((Play.equalsIgnoreCase("No")||Play.equalsIgnoreCase("n"))))
			{
				System.out.println();
				System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
				Play=sc.nextLine();
				if ((Play.equalsIgnoreCase("Yes")||Play.equalsIgnoreCase("Y")))
				{
					System.out.println();
					break;
				}
				else if (Play.equalsIgnoreCase("No")||Play.equalsIgnoreCase("n"))
				{
					System.out.println("Sad to see you go! You still have $" + Money + " left. Come again soon! Thanks!");
					PlaySlots=false;
					System.exit(0);
				}
				System.out.println("That wasn't quite the correct answer. Try again.");
				System.out.println();
			}

			Money = Slots(args, Money);
			System.out.println("You now have $" + Money + ".");
			System.out.println();
			if (Money<=0)
			{
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
			}

			
		}
		

		

	}
}
