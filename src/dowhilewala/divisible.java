package dowhilewala;
import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int count =0;
        int i =1;
        do{
            if (i % 5 == 0) {
                count++;
            } i++;
        }while(i<=100);
        System.out.println(" the count is : " + count);
    }
}
