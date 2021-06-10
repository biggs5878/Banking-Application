import java.lang.Math;

public class Account {
    public static void createAccount(String name) {
        FileReader fileReader = new FileReader();
        System.out.println("Your Account id is " + fileReader.newaccount(name));
    }
    
    public static void viewAccount(int id) {
        FileReader fReader = new FileReader();
        System.out.println("\nName: " + fReader.getName(id));
        System.out.println("Checking account balance: $" + fReader.getChecking(id));
        System.out.println("Savings account balance: $" + fReader.getSavings(id));
        System.out.println("\n\n");
    }
    
    public static void depositCheckings(int id, double amount) {
        FileReader fReader = new FileReader();
        fReader.changeBalance(id, amount, true);
        System.out.println("$" + amount + " was added to your checking account.");
        System.out.println("Checking account balance: $" + fReader.getChecking(id));
    }
    
    public static void depositSavings(int id, double amount) {
        FileReader fReader = new FileReader();
        fReader.changeBalance(id, amount, false);
        System.out.println("$" + amount + " was added to your savings account.");
        System.out.println("Savings account balance: $" + fReader.getSavings(id));
    }
    
    public static void withdrawCheckings(int id, double amount) {
        FileReader fReader = new FileReader();
        if (amount < Double.parseDouble(fReader.getChecking(id))) {
            fReader.changeBalance(id, amount * -1, true);
            System.out.println("$" + amount + " was taken out of your checking account.");
            System.out.println("Checking account balance: $" + fReader.getChecking(id));
        } else {
            System.out.println("Your account doesn't have enough funds to Withdraw $" + amount);
            System.out.println("Checking account balance: $" + fReader.getChecking(id));
        }
    }
    public static void withdrawSavings(int id, double amount) {
        FileReader fReader = new FileReader();
        if (amount < Double.parseDouble(fReader.getSavings(id))) {
            fReader.changeBalance(id, amount * -1, false);
            System.out.println("$" + amount + " was taken out of your savings account.");
            System.out.println("Saving account balance: $" + fReader.getSavings(id));
        } else {
            System.out.println("Your account doesn't have enough funds to Withdraw $" + amount);
            System.out.println("Savings account balance: $" + fReader.getSavings(id));
        }
    }
    public static void deleteaccount(int id){
        FileReader fileReader = new FileReader();
        System.out.println(" The account named " + fileReader.getName(id)+ " has been deleted");
        fileReader.removeaccount(id);
    }
}
