import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String word = "Apple";
        char[] letters = word.toCharArray(); // Convert to a char array
        
        Arrays.sort(letters); // Sort the characters alphabetically
        
        StringBuilder str = new StringBuilder(new String(letters)); // Convert sorted char array back to a string
        
        str.reverse(); // Reverse the string
        
        System.out.println(str.toString()); // Print the reversed sorted string
    }
}
