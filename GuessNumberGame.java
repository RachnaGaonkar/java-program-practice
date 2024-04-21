import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String a[]) {
        RandomMain obj = new RandomMain();
        obj.guessNumber();
    }

    public void guessNumber() {
        System.out.println("1st guess a number between 1 to 100 in 5 attempts");

        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());

        int guessedNumber;
        int trails = 5;

        for (int i = 0; i < trails; i++) {
            System.out.println("Enter your guess:");
            guessedNumber = Integer.parseInt(sc.nextLine());

            if (number == guessedNumber) {
                System.out.println("Congratulations! Your guess is correct.");
                System.out.println("Your guess: " + guessedNumber);
                System.out.println("The random number is: " + number);
                break; // End the game since the guess is correct
            } else if (number > guessedNumber) {
                System.out.println("Guess a higher number.");
            } else {
                System.out.println("Guess a lower number.");
            }

            if (i == trails - 1) {
                System.out.println("Your " + trails + " attempts are over!!!!");
                System.out.println("The random number was: " + number);
            }
        }
    }
}
