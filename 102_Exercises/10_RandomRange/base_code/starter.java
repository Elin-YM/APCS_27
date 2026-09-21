/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int Num1=sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter another integer (bigger than the first): ");
		int Num2=sc.nextInt();
		System.out.println("Your range is " + Num1 + " to " + Num2);
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int)(Math.random()*(Num2-Num1+1)+Num1) + ", " + (int)(Math.random()*(Num2-Num1)+Num1) + ", " + (int)(Math.random()*(Num2-Num1)+Num1) + ", " + (int)(Math.random()*(Num2-Num1)+Num1) + ", " + (int)(Math.random()*(Num2-Num1)+Num1));
	}
}
