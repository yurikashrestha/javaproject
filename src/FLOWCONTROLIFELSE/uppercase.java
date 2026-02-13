package FLOWCONTROLIFELSE;
import java.util.Scanner;
public class uppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = scan.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        } else {
            System.out.println(ch + " is not an alphabet character");
        }
    }
}
