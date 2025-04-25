import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateCheckWithException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("How many numbers do you want to enter? ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " numbers:");

        try {
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (numbers.contains(num)) {
                    throw new Exception("Duplicate number found: " + num);
                }
                numbers.add(num);
            }
            System.out.println("All numbers are unique.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        scanner.close();
    }
}
