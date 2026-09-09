/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type in the first number");
		int x=sc.nextInt();
		System.out.println("Type in the second number");
		int y=sc.nextInt();
		System.out.println("Maximum = " + Math.max(x,y));
		System.out.println("Square root = " + Math.sqrt(y));
		System.out.println("Power = " + Math.pow(x,y));
	}
}
