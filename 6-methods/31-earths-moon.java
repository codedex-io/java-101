// Earth's Moon 🌑
// Codédex

public class HelloWorld {

    public static void earthMoonWeight(String name, int weight, String unit){
        
      double weightOnMoon = weight * (1.62 / 9.81);
      String message = "Hi " + name + "! Your weight on Earth is " + weight + " and your weight on the moon would be about " + weightOnMoon + unit +". ";
      System.out.println(message);
        
    }

    public static void main(String[] args) {
        earthMoonWeight("Max",30,"lbs");
    }
}
