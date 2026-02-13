package FLOWCONTROLIFELSE;
import java.util.Scanner;
public class largeno {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();
        System.out.println("Enter third number:");
        int c = scan.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number");
        } else {
            System.out.println(c + " is the largest number");
        }
    }
}

