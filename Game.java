import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

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
    
    // System.out.println("Number is " + number);
    System.out.println("I'm thinking of a number between 1 and 100. What do you think it is?");
    
    int guess = 0;
    int guesses = 0;

    while (guess != number){
      guesses +=1;
      
      try {
        guess = input.nextInt();
      }
      catch (InputMismatchException e) {
        String bad_input = input.next();   // need to progress past bad input
        System.out.println("That's not an integer, try again");
        continue;
      }
      
      if (guess < 1){
        System.out.println("Your guess is less than 1. What is your guess between between 1 and 100?");
        continue;
      }else if (guess > 100){
        System.out.println("Your guess is greater than 100. What is your guess between between 1 and 100?");
        continue;
      }

      if (guess > number) {
      System.out.println("Your guess was too high, try again.");
    } else if (guess < number) {
      System.out.println("Your guess was too low, try again.");
    } else {
      System.out.println("You guessed correct, " + name + "! It only took " + guesses + " number of guesses.");
    }
    }
  }
}


// another way to solve this problem with setting the while loop to true
    // while (true) {
    //   int guess;
    //   guess = input.nextInt();
    //   guesses = guesses + 1;
    //   if (guess < 1 || guess > 100) {
    //     System.out.println(guess + " is not between 1 and 100. Please try again.");
    //     continue;
    //   }

    //   if (guess < number) {
    //     System.out.println("Too low. Try higher?");

    //   } else if (guess > number) {
    //     System.out.println("Too high. Try lower?");

    //   } else {
    //     System.out.println("You got it! Nice work, " + name + "!");
    //     System.out.println("You guessed the number in " + guesses + " tries.");

    //     break;
    //   }
    // }

    // continue skips all code below and re enters the while loop
    // break exits the while loop