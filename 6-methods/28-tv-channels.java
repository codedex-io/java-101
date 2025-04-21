public class HelloWorld {

    // This method multiplies the channel codes and returns the result 📺
    public static int multiply(int[] channelCodes) {
        int result = 1;
        for (int i = 0; i < channelCodes.length; i++) {
            result *= channelCodes[i];
        }
        return result;
    }

    // Create first method here 💖
    public static int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    // Create second method here 💖
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        System.out.println("The result is " + multiply(new int[] { 1, 2, 3, 4, 5 }));  
        System.out.println("The result is " + multiply(13, 8, 2));
        System.out.println("The result is " + multiply(7, 9, 3));
        System.out.println("The result is " + multiply(233.9, 0.09));  
        System.out.println("The result is " + multiply(0.1, 0.1));
    }
}
