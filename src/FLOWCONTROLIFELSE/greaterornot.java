package FLOWCONTROLIFELSE;

import java.util.Scanner;
public class greaterornot {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =scan.nextInt();

        if (num >= 10){
            System.out.println("The number is greater than 10.");
        } else
            System.out.println("The number is not greater than 10.");
    }
}
