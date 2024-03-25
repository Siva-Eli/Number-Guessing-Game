package numbergame;

import java.util.Scanner;

public class NumberGuessing {
	public static void guessingNumberGame() {
		Scanner sc = new Scanner(System.in);
		int number = 1+(int)(100*Math.random());
		int K = 8;	
		int i,guess;
		System.out.println("A number is chosen" + "between 1 to 100." + "Guess the number" + "within 8 trails.");
		for (i=0; i< K; i++) {
			System.out.println("Guess the number:");
			guess = sc.nextInt();
			if (number == guess) {
				System.out.println("Congratulations you guessed the number.");
				break;
			}
			else if (number>guess && i!= K-1) {
				System.out.println("The number is Greater then " + guess);
			}
			else if (number < guess && i != K-1) {
				System.out.println("The number is less then " + guess);
			}
		}
		if (i == K) {
			System.out.println("You have exhausted K trails.");
			System.out.println("The number was"+ number);
		}
	}
	public static void main(String[]args) {
		guessingNumberGame();
	}
}
