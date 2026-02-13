package dowhilewala;
import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        long factorial = 1;
        int i = 1;
        do {
            factorial = factorial * i;
            i++;
        } while (i <= num);
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}