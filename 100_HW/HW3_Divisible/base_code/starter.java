/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int Num1=sc.nextInt();
		System.out.print("Enter another integer: ");
		int Num2=sc.nextInt();
		if (Num1%2==0)
		{
			System.out.println(Num1 + " is divisible by 2");
		}
		else
		{
			System.out.println(Num1 + " isn't divisible by 2");
		}
		if (Num1%3==0)
		{
			System.out.println(Num1 + " is divisible by 3");
		}
		if (Num1%4==0)
		{
			System.out.println(Num1 + " is divisible by 4");
		}
		if (Num1%5==0)
		{
			System.out.println(Num1 + " is divisible by 5");
		}
		if (Num1%3!=0&&Num1%4!=0&&Num1%5!=0)
		{
			System.out.println(Num1 + " is not divisible by 3, 4, or 5");
		}
		System.out.println("");


		if (Num2%2==0)
		{
			System.out.println(Num2 + " is divisible by 2");
		}
		else
		{
			System.out.println(Num2 + " isn't divisible by 2");
		}
		if (Num2%3==0)
		{
			System.out.println(Num2 + " is divisible by 3");
		}
		if (Num2%4==0)
		{
			System.out.println(Num2 + " is divisible by 4");
		}
		if (Num2%5==0)
		{
			System.out.println(Num2 + " is divisible by 5");
		}
		if (Num2%3!=0&&Num2%4!=0&&Num2%5!=0)
		{
			System.out.println(Num2 + " is not divisible by 3, 4, or 5");
		}

	}
}
