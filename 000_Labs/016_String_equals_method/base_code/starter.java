/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String Choice=sc.nextLine();
		if (Choice.equalsIgnoreCase("Wizard"))
		{
			System.out.println("You have chosen the Wizard! Excelsior!");
		}
		else if (Choice.equalsIgnoreCase("Warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (Choice.equalsIgnoreCase("Rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else
		{
			System.out.println("You've decided not to choose a role. Rerun program");
		}
	}
}
