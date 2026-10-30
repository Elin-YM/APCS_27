/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dog name?");
		String name=sc.nextLine();
		Dog dog1=new Dog(name, 4);
		Dog dog2=new Dog("Billy Bob", "Chihuaua");
		System.out.println(dog1.getName() + " is a " +dog1.getBreed()+" that is " + dog1.getAge() + " years old!");
		System.out.println(dog2.getName() + " is a " + dog2.getBreed() + " that is " + dog2.getAge() + " years old!");
		boolean sleep1=dog1.isSleeping();
		if (sleep1)
		{
			System.out.println(dog1.getName() + " is sleeping! Don't wake " + dog1.getName() + " up!"); 
		}
		else
		{
			System.out.println(dog1.getName() + " is awake!");
			dog1.bark();
		}

		boolean sleep2=dog2.isSleeping();
		if ((sleep2)&&(!sleep1))
		{
			System.out.println(dog2.getName() + " wakes up from hearing " + dog1.getName());
			dog2.bark();
		}
		if ((sleep2)&&(sleep1))
		{
			System.out.println(dog2.getName() + " is sleeping too");
		}
		if ((!sleep2) && (sleep1))
		{
			System.out.println(dog2.getName()  + " is awake");
		}
		if((!sleep1)&&(!sleep2))
		{
			System.out.println(dog2.getName() + " is awake too");
			dog2.bark();
		}




	}
}
