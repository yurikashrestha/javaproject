package Comparisonooperatorssss;

import java.util.Scanner;

public class rangefinder {
    public static void main (String [] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

       if ((n>10) && (n<20)){
            System.out.println("The value of n lies in the range");
        }
        else {
            System.out.println("The value of n doesnot lie inside the range");
        } }
}
