/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name?");
		String Name=sc.nextLine();
		System.out.println("What is your title?");
		String Title=sc.nextLine();
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
			System.out.println("You've decided not to choose a role");
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely");
		int points=20;
		System.out.print("Strength (1-10): ");
		int Strength=sc.nextInt();
		sc.nextLine();
		if (((points-Strength)<0)||(Strength>10))
		{
			System.out.println("Please input a smaller value");
			System.out.print("Strength: ");
			Strength=sc.nextInt();
			sc.nextLine();
		}
		points=points-Strength;
		System.out.println("You have " + points + " more points left to spend");
		System.out.print("Dexterity (1-10): ");
		int Dexterity=sc.nextInt();
		sc.nextLine();
		if (((points-Dexterity)<0)||(Dexterity>10))
		{
			System.out.println("Please input a smaller value");
			System.out.print("Dexterity: ");
			Dexterity=sc.nextInt();
			sc.nextLine();
		}
		points=points-Dexterity;
		System.out.println("You have " + points + " more points left to spend");
		System.out.print("Intelligence (1-10): ");
		int Intelligence=sc.nextInt();
		sc.nextLine();
		if (((points-Intelligence)<0)||(Intelligence>10))
		{
			System.out.println("Please input a smaller value");
			System.out.print("Intelligence: ");
			Intelligence=sc.nextInt();
			sc.nextLine();
		}
		points=points-Intelligence;
		System.out.println("You have " + points + " more points left to spend");
		System.out.print("Charisma (1-10): ");
		int Charisma=sc.nextInt();
		sc.nextLine();
		if (((points-Charisma)<0)||(Charisma>10))
		{
			System.out.println("Please input a smaller value");
			System.out.print("Charisma: ");
			Charisma=sc.nextInt();
			sc.nextLine();
		}
		points=points-Charisma;
		if (points>0)
		{
			System.out.println("You have " + points + " more points left to spend next time");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("You are " + Name + ", the " + Title + " of CVHS");
		System.out.println("You're a " + Choice + " with the following stats!");
		System.out.println("Strength - " + Strength);
		System.out.println("Dexterity - " + Dexterity);
		System.out.println("Intelligence - " + Intelligence);
		System.out.println("Charisma - " + Charisma);
		System.out.println("Good luck on your quest " + Name + "!");
	}
}
