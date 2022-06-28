package Week2.BDO;
public class InterestAccount extends Account{
    public InterestAccount() {
        this.setAccType("Interest Account");
        this.setBalance(100.0);
        this.setInterestCharge(3.0);
    }
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Balance : " + getBalance());
        System.out.println("Account Type: " + getAccType());
        System.out.println("Charge: " + getInterestCharge());
    }
}
