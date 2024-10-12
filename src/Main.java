import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //Okay we are doing a rock, paper, scissors program that gets input from 2 players

        Scanner in = new Scanner(System.in);
        String input1 = "";
        String input2 = "";
        boolean incompleteField = false;
        String trash = "";
        boolean playerContinue = true;

        System.out.println("Welcome to a game of Rock, Paper, Scissors");
        //Now to get player one's input and test it for validity
        do {
            do {
                System.out.print("Player 1 please enter your move[R,P,S]: ");
                input1 = in.nextLine();

                if (input1.equalsIgnoreCase("r")) {
                    System.out.println("Player 1 has chosen Rock.");
                    incompleteField = false;
                } else if (input1.equalsIgnoreCase("p")) {
                    System.out.println("Player 1 has chosen Paper.");
                    incompleteField = false;
                } else if (input1.equalsIgnoreCase("s")) {
                    System.out.println("Player 1 has chosen Scissors.");
                    incompleteField = false;
                } else {
                    trash = input1;
                    System.out.println("Please enter a valid move [R,P,S] not: " + trash + ".");
                    incompleteField = true;
                }
            } while (incompleteField);

            incompleteField = false; //Resetting incomplete for the next loop
            //System.out.println("We have escaped test loop 1"); // Helping to test exiting loop

            //Now time for Player 2
            do {
                System.out.print("Player 2 please enter your move[R,P,S]: ");
                input2 = in.nextLine();

                if (input2.equalsIgnoreCase("r")) {
                    System.out.println("Player 2 has chosen Rock.");
                    incompleteField = false;
                } else if (input2.equalsIgnoreCase("p")) {
                    System.out.println("Player 2 has chosen Paper.");
                    incompleteField = false;
                } else if (input2.equalsIgnoreCase("s")) {
                    System.out.println("Player 2 has chosen Scissors.");
                    incompleteField = false;
                } else {
                    trash = input2;
                    System.out.println("Please enter a valid move [R,P,S] not: " + trash + ".");
                    incompleteField = true;
                }
            } while (incompleteField);

            //System.out.println("We have escaped test loop 2"); //testing for exiting loop again
            System.out.println("");

            if (input1.equalsIgnoreCase("r")) {
                if (input2.equalsIgnoreCase("r")) {
                    System.out.println("Both Players choose rock. It's a tie.");
                } else if (input2.equalsIgnoreCase("p")) {
                    System.out.println("Paper covers rock. Player 2 wins.");
                } else {
                    System.out.println("Rock breaks scissors. Player 1 wins.");
                }
            } else if (input1.equalsIgnoreCase("p")) {
                if (input2.equalsIgnoreCase("r")) {
                    System.out.println("Paper covers rock. Player 1 wins.");
                } else if (input2.equalsIgnoreCase("p")) {
                    System.out.println("Both Players choose paper. It's a tie.");
                } else {
                    System.out.println("Scissors cut paper. Player 2 wins.");
                }
            } else {
                if (input2.equalsIgnoreCase("r")) {
                    System.out.println("Rock breaks scissors. Player 2 wins.");
                } else if (input2.equalsIgnoreCase("p")) {
                    System.out.println("Scissors cut paper. Player 1 wins.");
                } else {
                    System.out.println("Both Players choose scissors. It's a tie.");
                }
            }

            //now to ask the player if they want to continue playing
            System.out.print("\nEnter [Q] to quit, otherwise enter anything else to play again: ");
            if (in.nextLine().equalsIgnoreCase("q"))
            {
                playerContinue = false;
            }
            System.out.println("");
        } while (playerContinue);
    }
}