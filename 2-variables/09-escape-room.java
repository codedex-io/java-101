// Escape Room 🕵🏻‍♀️
// Codédex

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I? ");
        String answer = scanner.nextLine(); 

        System.out.println("You answered the following word!");
        System.out.println(answer);
        System.out.println("Congrats on getting the clue!");
    }
}