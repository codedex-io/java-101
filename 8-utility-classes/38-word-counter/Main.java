import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        // Display the result
        System.out.println("This sentence has " + wordCount + " words!");
    }
}
