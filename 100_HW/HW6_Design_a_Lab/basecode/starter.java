/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Mad Libs!");
        System.out.print("Enter a noun: ");
        String Noun1=sc.nextLine();
        System.out.print("Enter a second noun: ");
        String Noun2=sc.nextLine();
        System.out.print("Enter a third noun: ");
        String Noun3=sc.nextLine();
        System.out.print("Enter a fourth noun: ");
        String Noun4=sc.nextLine();

        System.out.print("Enter a verb: ");
        String Verb1=sc.nextLine();
        System.out.print("Enter a second verb: ");
        String Verb2=sc.nextLine();
        System.out.print("Enter a third verb: ");        
        String Verb3=sc.nextLine();
        
        System.out.print("Enter an adjective: ");
        String Adjective1=sc.nextLine();
        System.out.print("Enter a second adjective: ");
        String Adjective2=sc.nextLine();

        System.out.print("Enter a number: ");
        int Number1=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a second number: ");
        int Number2=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter a place: ");
        String Place=sc.nextLine();
    
        
        System.out.println("Once upon a time, there was a " + Adjective1  + " " + Noun1 + ". One day, it came across " + Number1 + " " +  Noun2 + "s. They decided to " + Verb1 + " to " + Place + " together, where they met a " + Adjective2 + " " + Noun3 + ". This " + Noun3 + " told them to find " + Number2 + " " + Noun4 + "s. They " + Verb2 + "ed away to find them, and after a long journey, they brought all " + Number2 + " " + Noun4 + "s back to the " + Noun3 + ". The " + Noun3 + " thanked them and they finally " + Verb3 + "ed back home. The end.");

    }
}
