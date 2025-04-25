import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        // Convert string to char array and sort
        char[] characters = input.toCharArray();
        Arrays.sort(characters);
        
        // Create sorted string
        String sortedString = new String(characters);
        
        // Display result
        System.out.println("String in alphabetical order: " + sortedString);
        
        scanner.close();
    }
}
