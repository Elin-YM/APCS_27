/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int power(int base, int exponent)
	{
		int counter=1;
		int answer=base;
		while (counter < exponent)
		{
			
			answer=answer*base;
			counter+=1;
		}
		return answer;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int base = sc.nextInt();
		sc.nextLine();
		System.out.println("What is your exponent number?");
		int exponent = sc.nextInt();
		power(base, exponent);
		System.out.println("Your answer is: " + power(base, exponent));



		
	}
}
