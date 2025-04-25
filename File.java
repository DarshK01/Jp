import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {
    // Method to read a file and throw exception if file not found
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file); // May throw FileNotFoundException

        System.out.println("Contents of the file:");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name to read: ");
        String fileName = input.nextLine();
        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Exception: File not found - " + fileName);
        }

        input.close();
    }
}
