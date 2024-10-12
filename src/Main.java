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

        System.out.println("Welcome to a game of Rock, Paper, Scissors");
        //Now to get player one's input and test it for validity
        do {
            System.out.print("Player 1 please enter your move[R,P,S]: ");
            input1 = in.nextLine();

            if (input1.equalsIgnoreCase("r"))
            {
                System.out.println("Player 1 has chosen Rock.");
                incompleteField = false;
            }
            else if (input1.equalsIgnoreCase("p"))
            {
                System.out.println("Player 1 has chosen Paper.");
                incompleteField = false;
            }
            else if (input1.equalsIgnoreCase("s"))
            {
                System.out.println("Player 1 has chosen Scissors.");
                incompleteField = false;
            }
            else
            {
                trash = input1;
                System.out.println("Please enter a valid move [R,P,S] not: " + trash + ".");
                incompleteField = true;
            }
        } while (incompleteField);

        incompleteField = false;
        System.out.println("We have escaped test loop 1");

    }
}