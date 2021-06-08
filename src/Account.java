import java.lang.Math;

public class Account {
    public static void createAccount(String name,float checking, float saving) {
        int ids = (int) Math.random();
        System.out.println("Your Account id is " + ids);
    }
    
    public static void viewAccount(int id) {
        FileReader fReader = new FileReader();
        System.out.println("\nName: "+fReader.getName(id));
        System.out.println("Checking account balance: $"+fReader.getChecking(id));
        System.out.println("Savings account balance: $"+fReader.getSavings(id));
        System.out.println("\n\n");
    }
    public static void depositcheckings(int id,int amount) {
        FileReader fReader = new FileReader();
        fReader.changechecking(id,amount);

    }
}
