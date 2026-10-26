/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject()
    {
        int CompChoice=(int)(Math.random()*3+1);
        if (CompChoice==1)
        {
            return "rock";
        }
        else if(CompChoice==2)
        {
            return "paper";
        }
        else
        {
            return "scissors";
        }
    }

    public static int compare2(String Player1, String Player2)
    {
        if ((Player1.equals("rock")&&Player2.equalsIgnoreCase("scissors"))||(Player1.equals("paper")&&Player2.equalsIgnoreCase("rock"))||(Player1.equals("scissors")&&Player2.equalsIgnoreCase("paper")))
        {
            return 2;
        }
        else if ((Player2.equalsIgnoreCase("rock")&&Player1.equalsIgnoreCase("scissors"))||(Player2.equalsIgnoreCase("paper")&&Player1.equalsIgnoreCase("rock"))||(Player2.equalsIgnoreCase("scissors")&&Player1.equalsIgnoreCase("paper")))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String playChoice="";
        while (!playChoice.equalsIgnoreCase("done"))
        {
            while (!(playChoice.equalsIgnoreCase("yes")||playChoice.equalsIgnoreCase("no")||playChoice.equalsIgnoreCase("done")))
            {
                System.out.println("Would you like to play the computer? (yes/no/done)");
                playChoice=sc.nextLine();
                System.out.println();
                if (!(playChoice.equalsIgnoreCase("yes")||playChoice.equalsIgnoreCase("no")||playChoice.equalsIgnoreCase("done")))
                {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("You typed an invalid input!");
                }
            }
            System.out.println("-----------------------------------------------------------");
            if (playChoice.equalsIgnoreCase("yes"))
            {
                String MoveChoice="";
                while(!(MoveChoice.equalsIgnoreCase("rock")||MoveChoice.equalsIgnoreCase("paper")||MoveChoice.equalsIgnoreCase("scissors")))
                {
                    System.out.println("Please enter rock/paper/scissors:");
                    MoveChoice=sc.nextLine();
                    System.out.println();
                    if ((!MoveChoice.equalsIgnoreCase("rock"))&&(!MoveChoice.equalsIgnoreCase("paper"))&&(!MoveChoice.equalsIgnoreCase("scissors")))
                    {
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("You typed an invalid input!");
                    }
                }
                String CompChoice=getObject();
                int Winner=compare2(CompChoice,MoveChoice);
                if (Winner==1)
                {
                    System.out.println("You lost!");
                }
                else if (Winner==2)
                {
                    System.out.println("You won!");
                }
                else if (Winner==0)
                {
                    System.out.println("You tied!");
                }
            }
            else if (playChoice.equalsIgnoreCase("no"))
            {
                System.out.println("How many times would you like the computer to play itself?");
                int Times=sc.nextInt();
                sc.nextLine();
                int Count=1;
                int tied=0;
                int Wins1=0;
                int Wins2=0;
                while (Count<=Times)
                {
                    String Player1=getObject();
                    String Player2=getObject();
                    int PlayerWinners=compare2(Player1, Player2);
                    
                    if (PlayerWinners==1)
                    {
                        Wins1++;
                    }
                    else if (PlayerWinners==2)
                    {
                        Wins2++;
                    }
                    else if (PlayerWinners==0)
                    {
                        tied++;
                    }
                    Count++;
                }
                System.out.println("Player 1 wins: " + Wins1);
                System.out.println("Player 2 wins: " + Wins2);
                System.out.println("Ties: " + tied);
            }
            else if (playChoice.equalsIgnoreCase("done"))
            {
                System.out.println("Thanks for playing!");
                break;
            }
            System.out.println();
            System.out.println("-----------------------------------------------------------");
            playChoice="";
        }  
    }
}
