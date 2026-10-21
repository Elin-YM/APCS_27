/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();
		BankAccount y = new BankAccount("Bob");
		BankAccount z = new BankAccount("Jeff", 500);
		BankAccount a = new BankAccount("Fred", 43.2);
		x.Print();
		y.Print();
		z.Print();

		
	}
}
