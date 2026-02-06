package Comparisonooperatorssss;

import java.util.Scanner;
public class simpleint {
    public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Principal (P): ");
    double P = scan.nextDouble();

    System.out.print("Enter Time (T): ");
    double T = scan.nextDouble();

    System.out.print("Enter Rate (R): ");
    double R = scan.nextDouble();

    double simpleInterest = (P * T * R) / 100;
    double totalAmount = P + simpleInterest;

    System.out.println("Simple Interest = " + simpleInterest);
    System.out.println("Total Amount = " + totalAmount);
    }
}
