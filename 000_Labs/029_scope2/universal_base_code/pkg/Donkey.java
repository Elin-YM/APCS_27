/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Donkey {
	private String name;

	public Donkey() {
		name = "Donkey";
	}

	public String getName(){
		return name;
	}

	public void interact(Ogre shrek){
		String name=shrek.getName();
		System.out.println(name + ", parfaits may be the most delicious thing on the whole planet!");
		return;
	}



}
