public class Main {

    public static int launchCalculator(double speed, double time) {
        double distance = speed * time;
        int roundedDistance = (int) Math.round(distance);
        System.out.println("Rounded distance: " + roundedDistance + " meters");
        return roundedDistance;
    }

    public static void main(String[] args) {
        // Example values for speed and time
        launchCalculator(2500.5, 7.5); 
    }
}
