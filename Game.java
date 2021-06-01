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
    
    int guess = 0;
    int counter = 0;

    while (guess != number){
      guess = input.nextInt();
      counter +=1;
      
      if (guess > number) {
      System.out.println("Your guess was too high, try again.");
      continue;
    } else if (guess < number) {
      System.out.println("Your guess was too low, try again.");
      continue;
    } else {
      System.out.println("You guessed correct, " + name + "!");
      break;
    }
    }
  }
}
