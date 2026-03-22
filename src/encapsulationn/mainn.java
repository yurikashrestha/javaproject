package encapsulationn;

public class mainn {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.setAccountNumber(101);
        acc.setAccountHolderName("Yurika");
        acc.setBalance(1000);

        acc.deposit(500);
        acc.withdraw(300);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}


