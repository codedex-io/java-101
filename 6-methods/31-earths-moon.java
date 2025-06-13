// Earth's Moon 🌑
// Codédex

public class HelloWorld {

    public static double earthMoonWeight(String name, int weight, String unit) {
        
        double moonWeight = weight * (1.62 / 9.81);
        return moonWeight;
        
    }

    public static void main(String[] args) {

        String name = "Max";
        int earthWeight = 30;
        String unit = "lbs";
        double moonWeight = earthMoonWeight(name, earthWeight, unit);

        System.out.println("Hi " + name + "! Your weight on Earth is " + earthWeight + unit + 
                           " and your weight on the moon would be about " + moonWeight + unit + ".");
    }
}
