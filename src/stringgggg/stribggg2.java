package stringgggg;
import java.util.Scanner;
public class stribggg2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or a sentence");
        String usrInput = scanner.nextLine();
        if(usrInput.length() > 0){
            char firstChar =usrInput.charAt(0);
            System.out.println("First character: " + firstChar);
            char lastChar = usrInput.charAt(usrInput.length() - 1);
            System.out.println("Last character: " + lastChar);if (usrInput.length() % 2 != 0) {
                int middleIndex = usrInput.length() / 2;
                char middleChar = usrInput.charAt(middleIndex);
                System.out.println("Middle character: " + middleChar);
            } else {
                System.out.println("The length is even, so there is no single middle character.");
            }
        } else {
            System.out.println("The string is empty.");
        }
        }
    }

