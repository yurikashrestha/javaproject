package dowhilewala;
import java.util.Scanner;
public class asciivalue {
    public static void main(String[] args){
     //   Scanner scan = new Scanner(System.in);
//        System.out.print("Enter start character: ");
//        char start = scan.next().charAt(0);
        System.out.print(" Ascii value:");
        char ch ='A';
        do{
            System.out.println(ch + " = " + (int)ch);
            ch++;
        }
        while(ch<='Z');
    }
}
