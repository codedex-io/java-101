// Club Penguin 🐧
// Codédex

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double exchangeRate = 0.0045;

        System.out.print("Welcome to the Club Penguin money converter!");
        System.out.print("How many coins do you have? ");
        int coins = scanner.nextInt(); 

        double dollars = coins * exchangeRate;
        
        System.out.println("You have the following amount of dollars:");
        System.out.println(dollars);
    }
}