package stringgggg;
import java.util.Scanner;
public class arkoni {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        String str = original.toLowerCase();
        boolean isPalindrome = true;
        int length = str.length();
        for (int i = 0; i < length / 2; i++){
        if (isPalindrome && length > 0) {
            System.out.println("'" + original + "' is a palindrome.");
        } else {
            System.out.println("'" + original + "' is not a palindrome.");
        }   } }}
