package Comparisonooperatorssss;

import java.util.Scanner;
public class weekendalarm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day: ");
        String day = scan.nextLine();

        boolean isSaturday = true;
        boolean isSunday = false;
        boolean canSleepIn = isSaturday || isSunday;

        if (canSleepIn) {
            System.out.println("You can sleep in");
        } else {
            System.out.println("You cannot sleep in");
        }
    }
}
