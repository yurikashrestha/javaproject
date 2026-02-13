package dowhilewala;
 import java.util.Scanner;
public class multiplytable {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("Multiplication Table of " + num + ":");
        int i = 1;
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }while(i <= 10);
        }}
//        while (i <= 10) {
//            System.out.println(num + " x " + i + " = " + (num * i));
//            i++;
//        }}}



//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num + " x " + i + " = " + (num * i));
//        }
//    }
//}
