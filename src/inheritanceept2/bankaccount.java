package inheritanceept2;

public class bankaccount {
    double balance;

        bankaccount() {
            this.balance = 0;
        }

        void deposit(double amount) {
            this.balance += amount;
            System.out.println("Deposited: " + (int)amount);
        }

        void displayBalance() {
            System.out.println("Balance: " + (int)balance);
        }
    }

    class SavingsAccount extends bankaccount {
        SavingsAccount() {
            super();
        }
    }


