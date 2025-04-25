import java.util.Scanner;
import java.util.Vector;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> shoppingList = new Vector<>();
        System.out.println("Enter 5 shopping items:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            String item = scanner.nextLine();
            shoppingList.add(item);
        }
        System.out.println("\nYour shopping list:");
        for (String item : shoppingList) {
            System.out.println("- " + item);
        }
        scanner.close();
    }
}
