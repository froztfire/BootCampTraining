package Week2.BDO;

public class RegularAccount extends Account{

    public RegularAccount() {
        this.setBalance(500);
        this.setAccType("Regular Account");
        this.setMinimumBalance(500);
        this.setPenalty(10);
    }
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Balance: "  +getBalance());
        System.out.println("Account Type: "  +getAccType());
        System.out.println("Minimum Balance: " + getMinimumBalance());
        System.out.println("Penalty: " + getPenalty());
    }
}
