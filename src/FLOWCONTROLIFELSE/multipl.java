package FLOWCONTROLIFELSE;
import java.util.Scanner;
public class multipl {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scan.nextInt();

        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println(num + " is a multiple of 3 and 7");
        } else {
            System.out.println(num + " is not a multiple of 3 or 7");
        }
    }
}
