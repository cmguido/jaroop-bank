import java.util.*; 
import java.io.*; 
import java.util.Scanner;

public class Bank 

{
 

public static void main(String[]args) {

// using while loop to run all the code once again until
//  transaction is equal "exit" where it will break
while(true) {

        System.out.print("Please enter in a command (deposit, withdraw, balance, exit): ");

    
        String transaction = "";
        String deposit;
        
        String withdraw;
        

        Scanner scan = new Scanner(System.in);
       

        transaction = scan.nextLine();
        

            // DEPOSIT
            // using if statement to check to make sure that transaction is equal to deposit
            // used toLowerCase() for transaction so matter what 
                if (transaction.toLowerCase().equals("deposit")) {
                System.out.println("Please enter an amount to deposit:");
                deposit = scan.next();
                double dep = Double.parseDouble(deposit);
                

                if (dep > 0) 

                {
                    System.out.println( deposit + " deposited");
                } 

                else if (dep < 0)

                {
                    System.out.print("Enter a valid number");
                    
                }
                }

            // WITHDRAW
                if (transaction.toLowerCase().equals("withdraw")) {
                System.out.println("Please enter an amount to withdraw:");
                withdraw = scan.next();
                double wit = Double.parseDouble(withdraw);


                if (wit > 0) 

                {
                    System.out.println( withdraw + " withdrawn");
                } 

                else if (wit < 0)

                {
                    System.out.print("Enter a valid number");
                    
                }
                }
            // BALANCE
                if (transaction.toLowerCase().equals("balance")) {
                System.out.println("Balance is: ");

            }

        // EXIT
            if (transaction.toLowerCase().equals("exit")) {
                System.exit(0);
                break;
                }

           


        
    }
  }
}