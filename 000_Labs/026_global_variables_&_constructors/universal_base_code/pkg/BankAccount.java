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
	

	// -------METHODS-------
	public void Print()
	{
		System.out.println(Owner + " " + AccountNumber + " " + Balance + " " + isActive);
	}

}