public class Main2 {

    public static void main(String[] args) {

        Account acc = new Account(101, "Mahammad", 500);

        acc.deposit(200);

        System.out.println("Balance after deposit: " + acc.getBalance());

        try {
            acc.withdraw(800); // invalid
        } 
        catch (InvalidAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Final balance: " + acc.getBalance());
    }
}