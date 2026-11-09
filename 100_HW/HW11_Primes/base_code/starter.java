/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;


class starter 
{
	public static boolean checkPrime(int num)
	{
		boolean prime=true;
		int subtract=1;
		while((num-subtract)>=2)
		{
			if ((num%(num-subtract))==0)
			{
				prime=false;
			}
			subtract++;
		}

		return prime;
	}
	public static void printPrimes(int num)
	{
		int subtract=0;
		while (num-subtract>=2)
		{
			boolean prime=checkPrime(num-subtract);
			if (prime)
			{
				System.out.println(num-subtract);
			}
			subtract++;
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int num=sc.nextInt();
		printPrimes(num);
		
	}
}
