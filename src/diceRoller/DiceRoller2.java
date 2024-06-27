package diceRoller;
import java.util.Scanner;
import java.util.Random;

public class DiceRoller2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many d20s do you want to roll?");
        int numDice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Random random = new Random();
        
        System.out.println("Rolling " + numDice + " d20s...");
        for (int i = 0; i < numDice; i++) {
            System.out.print("Rolling dice " + (i+1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(".");
                Thread.sleep(500); // Sleep for half a second to create animation effect
            }
            int roll = random.nextInt(20) + 1; // Roll a d20 (random number between 1 and 20)
            System.out.println("\nRoll " + (i+1) + ": " + roll);
            System.out.println("Press Enter to reveal the next roll...");
            scanner.nextLine(); // Wait for the user to press Enter before revealing the next roll
        }
        
        scanner.close();
    }
}