public class HelloWorld {
    // Create method here 💖
    public static boolean isEqual222(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum == 222;
    }

    public static void main(String[] args) {
        System.out.println("The first method is " + isEqual222(47, 85, 90));  
        System.out.println("The second method is " + isEqual222(90, 10, 47));
        System.out.println("The third method is " + isEqual222(30, 80, 82));  
    }
}
