package Week2.BDO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String select;
            StringBlocks initialSelectionBlock = new StringBlocks();
            Scanner input = new Scanner(System.in);
            Operation createAccount = new Operation();
            initialSelectionBlock.initialSelection();
            select = input.next();
            switch (select) {
                case "1":
                    System.out.println("Show Account List");
                    break;
                case "2":
                    createAccount.accountCreation();
                    break;
                case "3":
                    System.out.println("Search an Account");
                    break;
                default:
                    System.out.println("invalid input");
            }
        }
}
