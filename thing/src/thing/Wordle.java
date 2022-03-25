package thing;

import java.util.Scanner;

import java.util.Random;

public class Wordle {

	static int guessCount = 0;
	final static String[] words = { "There", "These", "Their", "Words", "Ports", "Jolly", "Chest" };
	static Random random = new Random();
	static int index = random.nextInt(words.length);
	

	static void guess(int guessCount) {
		
		Scanner scanner = new Scanner(System.in);

		String guess = scanner.nextLine();

		if (guess.length() < 5 || guess.length() > 5) {
			if (guess.length() < 5) {
				System.out.println("Your guess is too short.  Try again.");
				guess(guessCount);
			}
			if (guess.length() > 5) {
				System.out.println("Your guess is too long.  Try Again.");
				guess(guessCount);
			}
		} else {
			
			if (guess.equals(words[index])) {

				System.out.println("You win.");

			}
			
			System.out.println("Your guess is " + guess);
			guessCount += 1;
			if (guessCount > 6) {
				System.out.println("You Lose");
			} else {
				guess(guessCount);
			}

			
		}

	}

	public static void main(String[] args) {

		guess(guessCount);

	}

}
