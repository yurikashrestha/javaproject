package FLOWCONTROLIFELSE;
import java.util.Scanner;
public class grade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade");
        int marks = scan.nextInt();
        if (marks >= 90) {
            System.out.println("Congratulations you have got an A.");
        }else if(marks >= 75) {
            System.out.println("You have got a B grade.");
        }else if(marks >=60){
            System.out.println("You have got a C grade.");
        }else System.out.println("You have failed.");
        }
    }

