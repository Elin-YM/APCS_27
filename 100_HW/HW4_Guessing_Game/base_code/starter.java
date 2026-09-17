/*
 *	Author: Elin Yousefi Marghosian
 *  Date: 9/15/26
 * 	Collaborator:
*/
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int AnswerNum=(int)(Math.random()*3)+1;
		System.out.println("The goal of the game is to guess a word with two hints");
		System.out.println();
		String Answer;
		if (AnswerNum==1)
		{
			Answer="Chicken";
			System.out.println("It is a bird");
			System.out.print("What is your guess? ");
			String Guess1=sc.nextLine();
			sc.nextLine();
			if (Guess1=="Chicken"||Guess1=="chicken")
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("You didn't get it right. Here is another hint");
				System.out.println("It lays eggs");
				System.out.print("What is your guess? ");
				String Guess2=sc.nextLine();
				sc.nextLine();
				if (Guess2=="Chicken"||Guess2=="chicken")
				{
					System.out.println("You got it right!");
				}
				else
				{
					System.out.println("The answer was " + Answer + ", better luck next time");
				}
			}

		}
		else if (AnswerNum==2)
		{
			Answer="Potato";
			System.out.println("It is a root vegtable");
			System.out.print("What is your guess? ");
			String Guess1=sc.nextLine();
			sc.nextLine();
			if (Guess1=="Potato"|| Guess1=="potato")
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("You didn't get it right. Here is another hint");
				System.out.println("It it used for french fries");
				System.out.print("What is your guess? ");
				String Guess2=sc.nextLine();
				if (Guess2=="Potato"|| Guess2=="potato")
				{
					System.out.println("You got it right!");
				}
				else
				{
					System.out.println("The answer was " + Answer + ", better luck next time");
				}
			}
	
		}
		else if(AnswerNum==3)
		{
			Answer="Pizza";
			System.out.println("It is a food with toppings");
			System.out.print("What is your guess? ");
			String Guess1=sc.nextLine();
			sc.nextLine();
			if (Guess1.equals"Pizza"|| Guess.equals"pizza")
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("You didn't get it right. Here is another hint");
				System.out.println("It is circular");
				System.out.print("What is your guess? ");
				String Guess2=sc.nextLine();
				sc.nextLine();
				if (Guess2==Answer|| Guess2=="pizza")
				{
					System.out.println("You got it right!");
				}
				else
				{
					System.out.println("The answer was " + Answer + ", better luck next time");
				}
		}

		
	}
}
}

