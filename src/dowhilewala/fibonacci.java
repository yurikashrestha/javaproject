package dowhilewala;
import java.util.Scanner;
public class fibonacci {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("In How many terms?");
        int num = scan.nextInt();
        int a =0;
        int b = 1;
        int i = 0;
        do {
            System.out.println(a + " ");
            b = a+b;
            a= b-a;
            i++;
        } while(i <num);
    }
}
