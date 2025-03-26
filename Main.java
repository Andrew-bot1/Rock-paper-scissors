
import java.util.Scanner;  // Import the Scanner class
import java.util.Random; 


enum Choice {
    ROCK,
    PAPER,
    SCISSORS
  }    

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        Random random = new Random();
      System.out.println("Enter rock, paper, scissors, or exit");
      String userInput = scanner.nextLine().toUpperCase();

      Choice userChoice = Choice.valueOf(userInput);

      Choice computerChoice = Choice.values()[random.nextInt(3)];
      System.out.println("Computer choice: " +computerChoice);

      if (userChoice == computerChoice) {
        System.out.println("It's a tie!");
      }
      else if ((userChoice == Choice.ROCK && computerChoice == Choice.SCISSORS) || 
      (userChoice == Choice.PAPER && computerChoice == Choice.ROCK) ||
      (userChoice == Choice.SCISSORS && computerChoice == Choice.PAPER)) {
        System.out.println("You win!");
      }
      else if ((computerChoice == Choice.ROCK && userChoice == Choice.SCISSORS) || 
      (computerChoice == Choice.PAPER && userChoice == Choice.ROCK) ||
      (computerChoice == Choice.SCISSORS && userChoice == Choice.PAPER)) {
        System.out.println("You lose!");
      }
    }
  }
