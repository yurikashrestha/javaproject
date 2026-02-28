package stringgggg;
import java.util.Scanner;
public class arkonipt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        int length = text.length();
        if (length < 5) {
            System.out.println("Too short");
        } else if (length >= 5 && length <= 10) {
            System.out.println("Medium");
        } else {
            System.out.println("Long string");
        }
    }
}