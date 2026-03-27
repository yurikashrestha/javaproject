package inheritanceept2;
import java.util.Scanner;
public class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        Student s = new Student(name, rollNumber);
        s.display();

    }
}

