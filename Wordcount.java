import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the text:");
        String text = scanner.nextLine().toLowerCase();
        
        System.out.println("Enter the word to count:");
        String word = scanner.next().toLowerCase();
        
        String[] words = text.split("\\W+");
        int count = 0;
        
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        
        System.out.println("The word '" + word + "' appears " + count + " times in the given text.");
        
        scanner.close();
    }
}
