// The Neopet class has been created for you! 💖

class Neopet {
    String name;
    String species;
    String color;
    char gender; 
    Boolean hasScarf;	
    
    // Add additional attributes here 💖
    double strength;
    double defense;
    double movement;

    // Add a constructor here 💖
    Neopet() {
        strength = 6.2;
        defense = 2.5;
        movement = 5.5;
    }
}

public class Main {
    public static void main(String[] args) {
        Neopet gravatia = new Neopet();

        // Add print statement here 💖
        System.out.println("S: " + gravatia.strength + " D: " + gravatia.defense + " M: " + gravatia.movement);

    }
}
