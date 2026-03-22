package encapsulationn;

public class BankAccount {
    private int AccountNumber;
    private String AccountHolderName;
    private double Balance;

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String AccountHolderName) {
        this.AccountHolderName = AccountHolderName;
    }
    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            Balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= Balance){
            Balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }


    public void displayAccountDetails(){
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Account Holder: " + AccountHolderName);
        System.out.println("Balance: " + Balance);
    }
}