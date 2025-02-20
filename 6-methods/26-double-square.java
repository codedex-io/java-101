public class HelloWorld {
    public static boolean isEven(int a) {
        return a % 2 == 0; 
    }

    public static void main(String[] args) {
        System.out.println(isEven(8));  
        System.out.println(isEven(10));
        System.out.println(isEven(7));  
    }
}