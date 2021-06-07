import java.lang.Math;

public class Account {
    String name;
    float checking, saving;
    
    public static void Create_Account(String name,float checking, float saving) {
        int ids = (int) Math.random();
        System.out.println("Your Account id is " + ids);
    }
    
    public void display_account() {
        System.out.println("Hello " + name + "Here's your Checking's and Saving's "+ checking + saving);
    }
    
}
