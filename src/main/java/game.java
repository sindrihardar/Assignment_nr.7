import java.util.Random;
import java.util.Scanner;


public class game { // game class
    public static void main(String[] args) {

        // Create a Scanner object to read input from System.in
        Scanner scanner = new Scanner(System.in);

        // Create a Random object
        System.out.println("Enter the number of rounds you want to play: ");
        int rounds = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rounds; i++) {
            play(scanner);
        }

    }
        // Create a method called play that accepts a Scanner object as a parameter.
        static void play (Scanner scanner) { // play the game
        System.out.println("Enter Rock, Paper or Scissors: ");
        String input = scanner.nextLine();

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        // computerchoices
        String computerChoice = "";
        if (randomNumber == 0) {
            computerChoice = "Rock";
        } else if (randomNumber == 1) {
            computerChoice = "Paper";
        } else if (randomNumber == 2) {
            computerChoice = "Scissors";
        }
        System.out.println("Computer chose: " + computerChoice);

        // compare the user's choice with the computer's choice
        if (input.equals(computerChoice)) {
            System.out.println("Tie!");
        } else if (input.equals("Paper") && computerChoice.equals("Rock")) {
            System.out.println("You win!");
        } else if (input.equals("Scissors") && computerChoice.equals("Rock")) {
            System.out.println("Computer wins!");
        } else if (input.equals("Rock") && computerChoice.equals("Paper")) {
            System.out.println("Computer wins!");
        } else if (input.equals("Scissors") && computerChoice.equals("Paper")) {
            System.out.println("You win!");
        } else if (input.equals("Rock") && computerChoice.equals("Scissors")) {
            System.out.println("You win!");
        } else if (input.equals("Paper") && computerChoice.equals("Scissors")) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Invalid input");
            play(scanner);
        }

    }
}

