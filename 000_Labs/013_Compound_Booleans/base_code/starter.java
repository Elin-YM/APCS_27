/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int x=sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter your second number: ");
		int y=sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter your third number: ");
		int z=sc.nextInt();
		sc.nextLine();
		if ((x>y)&&(x>z))
		{
			System.out.println("Your first number is the largest");
			System.out.println("Your first number was " + x);
		}
		if ((y>x)&&(y>z))
		{
			System.out.println("Your second number is the largest");
			System.out.println("Your second number was " + y);
		}
		if ((z>y)&&(z>x))
		{
			System.out.println("Your third number is the largest");
			System.out.println("Your third number was " + z);
		}
		if ((x<y)&&(x<z))
		{
			System.out.println("Your first number is the smallest");
			System.out.println("Your first number was " + x);
		}
		if ((y<x)&&(y<z))
		{
			System.out.println("Your second number is the smallest");
			System.out.println("Your first number was " + y);
		}
		if ((z<y)&&(z<x))
		{
			System.out.println("Your third number is the smallest");
			System.out.println("Your third number was " + z);
		}
	}
}
