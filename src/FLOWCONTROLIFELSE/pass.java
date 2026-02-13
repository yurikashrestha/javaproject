package FLOWCONTROLIFELSE;
import java.util.Scanner;
public class pass {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = scan.nextInt();
         if (marks >= 45){
             System.out.println("You have passed");
         } else
             System.out.println("You have failed");
    }
}
