package inheritanceept2;
import java.util.Scanner;
public class main2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount();
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        account.displayBalance();

    }
}
