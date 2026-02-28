package stringgggg;
import java.util.Scanner;
public class string1st {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String userInput = scanner.nextLine();
    int length = userInput.length();
    System.out.println("Length of the string: " + length);
        String upperText = userInput.toUpperCase();
        System.out.println("Uppercase version: " + upperText);
        String lowerText = userInput.toLowerCase();
        System.out.println("Lowercase version: " + lowerText);

    }
}
