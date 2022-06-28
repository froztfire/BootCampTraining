package Week2.BankSystem;

import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);          // Scanner Input for Account Type
        int input;

        Operation operation = new Operation();
        System.out.println("Choose an Action to Perform\n[1] List Account\n[2] Create Account\n[3] Search for an Account\n[-1] exit");
        System.out.print("Enter account type: ");
        input = scan.nextInt();

        Scanner accountName = new Scanner(System.in);
        Account account = new Account();
        switch (input){
            case 1 :
//                    Account.listAccount.forEach(account -> {
//                        System.out.println();
//                    });
                break;
            case 2 : operation.accountCreation();
                break;
            case 3 :
                break;
            case -1 : System.out.println("Good Bye!");
        }
    }
}
