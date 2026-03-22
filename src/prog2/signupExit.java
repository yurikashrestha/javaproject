package prog2;

import java.util.Scanner;
import java.util.Date;

class Registration {
    boolean registration(String name, long number, String pass, String comparepass, Date dob) {


        if (!pass.equals(comparepass)) {
            System.out.println("Passwords do not match!");
            return false;
        }

        System.out.println("\nRegistration Successful!");
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("DOB: " + dob);

        return true;
    }
}

public class signupExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number 1 to signup ");
        System.out.println("Please enter number 2 to exit the application");

        Registration re = new Registration();
        int userInput = sc.nextInt();
        sc.nextLine();

        switch (userInput) {
            case 1:
                System.out.println("Enter your name:");
                String name = sc.nextLine();

                System.out.println("Enter your number:");
                long number = sc.nextLong();
                sc.nextLine();

                System.out.println("Enter your password:");
                String pass = sc.nextLine();

                System.out.println("Enter your password again to confirm:");
                String comparepass = sc.nextLine();

                System.out.println("Enter your date of birth: " );
                long dobInput = sc.nextLong();
                Date dob = new Date(dobInput);


                re.registration(name, number, pass, comparepass, dob);
                break;

            case 2:
                System.out.println("Thanks for using this application");
                System.exit(0);

            default:
                System.out.println("Invalid input...");
        }
    }
}