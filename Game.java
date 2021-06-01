import java.util.Scanner;
import java.util.Random;

/*

A number-guessing game.

*/

public class Game {
  public static void main(String[] args){
    
    System.out.println("Hello, welcome to the guessing game!");

    Scanner input = new Scanner(System.in);
    System.out.println("What's your name?");

    String name = input.nextLine();
    System.out.println("Welcome, " + name + "!" );

    Random rand = new Random();
    int number = rand.nextInt(100);

    System.out.println("I'm thinking of a number between 1 and 100. What do you think it is?");
    int guess = input.nextInt();

  }

}
