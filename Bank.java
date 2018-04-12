import java.util.*; 
import java.util.stream.*;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Bank 

{
 

@SuppressWarnings("resource")
public static void main(String[]args) throws IOException {

// using while loop to run all the code once again until
//  transaction is equal "exit" where it will break
while(true) {
        // prompt when the program begins that allows the while loop to check different transactions
        // based on the transaction that the user inputs
        System.out.print("Please enter in a command (deposit, withdraw, balance, exit): ");
        
        String source = "/Users/Christopher/Desktop/jaroop_assessment/log.html";

        Document doc = Jsoup.parse(new File(source), "utf-8");
        Elements tables = doc.select("table");
        Elements trans = doc.select("td");


        // regex that makes sure there are only two decimals (also accepts commas for euros)
        final String regExp = "[0-9]+([,.][0-9]{1,2})?";

        // initial variables
        String transaction = "";
        String deposit;
        String withdraw;
        

        Scanner scan = new Scanner(System.in);
       
        // setting transaction to equal what the user inputs
        transaction = scan.nextLine();
        

        // DEPOSIT ---------------------------------
            // using if statement to check to make sure that transaction is equal to deposit
            // used toLowerCase() for transaction so matter what 
                if (transaction.toLowerCase().equals("deposit")) {
                System.out.println("Please enter an amount to deposit:");
                deposit = scan.next();

                // checking that there are only two decimal places in deposit
                if (deposit.matches(regExp)) {
                    // converting deposit string into a Double and storing it in a new variable 'dep'
                double dep = Double.parseDouble(deposit);
                
                    // inner if statement to check that the value entered is larger than 0
                    if (dep > 0) {
                        // append transactions table a new row containing positive amount
                    	// select tbody using transactions id and append new value to end of table
                    	// save and close file					

                        System.out.println( deposit + " deposited");
                    } 

                    else if (dep < 0) {
                        System.out.print("Enter a valid number (two decimal places max)");
                    }
                }
            }

        // WITHDRAW ------------------------------------------------
                if (transaction.toLowerCase().equals("withdraw")) {
                System.out.println("Please enter an amount to withdraw:");
                withdraw = scan.next();

                 // checking that there are only two decimal places in withdraw
                if (withdraw.matches(regExp)) {
                // converting withdraw string into a Double and storing it in a new variable 'wit'
                double wit = Double.parseDouble(withdraw);

                    // inner if statement to check that the value entered is larger than 0
                    if (wit > 0) {
                    // append transactions table a new row containing negative amount
                    	// select tbody using transactions id and append new value to end of table
                    	// save and close file		
                        System.out.println( withdraw + " withdrawn");
                    } 
                    else if (wit < 0) {
                        System.out.print("Enter a valid number (two decimal places max)");
                    }
                }
            }

        // BALANCE ----------------------------------------
                if (transaction.toLowerCase().equals("balance")) {
                	
                // read transaction table in log.html
                // if statement to check if <thead> value == 'Amount'
                // remove all non numerical characters excluding decimals
                // take values from tbody and convert them into int array
                // loop through or use method to find sum of array and print it for user
                	
                	String bal = trans.toString().replaceAll("[^-,.?0-9]+", " ");
                	
                	
//                	Couldn't figure out how to convert html incoming to ints/array in order to add them together
//                	
                	List<String> sum = Arrays.asList(bal);
                		
                	
                	System.out.println("Balance is: " + sum);
//             
                	


            }

        // EXIT -------------------------------------------
            if (transaction.toLowerCase().equals("exit")) {
                // exits program
            	scan.close();
                System.exit(0);
                // breaks while loop
                break;
                }

        
    }
  }
}
