/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void toString (String Sentence1)
	{
		System.out.println(Sentence1);
	}
	public static void toStringCombined (String Sentence1, String Sentence2)
	{
		System.out.println(Sentence1 + " " + Sentence2);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String Sentence1 = sc.nextLine();
		System.out.println("Write a sentence!");
		String Sentence2 = sc.nextLine();
		System.out.println("");
		System.out.println("This is using the methods!");
		toString(Sentence1);
		toStringCombined(Sentence1, Sentence2);



		
	}
}
