public class HelloWorld {
    public static void main(String[] args) {

        boolean isLatte = true;
        boolean isIced = false;
        boolean withMatcha = true;
        int itemsOrdered = 1; 
        int vanillaPumps = 3; 

        if (isLatte && isIced) {
            System.out.println("espresso, milk, ice, syrup");
        } else if (isLatte && withMatcha) {
            System.out.println("matcha, oat milk, ice, vanilla.");
        } else if (isLatte) {
            System.out.println("espresso, steamed milk.");
        } else {
            System.out.println("Select a drink to get started!");
        }

        if (itemsOrdered > 1) {
            System.out.println("provide cup holder.");
        }

        if (vanillaPumps >= 2) {
            System.out.println("charge $1 for extra vanilla.");
        }
        
    }
}
