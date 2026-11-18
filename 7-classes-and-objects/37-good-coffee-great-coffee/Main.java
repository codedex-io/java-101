/**
 * YOU MADE IT TO THE END OF CHAPTER 7! 🎉
 * We've learned a lot about classes and objects in Java.... but we're not done yet! 😅
 * Inspired by the mobile game "Good Coffee, Great Coffee" ☕️☕️☕️☕️☕️
 */


// Create a new class named Order here! 💖
class Order {
    String orderName;
    String drinkName;
    double price;
    boolean isHot;
    char size;
    boolean toGo; 

    Order(String orderName, String drinkName, double price, boolean isHot, char size, boolean toGo) {
        this.orderName = orderName;
        this.drinkName = drinkName;
        this.price = price;
        this.isHot = isHot;
        this.size = size;
        this.toGo = toGo; 
    }
}

public class Main {
     public static void main(String[] args) {  // ✅ Add main() method

        // Create a new Order object here! 💖
        Order order01 = new Order("Elliot", "iced matcha", 6.99, false, 'M', false);
        Order order02 = new Order("Kate", "espresso", 4.99, true, 'M', true);
        Order order03 = new Order("Allison", "iced mocha", 7.99, false, 'L', true); 

        // Add print statements here! 💖
        System.out.println("Order for " + order01.orderName + ": " + 
                           order01.drinkName + " size: " + order01.size + 
                           " iced? " + order01.isHot);

        System.out.println("Order for " + order02.orderName + ": " + 
                           order02.drinkName + " size: " + order02.size + 
                           " iced? " + order02.isHot);

        System.out.println("Order for " + order03.orderName + ": " + 
                           order03.drinkName + " size: " + order03.size + 
                           " iced? " + order03.isHot);
    }  
}
