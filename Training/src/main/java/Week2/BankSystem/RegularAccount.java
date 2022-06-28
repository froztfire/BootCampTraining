package Week2.BankSystem;
import java.util.Random;
public class RegularAccount extends Account{

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
    public RegularAccount(){
        super();
        this.balance = 500.0;
        this.acctType = "Regular Account";
        this.penalty = 10.0;
        this.minimumBalance = 500.0;
    }
    @Override
    public void displayAccountInfo(Account account){
        super.displayAccountInfo(account);
        System.out.println("Account Type: "+account.getAcctType());
        System.out.println("Minimum Balance: "+account.getMinimumBalance());
        System.out.println("Penalty: "+account.getPenalty());
    }
}
