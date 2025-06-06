import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        double usdToRupees = 0.44;
        double usdToGil = 54.87;
        double usdToCoins = 2.23;

        double min = -0.03;
        double max = 0.05;

        System.out.println("What's your $USD balance?");
        System.out.print(">> ");
        double usdAmount = scanner.nextDouble();

        double inflationRupees = min + (max - min) * random.nextDouble();
        double inflationGil = min + (max - min) * random.nextDouble();
        double inflationCoins = min + (max - min) * random.nextDouble();

        double adjustedRupees = usdAmount * usdToRupees * (1 + inflationRupees);
        double adjustedGil = usdAmount * usdToGil * (1 + inflationGil);
        double adjustedCoins = usdAmount * usdToCoins * (1 + inflationCoins);

        System.out.println("Your rates today are:");
        System.out.println("- - - - - - - - - - - - -");
        System.out.println("Rupees: " + adjustedRupees + " (Rate change: " + inflationRupees + ")");
        System.out.println("Gil: " + adjustedGil + " (Rate change: " + inflationGil + ")");
        System.out.println("Golden Coins: " + adjustedCoins + " (Rate change: " + inflationCoins + ")");
    }
}
