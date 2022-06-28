package Week2.BDO;

public class CheckingAccount extends Account{
    public CheckingAccount() {
        this.setBalance(100.0);
        this.setAccType("Checking Account");
        this.setMinimumBalance(100.0);
        this.setPenalty(10.0);
        this.setInterestCharge(0.0);
        this.setTransactionCharge(1.0);
    }
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Balance: "  +getBalance());
        System.out.println("Account Type: "  +getAccType());
        System.out.println("Minimum Balance: " + getMinimumBalance());
        System.out.println("Penalty: " + getPenalty());
        System.out.println("Interest Charge: " + getInterestCharge());
        System.out.println("Transaction Charge: " + getTransactionCharge());
    }
}
