/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String Owner;
	private int AccountNumber;
	private double Balance;
	private boolean isActive;
	private static int nextAccountNumber=(int)(Math.random()*950+50);


	// -------CONSTRUCTORS-------
	public BankAccount()
	{
		Owner="unknown";
		AccountNumber=0;
		Balance=0;
		isActive=true;
		AccountNumber=nextAccountNumber;
		nextAccountNumber++;
	}
	public BankAccount(String OwnerInput)
	{
		Owner=OwnerInput;
		Balance=0;
		isActive=true;
		AccountNumber=nextAccountNumber;
		nextAccountNumber++;
	}
	public BankAccount(String OwnerInput, double BalanceInput)
	{
		Owner=OwnerInput;
		Balance=BalanceInput;
		isActive=true;
		AccountNumber=nextAccountNumber;
		nextAccountNumber++;
	}

	public void checkBalance()
	{
		System.out.println("Current Account Balance: " + Balance);
	}
	public void displayAccountInfo()
	{
		System.out.println("---Account Info---");
		System.out.println("Owner: " + Owner);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Balance: $" + Balance);
		System.out.println("Status: Active");
	}
	public String getOwner()
	{
		return Owner;
	}
	public void setOwner(String OwnerInput)
	{
		Owner=OwnerInput;
	}
	public double getBalance()
	{
		return Balance;
	}
	public void closeAccount()
	{
		isActive=false;
	}
	public boolean isActive()
	{
		return isActive;
	}
	public void deposit(double Deposit)
	{
		if (isActive==true)
		{
			Balance+=Deposit;
		}
		else
		{
			System.out.println("This account isn't active");
		}
	}
	public void withdraw(double withdraw)
	{
		if (isActive==true&&(Balance-withdraw>=0))
		{
			Balance-=withdraw;
		}
		else if ((Balance-withdraw)<0)
		{
			System.out.println("You don't have enough money");
		}
		else
		{
			System.out.println("This account isn't active");
		}
	}
}