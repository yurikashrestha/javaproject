package jan31home;

import java.util.Scanner;

public class clawork {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if(num % 2 == 1 )
        {
            System.out.println("odd");
        }else
            System.out.println("even");

    }
}
