package dowhilewala;

import java.util.Scanner;
public class one {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num = scan.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = scan.nextInt();
//        for (int i = num; i<= num2; i++ ) {
//            System.out.println(i );
        int i = num;
        do {System.out.println(i);
            i++;}
        while (i<= num2);}}
//        while(i <= num2){
//            System.out.println(i);
//            i++;


