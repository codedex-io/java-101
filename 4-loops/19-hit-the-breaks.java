public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("Break at " + i);
                break;
            }
        }
        
    }
}
