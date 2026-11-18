import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Think of a number between 1 and 10: ");
        int userNumber = scanner.nextInt();

        int computerGuess = random.nextInt(10) + 1;

        System.out.println("💻 The computer guesses: " + computerGuess);

        if (computerGuess == userNumber) {
            System.out.println("✅ The computer guessed right!");
        } else {
            System.out.println("❌ The computer guessed wrong!");
        }
    }
}
