package Week2.BankSystem;

import java.time.LocalDateTime;

public class Transaction {

    private LocalDateTime timeStamp;

    private String type;

    private double amount;

    private double runningBalance;

    public Transaction(LocalDateTime timeStamp, String type, double amount, double runningBalance){
        this.timeStamp = timeStamp;
        this.type = type;
        this.amount = amount;
        this.runningBalance = runningBalance;
    }
    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getRunningBalance() {
        return runningBalance;
    }
}
