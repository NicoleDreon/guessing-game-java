import java.util.Scanner;

/*

A number-guessing game.

*/

public class Game {
  public static void main(String[] args){
    
    System.out.println("Hello, welcome to the guessing game!");

    Scanner input = new Scanner(System.in);
    System.out.println("What's your name?");


    String name = input.nextLine();
    System.out.println("Welcome, " + name + "!");
  }

}
