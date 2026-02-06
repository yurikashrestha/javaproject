package jan31home;

import java.util.Scanner;

public class next1 {
    public static void main(String [] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scan.nextInt();

    if (num > 0) {
       System.out.println("The number is positive");
    } else {
       System.out.println("The number is negative");
        }
    }
}
