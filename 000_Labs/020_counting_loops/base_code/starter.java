/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name=sc.nextLine();
		System.out.print("Please enter how many times you'd like to print your name: ");
		int times=sc.nextInt();
		int x=1;
		while(true)
		{
			if (x>times)
			{
				break;
			}
			System.out.println(name);
			x=x+1;
		}




		
	}
}
