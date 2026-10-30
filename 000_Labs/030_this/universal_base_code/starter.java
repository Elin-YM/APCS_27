/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		PooleDwarf Dwarf1=new PooleDwarf(randName(), (int)(Math.random()*20 + 1));
		PooleDwarf Dwarf2=new PooleDwarf(randName(), (int)(Math.random()*20 + 1));
		PooleDwarf Dwarf3=new PooleDwarf(randName(), (int)(Math.random()*20 + 1));
		PooleDwarf Dwarf4=new PooleDwarf(randName(), (int)(Math.random()*20 + 1));
		PooleDwarf Dwarf5=new PooleDwarf(randName(), (int)(Math.random()*20 + 1));
		PooleDwarf Dwarf6=new PooleDwarf(randName(), (int)(Math.random()*20 + 1));
		PooleDwarf Dwarf7=new PooleDwarf(randName(), (int)(Math.random()*20 + 1));
		int count=0;
		if (Dwarf1.isSameName(Dwarf2.getName())==true)
		{
			count++;
		}
		if (Dwarf1.isSameName(Dwarf3.getName())==true)
		{
			count++;
		}
		if (Dwarf1.isSameName(Dwarf4.getName())==true)
		{
			count++;
		}
		if (Dwarf1.isSameName(Dwarf5.getName())==true)
		{
			count++;
		}
		if (Dwarf1.isSameName(Dwarf6.getName())==true)
		{
			count++;
		}
		if (Dwarf1.isSameName(Dwarf7.getName())==true)
		{
			count++;
		}
		System.out.println(Dwarf1.getName() + " was the name with " + count + " matches!");
	}
}
