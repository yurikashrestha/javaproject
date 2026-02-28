package stringgggg;
import java.util.Scanner;
public class arkonipt4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();
        System.out.print("Enter a character to count: ");
        char target = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("The character '" + target + "' appears " + count + " times.");
    }
}
