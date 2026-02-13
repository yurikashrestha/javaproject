package dowhilewala;
import java.util.Scanner;
public class sumwala {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter N: ");
            int N = scan.nextInt();
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += i;
            }
            System.out.println("The sum of first " + N + " natural numbers = " + sum);
        }
}


//            int i = 1, sum = 0;
//            do {
//                sum += i;
//                i++;
//            } while (i <= N);
//
//            System.out.println("THe sum of first " + N + " natural numbers = " + sum);

//        int i = 1, sum = 0;
//        while (i <= N) {
//            sum += i;
//            i++;
//        }
//   System.out.println("The sum of first " + N + " natural numbers = " + sum);
//        }
//    }




