/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author creino
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
        Account [] myBank; //an array with Reference variable - myBank
        
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
     //   myBank[next++] = new Account("nick", 346);
     //   myBank[next++] = new Account("ben", 218);
     //   myBank[next++] = new Account("jen", 88);
     //   myBank[next++] = new Account("sabrina", 446);
        
       System.out.println("First run, we have " + next + " accounts");//Require #2
       
       //Calculate the total of the 12 accounts & print
         for (int i=0; i < next; i++) { //locate min
            sum += myBank[i].getBalance();//tally total balance
                        
        }
         System.out.println("The total of all despoists: $" + sum);//print to console
      
      
      
        //Add 22 dollars to Gaga
        myBank[5].deposit(22);
        //withdraw 40 from Joans
        myBank[5].withdraw(22);
        //withdraw 28 from lisa
        myBank[8].withdraw(22);
        
            
        for (int i = 0; i < next; i++) 
        {
           
            System.out.println(myBank[i]);
            
        }
        avg = sum / next;
        
        System.out.println("The total number of accounts:" + next);
        System.out.println("The average deposits of the accounts:" + avg);
        
        
         //ok lets remove annie
        int indx = 0; //will  be annies
        String target = "annie"; //who are we looking for
        
        
        //find annie
        while (myBank[indx].getOwner().compareTo(target) != 0)
            indx++; 
        //have annies index
        System.out.println( myBank[indx] + "1111"); //heres annie
        System.out.println(indx);
            //get her index
            
            
        //annie was
        myBank[indx] = myBank[next - 1];
        myBank[next - 1] = null;
        next--;  
        
        //change the reference for the last account
        //to null

       
    }

}
