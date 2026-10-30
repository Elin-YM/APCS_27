/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;
//"Andrew Garfield", 40, "Electro"

class starter {
	public static void main(String args[]) {
		Spiderman tobey=new Spiderman();
		tobey.setActor("Tobey Maguire");
		tobey.setAge(48);
		tobey.setVillain("Green Goblin");
		
		Spiderman andrew=new Spiderman(40);
		andrew.setActor("Andrew Garfield");
		andrew.setVillain("Electro");

		Spiderman tom=new Spiderman("Tom Holland", 27);
		tom.setVillain("The Vulture");

		Spiderman Nicole=new Spiderman("Nicole Iknadossian");
		Nicole.setAge(14);
		Nicole.setVillain("Cipher Homework");

		Spiderman Elin=new Spiderman("Elin Marghosian", 15, "English Class");
	}
}
