package Comparisonooperatorssss;

import java.util.Scanner;

public class logicverify {
    public static void main(String[] args){

     Scanner scan = new Scanner(System.in);
     System.out.print("Enter value of a: ");
     int a = scan.nextInt();
     System.out.print("Enter value of b: ");
     int b = scan.nextInt();
     System.out.print("Enter value of c: ");
     int c = scan.nextInt();
     boolean result = ((a < b) && (b < c)) || (a == 5);
     System.out.println(result);
            }
        }

