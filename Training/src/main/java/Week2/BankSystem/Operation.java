package Week2.BankSystem;

import java.time.LocalDateTime;
import java.util.*;

public class Operation{

    Account account;
    public Operation(Account account){
        this.account = account;
    }
    public Operation(){
    }

    ArrayList<Transaction> transactionArray = new ArrayList<>();

    public void selectTransaction() {


        int input;

        do {     // repetition of selection of operation to be perform
            Scanner scan = new Scanner(System.in);
            System.out.println("\n======================");
            System.out.println("Choose an Operation to Perform\n[1] Deposit\n[2] Withdraw\n[3] Display Account Info\n[4] Display Transaction\n[-1] exit");
            System.out.print("Enter Transaction type: ");
            input = scan.nextInt();

            double amount = 0.0;
            switch (input) {
                case 1:  // Select DEPOSIT TRANSACTION
                    System.out.print("Enter Amount to Deposit: ");
                    double inputDeposit = scan.nextDouble();

                    if (this.account.getAcctType() == "Checking Account") {
                        this.account.setBalance(this.account.getBalance() + inputDeposit - this.account.getTransactionCharge());      // checking account transaction always deduct 1 for transaction fee
                    } else {
                        this.account.setBalance(this.account.getBalance() + inputDeposit);  // just add the deposit account to current balance if not checking account
                    }
                    amount = this.account.getBalance();
                    transactionArray.add(new Transaction(LocalDateTime.now(), "DEP", inputDeposit, amount));  // populate transactionArraylist object
                    System.out.println("Current Balance: " + this.account.getBalance());
                    break;
                case 2:   // Select WITHDRAW TRANSACTION

                    System.out.print("Enter Amount to Withdraw: ");
                    double inputWithdraw = scan.nextDouble();

                    if (this.account.getAcctType() == "Regular Account") {                       // Identify what type of account this case is regular account
                        this.account.setBalance(this.account.getBalance() - inputWithdraw);     // current balance minus the amount that you withdrawn

                        if (this.account.getBalance() < this.account.getMinimumBalance()) {
                            this.account.setBalance(this.account.getBalance() - this.account.getPenalty());            // when the current balance is less than 500, every withdrawal will deduct additional 10
                        }

                    } else if (this.account.getAcctType() == "Interest Account") {              // Identify what type of account this case is interest account
                        this.account.setBalance(this.account.getBalance() - inputWithdraw);     // current balance minus the amount that you withdrawn

                    } else if (this.account.getAcctType() == "Checking Account") {              // Identify what type of account this case is regular account
                        this.account.setBalance(this.account.getBalance() - inputWithdraw);     // current balance minus the amount that you withdrawn

                        if (this.account.getBalance() < this.account.getMinimumBalance()) {
                            this.account.setBalance(this.account.getBalance() - (this.account.getPenalty() + this.account.getTransactionCharge()));            // when the current balance is less than 100, every withdraw transaction will deduct additional 10 for penalty and 1 for transaction fee

                        } else {
                            this.account.setBalance(this.account.getBalance() - this.account.getTransactionCharge());              // when the current balance is above 100, only 1 will deduct for transaction fee
                        }
                    }
                    amount = this.account.getBalance();                                           // the value of the current balance will be pass to amount variable
                    transactionArray.add(new Transaction(LocalDateTime.now(), "WDR", inputWithdraw, amount));   // new transaction object will add to transaction array list
                    System.out.println("Current Balance: " + amount);                               // will print out the current balance
                    break;
                case 3:   // Select DISPLAY INFO TRANSACTION
                    account.displayAccountInfo(account);
                    break;
                case 4:
                    tableSorting();
                    break;
                    default :
            }
        }
        while (input != -1); // termination of loop for the selection of operation to be perform
    }
    public void accountCreation(){
        Scanner scan = new Scanner(System.in);          // Scanner Input for Account Type
        int input;

        System.out.println("Choose an account type to open\n[1] Regular Account\n[2] Interest Account\n[3] Checking Account\n[-1] exit");
        System.out.print("Enter account type: ");
        input = scan.nextInt();

        Scanner accountName = new Scanner(System.in);    // Scanner Input for Account Name
        String name = "";
        Account account = null;
        switch (input)  {
            case 1 :System.out.print("Enter Account Name: ");
                    account = new RegularAccount();
                    break;
            case 2 :System.out.print("Enter Account Name: ");
                    account = new InterestAccount();
                    break;
            case 3 :System.out.print("Enter Account Name: ");
                    account = new CheckingAccount();
                    break;
            case -1 :System.out.println("Good Bye!");
                break;
            default :System.out.println("invalid input!");
        }
        name = accountName.nextLine();
        account.setName(name);
        account.setAcctNumber(String.format("%06d",generateRandomAcc()));
        account.displayAccountInfo(account);

        Operation operation = new Operation(account);            // Instantiate Operation Class to create new operation object which have return type "name" from regular account
        operation.selectTransaction();
        Account.listAccount.put(account.getAcctNumber(),account);
    }
    private static int generateRandomAcc(){
        Random accountRandom = new Random();
        return accountRandom.nextInt(99999999);
    }
    public void tableSorting() {
        Scanner scan = new Scanner(System.in);
        int input;
        do {
            System.out.println("\nChoose Transaction Sort type\n[1] By Transaction Date\n[2] By Transaction Type\n[3] By Amount\n[-1] Back");
            System.out.print("Enter account type: ");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.print("\nBy Transaction Date Selected! ");
                    List<Transaction> sortedList = transactionArray.stream()
                            .sorted(Comparator.comparing(Transaction::getTimeStamp))
                            .toList();
                    System.out.println("\n==========================================================================================");
                    System.out.println("Transaction Date                         Type           Amount          Running Balance");
                    for (Transaction transaction : sortedList) {
                        System.out.println(transaction.getTimeStamp() + "             " + transaction.getType() + "                " + transaction.getAmount() +"       "+ transaction.getRunningBalance());
                    }
                    break;
                case 2:
                    System.out.print("\nBy Transaction Type Selected! ");
                    List<Transaction> sortedList2 = transactionArray.stream()
                            .sorted(Comparator.comparing(Transaction::getType))
                            .toList();
                    System.out.println("\n==========================================================================================");
                    System.out.println("Transaction Date                         Type           Amount          Running Balance");
                    for (Transaction transaction : sortedList2) {
                        System.out.println(transaction.getTimeStamp() + "             " + transaction.getType() + "                " + transaction.getAmount() +"       "+ transaction.getRunningBalance());
                    }
                    break;
                case 3:
                    System.out.print("\nBy Amount Selected! ");
                    List<Transaction> sortedList3 = transactionArray.stream()
                            .sorted(Comparator.comparing(Transaction::getType))
                            .toList();
                    System.out.println("\n==========================================================================================");
                    System.out.println("Transaction Date                         Type           Amount          Running Balance");
                    for (Transaction transaction : sortedList3) {
                        System.out.println(transaction.getAmount() + "             " + transaction.getType() + "                " + transaction.getAmount() +"       "+ transaction.getRunningBalance());
                    }
                    break;
                case -1:
//                    AccountTransaction accountTransaction = new AccountTransaction();
//                    accountTransaction.transaction();
                    break;
                default:
                    System.out.println("Invalid Input!!\n");
            }
            System.out.println("\n==========================================================================================");
            System.out.println("Transaction Date                         Type           Amount          Running Balance");
            for (Transaction transaction : transactionArray) {      // extract amount array content.
                System.out.println(transaction.getTimeStamp() + "             " + transaction.getType() + "           " + transaction.getAmount() + "             " + transaction.getRunningBalance());
            }
            System.out.println("==========================================================================================");
        } while (input != -1);
    }



}
