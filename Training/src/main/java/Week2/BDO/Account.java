package Week2.BDO;

import java.util.Random;

public class Account {
    private String name;
    private String acctNum;
    private double balance;
    private double minimumBalance;
    private double penalty;
    private double transactionCharge;
    private double amount;
    private double interestCharge;

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    private String accType;

    public double getInterestCharge() {
        return interestCharge;
    }

    public void setInterestCharge(double interestCharge) {
        this.interestCharge = interestCharge;
    }

    public int generateRandomAcc(){
        Random accountRandom = new Random();
        return accountRandom.nextInt(99999999);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getTransactionCharge() {
        return transactionCharge;
    }

    public void setTransactionCharge(double transactionCharge) {
        this.transactionCharge = transactionCharge;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void displayAccountInfo(){
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Account Name: "+ this.getName());
        this.setAcctNum(String.format("%06d",generateRandomAcc()));
        System.out.println("Account Number: "+ this.getAcctNum());
    }

}
