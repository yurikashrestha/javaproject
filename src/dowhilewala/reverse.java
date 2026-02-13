package dowhilewala;
import java.util.Scanner;
public class reverse {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = scan.nextInt();
        int rev = 0;
        do {
            int num2 = num%10;
            rev = rev*10 + num2;
            num /= 10;
        } while(num!=0);
        System.out.println(rev);
    }
}
