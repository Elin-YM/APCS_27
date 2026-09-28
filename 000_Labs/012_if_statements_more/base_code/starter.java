/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please input your first number: ");
		int x=sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter your second number: ");
		int y=sc.nextInt();
		if (x==y)
		{
			System.out.println("The numbers are the same");
		}
		if (x!=y)
		{
			System.out.println("The numbers are different");
		}
	}
}
