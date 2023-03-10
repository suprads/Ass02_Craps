import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        String playAgain = "";
        boolean done = false;

        do{
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Roll Sum: " + crapsRoll);

            if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12){
                System.out.println("You crapped out! You lose!");
            }

            else if(crapsRoll == 7 || crapsRoll == 11){
                System.out.println("You got a natural! You win!");
            }
            else {
                System.out.println("Trying for point");
                int pointDie1 = rnd.nextInt(6) + 1;
                int pointDie2 = rnd.nextInt(6) + 1;
                int pointRoll = pointDie1 + pointDie2;

                System.out.println("Point Die 1: " + pointDie1);
                System.out.println("Point Die 2: " + pointDie2);
                System.out.println("Point Roll Sum: " + pointRoll);

                if(pointRoll == 7){
                    System.out.println("Got a seven and lost!");
                }

                else{
                    System.out.println("Made point and won!");
                }
            }

            System.out.print("Do you want to play again [Y/N]: ");
            playAgain = in.nextLine();

            if (playAgain.equalsIgnoreCase("y")){
                done = false;
            }
            else {
                System.out.println("Thank you for playing!");
                done = true;
            }
        }while(!done);



    }
}