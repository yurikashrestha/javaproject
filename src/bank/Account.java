package bank;

public class Account {
        int balance = 20000;
        int accountNumber = 12345;
        public void showAccountNumber() {
            System.out.println("Account Number: " + accountNumber);
        }
        private void calculateInterest() {
            double interest = balance * 0.05;
            System.out.println("Interest: " + interest);
        }
        void showBalance() {
            System.out.println("Balance: " + balance);
        }
        public void accessInterest() {
            calculateInterest();
        }
    }

