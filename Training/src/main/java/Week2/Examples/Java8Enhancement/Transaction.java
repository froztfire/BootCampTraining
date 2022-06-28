package Week2.Examples.Java8Enhancement;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.StringJoiner;

public class Transaction {

	LocalDateTime transactionDate;
	String transactionType;
	double amount;
	double runningBalance;
         
    
	public Transaction(String transactionType, double amount, double runningBalance) {
		this.transactionDate = LocalDateTime.now();
		this.transactionType = transactionType;
		this.amount = amount;
		this.runningBalance = runningBalance;
	}
	
	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getRunningBalance() {
		return runningBalance;
	}
	public void setRunningBalance(double runningBalance) {
		this.runningBalance = runningBalance;
	}
	public void displayInfo() {
		StringJoiner sj1 = new StringJoiner("\t\t");
		sj1.add(transactionDate.toString()).add(transactionType).add(String.valueOf(amount)).add(String.valueOf(runningBalance));
		System.out.println(sj1.toString());
	}
}
