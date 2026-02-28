package stringgggg;
import java.util.Scanner;
public class stringkopt4 {
    public static void main (String [] main){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
           char ch = text.charAt(i);
           System.out.println(ch);
        }
}
}
