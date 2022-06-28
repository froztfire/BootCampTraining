package Week2.BDO;

import java.util.Scanner;

public class Operation {

    StringBlocks operation = new StringBlocks();

    Account regDisplay = new RegularAccount();
    Account intDisplay = new InterestAccount();
    Account checkDisplay = new InterestAccount();

    public void performOperation(){
        operation.operationSelection();
        Scanner ops = new Scanner(System.in);
        String selectedOperation;
        System.out.println("Enter transaction type:");
        selectedOperation = ops.next();
        switch (selectedOperation) {
            case "1" -> System.out.println("You must Deposit");
            case "2" -> System.out.println("You must Withdraw");
            case "3" -> regDisplay.displayAccountInfo();
            case "4" -> System.out.println("You must Display Transaction");
            default -> System.out.println("invalid input");
        }
    }
    public void accountCreation(){
        StringBlocks selectedAccountType = new StringBlocks();
        Account regularAccount = new RegularAccount();
        Account interestAccount = new InterestAccount();
        Account checkingAccount = new CheckingAccount();
        selectedAccountType.createAccountSelection();
        Scanner type = new Scanner(System.in);
        System.out.print("Enter account type: ");
        String acctType = type.next();
        Scanner name = new Scanner(System.in);
        String acctName;
        System.out.print("Enter Account Name: ");

        switch (acctType) {
            case "1" -> {
                acctName = type.next();
                regularAccount.setName(acctName);
                regularAccount.displayAccountInfo();
                performOperation();
            }
            case "2" -> {
                acctName = type.next();
                interestAccount.setName(acctName);
                interestAccount.displayAccountInfo();
                performOperation();
            }
            case "3" -> {
                acctName = type.next();
                checkingAccount.setName(acctName);
                checkingAccount.displayAccountInfo();
                performOperation();
            }
        }
    }
}
