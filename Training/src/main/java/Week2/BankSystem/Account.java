package Week2.BankSystem;

import java.util.*;

public class Account {
    public static HashMap<String, Account> listAccount = new HashMap<>();

    private String name;
    private String acctNumber;
    private double balance;
    private double minimumBalance;
    private double penalty;
    private String acctType;
    private double interestCharge;

    private double transactionCharge;

    public Account(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public void setInterestCharge(double interestCharge) {
        this.interestCharge = interestCharge;
    }

    public void setTransactionCharge(double transactionCharge) {
        this.transactionCharge = this.transactionCharge;
    }

    public String getName() {
        return name;
    }

    public String getAcctNumber() {
        return acctNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public double getPenalty() {
        return penalty;
    }

    public String getAcctType() {
        return acctType;
    }

    public double getInterestCharge() {
        return interestCharge;
    }

    public double getTransactionCharge() {
        return transactionCharge;
    }

    public void displayAccountInfo(Account account){
        System.out.println("==============================");
        System.out.println("Account Name: "+ account.getName());
        System.out.println("Account Number: "+account.getAcctNumber());
        System.out.println("Account Balance: "+account.getBalance());
    }

    Account (){
    }

}
