package inheritanceept2;
import java.util.Scanner;
public class main {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter programming language ");
        String programmingLanguage = sc.nextLine();

        Developer dev = new Developer(name, salary, programmingLanguage);

        dev.displayDeveloper();

    }
}
