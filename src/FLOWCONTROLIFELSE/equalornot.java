package FLOWCONTROLIFELSE;

import java.util.Scanner;
public class equalornot {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number; ");
        int num = scan.nextInt();

        if (num == 0){
            System.out.println("Your number is equal to zero.");
        } else
            System.out.println("Your number is not equal to zero.");
    }
}
