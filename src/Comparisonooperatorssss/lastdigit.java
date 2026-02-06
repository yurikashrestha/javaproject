package Comparisonooperatorssss;

import java.util.Scanner;

public class lastdigit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;

        boolean result = (lastDigit1 == lastDigit2);

        System.out.println(result);
    }
}