import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here 💖

        String[] passkeys = {"ASDFDFA", "34958234985234820934", "243082304920394", "ASDFAFMMMMMMMMM99999999", "12212112", "23094230482"};
        Arrays.sort(passkeys);

        String[] sortedPasswords = new String[3];

        for (int i = 0; i < 3; i++) {
            sortedPasswords[i] = passkeys[i];
            // System.out.println(sortedPasswords[i]); To check if the passwords are sorted
        }
        
        // Method 1: Concatenate the first three sorted passwords
        String passphrase = sortedPasswords[0] + sortedPasswords[1] + sortedPasswords[2];
        System.out.println(passphrase);
        
        
        // Method 2: Concatenate the first three sorted passwords
        String combinedElements = "";

        for (int i = 0; i < sortedPasswords.length; i++) {
            combinedElements = combinedElements + sortedPasswords[i]; 
        }
    }
}
