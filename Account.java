class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }

    void transfer(Account receiver, int amount) {
        if (balance >= amount) {
            balance -= amount;
            receiver.balance += amount;

            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Balance = Rs. " + balance);
    }
}

class BankDemo {
    public static void main(String[] args) {
        Account a1 = new Account(10000);
        Account a2 = new Account(5000);

        a1.transfer(a2, 3000);

        System.out.println("Account 1:");
        a1.display();

        System.out.println("Account 2:");
        a2.display();
    }
}