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
                Account.viewAccount(Integer.parseInt(inputString));
            }
            if (inputString.equals("3")) {
                System.out.println("Please enter your account ID.");
                inputString = input.nextLine();
                Account.viewAccount(Integer.parseInt(inputString));
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



    public static void Input_Amount() {
        Scanner input = new Scanner(System.in);
    }
}

