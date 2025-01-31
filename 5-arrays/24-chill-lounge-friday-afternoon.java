import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here 💖

        int[] playlistA = {
            3094234, 12323, 90990, 373737, 128732, 4388934, 2343947, 6548234, 234823, 4568, 
            2345234, 234234, 678768, 6456, 787, 46456, 678567, 354345, 23423, 645745, 23423, 
            2435423, 786768, 678786 
        };

        int[] playlistB = {
            234823, 678786, 354345, 3094234, 6456, 678567, 23423, 786768, 
            46456, 128732, 6548234, 234234, 4568, 4388934, 23423, 12323, 
            2343947, 2435423, 645745, 678768, 2345234, 90990, 373737, 787
        };
        
        Arrays.sort(playlistA);
        Arrays.sort(playlistB);

        boolean isEqual = Arrays.equals(playlistA, playlistB);

        if(isEqual) {
            System.out.println("This is the same playlist!"); 
        } else {
            System.out.println("No match was found.");
        }
    }
}
