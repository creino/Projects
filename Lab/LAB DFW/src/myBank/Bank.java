/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myBank;

/**
 *
 * @author creino creino@student.sjcny.edu 06/05/2018
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // System.out.println("This is our second class");
        //Account acct1, acct2, acct3, acct4, acct5; depricated Account creation
        final int MAX_SIZE = 32;//declaration of variable for managing array size [32]
        Account[] myBank; //an array with Reference variable - myBank

        myBank = new Account[MAX_SIZE];

        int next = 0;//index of next open slot
        //also number of elements
        int sum = 0; //sum for account totals

        double avg = 0; //variable to output average - should be ###.## format

        myBank = new Account[MAX_SIZE];

        myBank[next++] = new Account("Tina", 422);
        myBank[next++] = new Account("Joe", 45);
        myBank[next++] = new Account("Ellen", 93);
        myBank[next++] = new Account("Chris", 922);
        myBank[next++] = new Account("Gaga", 311);
        myBank[next++] = new Account("annie", 87);
        myBank[next++] = new Account("joan ", 284);
        myBank[next++] = new Account("lisa", 392);
        myBank[next++] = new Account("liz ", 390);
        myBank[next++] = new Account("theo", 214);
        myBank[next++] = new Account("kojak", 22);
        myBank[next++] = new Account("leo", 665);//Populate the first 12 accounts

        //   
        System.out.println("First run, we have " + next + " accounts \n");//Require #2

        //Calculate the total of the 12 accounts & print
        for (int i = 0; i < next; i++) { //locate min
            sum += myBank[i].getBalance();//tally total balance

        }

        for (int i = 0; i < next; i++) {

            System.out.println(myBank[i]);

        }
        System.out.println("\nThe total number of accounts:" + next); //print number of accounts in array
        System.out.println("\nThe total of all despoists: $" + sum);//print to console

        //Add 22 dollars to Gaga
        //find Gaga
        int indxGaga = 0; //will  be Gaga's account
        String targetGaga = "Gaga"; //who are we looking for

        while (myBank[indxGaga].getOwner().compareTo(targetGaga) != 0) {
            indxGaga++;
        }

        myBank[indxGaga].deposit(22);

        System.out.println("\nGaga's new total is: $" + myBank[indxGaga].getBalance());//print to console

        //withdraw 40 from Joans
        //find joan
        int indxjoan = 0; //will  be joan's account
        String targetjoan = "joan"; //who are we looking for

        while (myBank[indxjoan].getOwner().compareTo(targetjoan) != 1) {
            indxjoan++;
        }

        myBank[indxjoan].withdraw(40);

        System.out.println("\nJoan's new total is: $" + myBank[indxjoan].getBalance());//print to console

        //withdraw 28 from lisa
        //find lisa
        int indxlisa = 0; //will  be lisa's account
        String targetlisa = "lisa"; //who are we looking for

        while (myBank[indxlisa].getOwner().compareTo(targetlisa) != 0) {
            indxlisa++;
        }

        myBank[indxlisa].withdraw(28);

        System.out.println("\nlisa's new total is: $" + myBank[indxlisa].getBalance());//print to console

        //How many Accounts have balances less than 120 ?
        int low = 0;//counter for accounts
        for (int i = 0; i < next; i++) {

            if (myBank[i].getBalance() < 120) {

                System.out.println("\n" + myBank[i].getOwner() + " has less than $120. Current balance is only $" + myBank[i].getBalance());
                low++;
            }

        }
        //Calculate the number, and print an appropriate message indicating the number.
        System.out.println("\nThere was a total of " + low + " accounts that held less than $120.00");

        //Deduct 37 from all Accounts with balances > 210
        int fees = 0; //count how many got charges under 210 fees. 
        for (int i = 0; i < next; i++) {

            if (myBank[i].getBalance() < 210) {

                myBank[i].withdraw(37);
                fees++;

            }

        }
        System.out.println("\nMonthly fees were charges to " + fees + " accounts that held less than $210.00");

        //Print the state of your Bank - print the information for each Account  
        //Header for state of bank
        System.out.println("\nThe state of the bank is now as follows:\n");
        for (int i = 0; i < next; i++) {

            System.out.println(myBank[i]);
        }

        avg = sum / next;

        System.out.println("\nThe average deposits of the accounts:" + avg);

        //ok lets remove theo
        int indx = 0; //will  be theo
        String target = "theo"; //who are we looking for

        //find theo
        while (myBank[indx].getOwner().compareTo(target) != 0) {
            indx++;
        }
        //have theo's index
        System.out.println("\nThe account with " + myBank[indx] + ", has been removed.\n"); //heres theo

        //Add nick, ben, and jen to the array.
        myBank[next++] = new Account("nick", 346);
        myBank[next++] = new Account("ben", 218);
        myBank[next++] = new Account("jen", 88);

        //Print out new register with the three new accounts
        for (int i = 0; i < next; i++) {

            System.out.println(myBank[i]);

        }

        //Calculate the total of the accounts & print
        //reset sum to zero
        sum = 0;
        for (int i = 0; i < next; i++) { //locate min
            sum += myBank[i].getBalance();//tally total balance

        }
        System.out.println("\nThe new sum of the " + next + " accounts is $" + sum + "\n");
        //Using the sum from problem 11, what is the average Account balance now
        //reset avg from earlier
        avg = 0;
        avg = sum / next;

        System.out.println("\nThe average deposits of the accounts:" + avg + "\n");

        //Replace kojak with the Account for sabrina 
        //ok lets remove kojak
        int indxkojak = 0; //will  be kojak
        String targetkojak = "kojak"; //who are we looking for
        //find kojak
        while (myBank[indxkojak].getOwner().compareTo(targetkojak) != 0) {
            indxkojak++;
        }
        //have kojak's index
        System.out.println("\nWe are removing " + myBank[indxkojak] + " due to negative balance and replacing with sabrina. \n"); //heres kojak
        //get his index

        //kojak was - now we will place sabrina
        myBank[indxkojak] = new Account("sabrina", 446);

        //reprint array for updates.
        //Print the final Account status.
        for (int i = 0; i < next; i++) {

            System.out.println(myBank[i]);

        }

    }

}
