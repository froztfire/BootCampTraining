package Week2.BankSystemUpdated;

public class InterestAccount extends Account{

    private String acctType;
    private double balance;
    private double interestCharge;

    @Override
    public String getAcctType() {
        return acctType;
    }

    @Override
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getInterestCharge() {
        return interestCharge;
    }

    @Override
    public void setInterestCharge(double interestCharge) {
        this.interestCharge = interestCharge;
    }

    public InterestAccount(){
        super();
        this.balance = 0;
        this.acctType = "Interest Account";
        this.interestCharge = 3.0;
    }

    @Override
    public void displayAccountInfo(Account account){
        super.displayAccountInfo(account);
        System.out.println("Account Type: "+account.getAcctType());
        System.out.println("Interest Charge: "+account.getInterestCharge());
    }
}
