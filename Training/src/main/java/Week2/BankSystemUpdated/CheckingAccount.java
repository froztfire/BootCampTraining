package Week2.BankSystemUpdated;

public class CheckingAccount extends Account{

    private double transactionCharge;
    private double minimumBalance;
    private double penalty;
    private String acctType;
    private double balance;

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getTransactionCharge() {
        return transactionCharge;
    }

    @Override
    public void setTransactionCharge(double transactionCharge) {
        this.transactionCharge = transactionCharge;
    }

    @Override
    public double getMinimumBalance() {
        return minimumBalance;
    }

    @Override
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    @Override
    public double getPenalty() {
        return penalty;
    }

    @Override
    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    @Override
    public String getAcctType() {
        return acctType;
    }

    @Override
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public CheckingAccount(){
        super();
        this.balance = 100.0;
        this.acctType = "Checking Account";
        this.penalty = 10.0;
        this.minimumBalance = 100.0;
        this.transactionCharge = 1;
    }

    @Override
    public void displayAccountInfo(Account account){
        super.displayAccountInfo(account);
        System.out.println("Account Type: "+account.getAcctType());
        System.out.println("Minimum Balance: "+account.getMinimumBalance());
        System.out.println("Penalty: "+account.getPenalty());
        System.out.println("Transaction Charge: "+account.getTransactionCharge());

    }
}
