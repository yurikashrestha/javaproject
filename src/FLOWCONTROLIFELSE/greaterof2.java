package FLOWCONTROLIFELSE;

import java.util.Scanner;
public class greaterof2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();
    if(num1>num2 ){
        System.out.println(num1 + ", Your first number is greater");
    } else if (num2>num1){
        System.out.println(num2 + ", Your second number is greater");
    } else
        System.out.println("Both are equal ");
    }
}
