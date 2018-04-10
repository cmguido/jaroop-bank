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

        boolean run = true;
        String transaction = "";
        int deposit;
        int withdraw;
        // String name;

        Scanner scan = new Scanner(System.in);
       

        transaction = scan.nextLine();
        

            // DEPOSIT
                if (transaction.toLowerCase().equals("deposit")) {
                System.out.println("Please enter an amount to deposit:");
                deposit = scan.nextInt();

                if (deposit > 0) 

                {
                    System.out.println( deposit + " deposited");
                } 

                else if (deposit < 0)

                {
                    System.out.print("Enter a valid number");
                    
                }
                }

            // WITHDRAW
                if (transaction.toLowerCase().equals("withdraw")) {
                System.out.println("Please enter an amount to withdraw:");
                withdraw = scan.nextInt();

                if (withdraw > 0) 

                {
                    System.out.println( withdraw + " withdrawn");
                } 

                else if (withdraw < 0)

                {
                    System.out.print("Enter a valid number");
                    
                }
                }
            // BALANCE
                if (transaction.toLowerCase().equals("balance")) {
                System.out.println("Balance is: ");
                

                // if (withdraw > 0) 

                // {
                //     System.out.println( withdraw + " withdrawn");
                // } 

                // else if (withdraw < 0)

                // {
                //     System.out.print("Enter a valid number");
                //     bank();
                // }
            }

        // EXIT
            if (transaction.toLowerCase().equals("exit")) {
                System.exit(0);
                break;
                }

           


        
    }
  }
}