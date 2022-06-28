package Week2.Examples.Java8Enhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExample {
	public static void main(String[] args) {
		List<Transaction> transactionList = new ArrayList<Transaction>();

		transactionList.add(new Transaction("WDR", 100.00, 300.00));
		transactionList.add(new Transaction("WDR", 1500.00, 100.00));
		transactionList.add(new Transaction("WDR", 1000.00, 100.00));
		transactionList.add(new Transaction("DEP", 2300.00, 600.00));
		transactionList.add(new Transaction("DEP", 200.00, 500.00));

		// filter and foreach
		transactionList.stream()
				.filter(transaction -> transaction.getTransactionType() == "WDR")
				.forEach(transaction -> System.out.println(transaction.getAmount()));

		// filter, map and collect
		List<Double> deposits = transactionList.stream()
				.filter(transaction -> transaction.getTransactionType() == "DEP")
				.map(transaction -> transaction.getAmount())
				.collect(Collectors.toList());
		System.out.println(deposits);
		
		// reduce
		double totalDeposits = deposits.stream().reduce(1.0, (a,b) -> a + b);
		System.out.println(totalDeposits);
		
		// min, max
		Transaction minTransactionBalance = transactionList.stream().min((t1,t2) -> t1.getRunningBalance() > t2.getRunningBalance() ? 1:-1).get();
		System.out.println(minTransactionBalance.getRunningBalance());
		
		Transaction maxTransactionBalance = transactionList.stream().max((t1,t2) -> t1.getRunningBalance() > t2.getRunningBalance() ? 1:-1).get();
		System.out.println(maxTransactionBalance.getRunningBalance());
		

	}
}
