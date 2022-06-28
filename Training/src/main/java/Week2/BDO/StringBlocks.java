package Week2.BDO;

public class StringBlocks {

    public void createAccountSelection() {
        String accountCreationBlock = """
             
             Choose an Account Type to Open 
             [1] Regular Account
             [2] Interest Account 
             [3] Checking Account  
             """;
        System.out.print(accountCreationBlock);
    }

    public void operationSelection() {
        String operationBlock = """
             
             Choose an Operation to Perform 
             [1] Deposit
             [2] Withdraw
             [3] Display Account
             [4] Display Transactions
             [-1] Exit
             """;
        System.out.print(operationBlock);
    }

    public void initialSelection() {
        String initialBlock = """
             Choose an Operation to Perform 
             [1] List Account
             [2] Create Account
             [3] Search Account
             [-1] Exit
             Enter action type: """;
        System.out.print(initialBlock);
    }
}
