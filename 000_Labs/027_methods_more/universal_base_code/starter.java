/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int Choice=sc.nextInt();
		sc.nextLine();

		if (Choice==1)
		{
			System.out.println("Account successfully created!");
			BankAccount account=new BankAccount();
			System.out.println();
			account.displayAccountInfo();
			System.out.println();
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String CheckBalance=sc.nextLine();
			if (CheckBalance.equalsIgnoreCase("yes"))
			{
				account.checkBalance();
				 
			}
			else if (CheckBalance.equalsIgnoreCase("no"))
			{
				System.out.println("Great! No balance checked");
			}
			else
			{
				System.out.println("You don't like to listen to instructions");
			}

		}
		else if(Choice==2)
		{
			System.out.println("What is the name of the owner of this bank account?");
			String Owner=sc.nextLine();
			BankAccount account=new BankAccount(Owner);
			System.out.println();
			account.displayAccountInfo();
			System.out.println();
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String CheckBalance=sc.nextLine();
			if (CheckBalance.equalsIgnoreCase("yes"))
			{
				account.checkBalance();
				 
			}
			else if (CheckBalance.equalsIgnoreCase("no"))
			{
				System.out.println("Great! No balance checked");
			}
			else
			{
				System.out.println("You don't like to listen to instructions");
			}
		}
		else if (Choice==3)
		{
			System.out.println("What is the name of the owner of this bank account?");
			String Owner=sc.nextLine();
			System.out.println("How much are you initially depositing into this account?");
			double Deposit=sc.nextDouble();
			sc.nextLine();
			BankAccount account=new BankAccount(Owner, Deposit);
			System.out.println();
			account.displayAccountInfo();
			System.out.println();
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String CheckBalance=sc.nextLine();
			if (CheckBalance.equalsIgnoreCase("yes"))
			{
				account.checkBalance();
				 
			}
			else if (CheckBalance.equalsIgnoreCase("no"))
			{
				System.out.println("Great! No balance checked");
			}
			else
			{
				System.out.println("You don't like to listen to instructions");
			}
		}
		else
		{
			System.out.println("Account unsuccessfully created!");
		}
		System.out.println();
		System.out.println("Thank you for coming to the ATM!");

		
	}
}
