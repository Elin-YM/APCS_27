/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome Restaurant Owner!");
		System.out.println("-------------------------");
		System.out.println("What is the name of your restaurant?");
		String Restaurant=sc.nextLine();
		System.out.println("What is your name?");
		String Owner=sc.nextLine();
		System.out.println("Welcome " + Owner + "! Time to set up the menu");
		System.out.println("We have 3 items for today");
		sc.nextLine();
		System.out.println("");
		System.out.println("First Item");
		System.out.println("-----------");
		System.out.print("Item name: ");
		String FirstItem=sc.nextLine();
		System.out.print("Price of " + FirstItem + ": " );
		double FirstPrice=(double)sc.nextDouble();
		sc.nextLine();
		System.out.println(" ");

		System.out.println("Second Item");
		System.out.println("-----------");
		System.out.print("Item name: ");
		String SecondItem=sc.nextLine();
		System.out.print("Price of " + SecondItem + ": " );
		double SecondPrice=(double)sc.nextDouble();
		sc.nextLine();
		System.out.println("");
		
		System.out.println("Third Item");
		System.out.println("-----------");
		System.out.print("Item name: ");
		String ThirdItem=sc.nextLine();
		System.out.print("Price of " + ThirdItem + ": " );
		Double ThirdPrice=(double)sc.nextDouble();
		sc.nextLine();

		System.out.println("======================");
		System.out.println(" Welcome to " + Restaurant);
		System.out.println("======================");
		System.out.println(" ");
		System.out.println("Hello, customer. What is your name?");
		String Name=sc.nextLine();
		System.out.println("How many " + FirstItem + "s would you like?");
		int FirstBought=(int)sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + FirstBought + " " + FirstItem + "s: $" + FirstBought*FirstPrice);
		System.out.println("How many " + SecondItem + "s would you like?");
		int SecondBought=(int)sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + SecondBought + " " + SecondItem + "s: $" + SecondBought*SecondPrice);
		System.out.println("How many " + ThirdItem + "s would you like?");
		int ThirdBought=(int)sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + ThirdBought + " " + ThirdItem + "s: $" + ThirdBought*ThirdPrice);
		System.out.print("What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		double Tip=(double)sc.nextDouble();
		System.out.println("");

		double Subtotal=FirstBought*FirstPrice+SecondBought*SecondPrice+ThirdBought*ThirdPrice;
		double TaxAmount=(FirstBought*FirstPrice+SecondBought*SecondPrice+ThirdBought*ThirdPrice)*0.0975;
		double TipAmount=(FirstBought*FirstPrice+SecondBought*SecondPrice+ThirdBought*ThirdPrice)*(0.01*Tip);
		double Total=Subtotal+TaxAmount+TipAmount;
		

		System.out.println("=================================");
		System.out.println("       " + Restaurant + "- Menu For Today");
		System.out.println("=================================");
		System.out.println("Owner: " + Owner);
		System.out.println("Customer: " + Name);
		System.out.println("---------------------------------");
		System.out.println("Item            Qty    Price     ");
		System.out.println(FirstItem + "            " + FirstBought + "    " + FirstPrice);
		System.out.println(SecondItem + "            " + SecondBought + "    " + SecondPrice);
		System.out.println(ThirdItem + "            " + ThirdBought + "    " + ThirdPrice);
		System.out.println("---------------------------------");
		System.out.println("Subtotal:              " + Subtotal + "     ");
		System.out.println("Tax (9.75%):            " + TaxAmount);
		System.out.println("Tip:                    " + Tip);
		System.out.println("Tip Amount:             " + TipAmount);
		System.out.println("=================================");
		System.out.println("TOTAL: $                 " + Total + "     ");
		System.out.println("=================================");
		System.out.println("");
		System.out.println("Thank you for eating at " + Restaurant + "!");
		


		

		






		
	}
}
