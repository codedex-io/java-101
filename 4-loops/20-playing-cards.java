public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here 💖
        for (int i = 1; i <= 52; i++) {
            if (i == 32) {
                System.out.println("An incorrect card was found in item " + i);
                break;
            } else {
                System.out.println("Card " + i);
            }
        }
    }
}
