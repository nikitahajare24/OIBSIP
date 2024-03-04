package tasks;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int lowerBound = 1;
		int upperBound = 100;
		int maxAttempt = 10;
		int rounds = 0;
		int score = 0;
		
		System.out.println(" Welcome To the Number Guessing Game !!!");
		
		while (true) {
			int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
			int attempts = 0;
			
			System.out.println("Round " + (rounds + 1) + ":");
			System.out.println("You have chosen a number between " + lowerBound +  "and"  +  upperBound + " .Try to guess it!!");
			
			
			while (attempts < maxAttempt) {
				System.out.println("Enter your Guess: ");
				int userGuess = scanner.nextInt();
				attempts++;
				
				
				if (userGuess == targetNumber) {
					System.out.println("Congratulations!! your guessed is correct number in  " + attempts + "attempts.");
					score++;
					break;
				}
				else if (userGuess < targetNumber) {
					System.out.println("Your Guess is too Low. try again!");
				}
				else {
					System.out.println("Your Guess is too High. try again!");
					
				}
				
				if (attempts == maxAttempt) {
					System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was:" + targetNumber);
					
				}
			}
			
			System.out.println("Do you want to play another rund ? (yes/no):  ");
			String playAgain = scanner.next();
			
			if (!playAgain.equalsIgnoreCase("yes")) {
				System.out.println("Thanks for Playing!! Your total score is:  " + score + " out of " + (rounds +1) + " rounds won.");
				break;
				
			}
			rounds++;
			
		}
		scanner.close();
	}

}









