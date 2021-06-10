import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) {
        FileReader fileScan = new FileReader();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the banking app!");
        while (true) {
            System.out.println("Options:\n1. View Account\n2. Deposit\n3. Withdraw\n4. Create Account\n5. Delete Account");
            String inputString = input.nextLine();
            if (inputString.equals("1")) {
                System.out.println("Please enter your account ID.");
                inputString = input.nextLine();
                Account.viewAccount(Integer.parseInt(inputString));
            }
            if (inputString.equals("2")) {
                System.out.println("Please enter your account ID.");
                inputString = input.nextLine();
                System.out.println("Please enter deposit amount.");
                String inputString2 = input.nextLine();
                System.out.println("Would you like to do checkings or savings?");
                String inputString3 = input.nextLine().toLowerCase();
                
                if (inputString3.equals("checkings")){
                    Account.depositCheckings(Integer.parseInt(inputString),Double.parseDouble(inputString2));
                } else {
                    Account.depositSavings(Integer.parseInt(inputString),Double.parseDouble(inputString2));
                }
                
            }
            if (inputString.equals("3")) {
                System.out.println("Please enter your account ID.");
                inputString = input.nextLine();
                System.out.println("Please enter withdraw amount.");
                String inputString2 = input.nextLine();
                System.out.println("Would you like to do checkings or savings?");
                String inputString3 = input.nextLine().toLowerCase();
    
                if (inputString3.equals("checkings")){
                    Account.withdrawCheckings(Integer.parseInt(inputString),Double.parseDouble(inputString2));
                } else {
                    Account.withdrawSavings(Integer.parseInt(inputString),Double.parseDouble(inputString2));
                }
            }
            if (inputString.equals("4")) {
                System.out.println("Please enter your account ID.");
                inputString = input.nextLine();
                Account.viewAccount(Integer.parseInt(inputString));
            }
            if (inputString.equals("5")) {
                System.out.println("Please enter your account ID.");
                inputString = input.nextLine();
                Account.viewAccount(Integer.parseInt(inputString));
            }
        }
    }
}

