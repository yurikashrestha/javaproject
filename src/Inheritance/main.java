package Inheritance;
import java.util.Scanner;
public class main {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        Student Student = new Student();
        person person = new person();

        System.out.println("Enter your name: ");
        Student.name = sc.nextLine();
        System.out.println("Enter your age:");
        Student.age = sc.nextInt();
        System.out.println("Enter your roll number: ");
        Student.RollNumber = sc.nextInt();

        Student.displayStudentDetails();
        Student.displayPersonDetails();
    }
}
