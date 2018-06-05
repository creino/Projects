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

        //Account acct1, acct2, acct3, acct4, acct5;
        final int MAX_SIZE = 32;
        Account [] chase;
        chase = new Account[MAX_SIZE];
        int next = 0;//index of next open slot
                     //also number of elements
        int summ = 0;
        //double avg = 0;
        
        chase = new Account[MAX_SIZE];
        
        chase[next++] = new Account("Tina", 422);
        chase[next++] = new Account("Joe", 45);
        chase[next++] = new Account("Ellen", 93);
        chase[next++] = new Account("Chris", 922);
        chase[next++] = new Account("Gaga", 311);
        chase[next++] = new Account("annie", 87);
        chase[next++] = new Account("joan ", 284);
        chase[next++] = new Account("lisa", 392);
        chase[next++] = new Account("liz ", 390);
        chase[next++] = new Account("theo", 214);
        chase[next++] = new Account("kojak", 22);
        chase[next++] = new Account("leo", 665);
        chase[next++] = new Account("nick", 346);
        chase[next++] = new Account("ben", 218);
        chase[next++] = new Account("jen", 88);
        chase[next++] = new Account("sabrina", 446);
        
        //ok lets remove annie
        int indx = 0; //will  be annies
        String target = "annie"; //who are we looking for
        
        
        //find annie
        while (chase[indx].getOwner().compareTo(target) != 0)
            indx++; 
        //have annies index
        System.out.println( chase[indx] + "1111"); //heres annie
        System.out.println(indx);
            //get her index
            
            
        //annie was
        chase[indx] = chase[next - 1];
        chase[next - 1] = null;
        next--;  
        
        //change the reference for the last account
        //to null
      
      
      System.out.println("We have " + next + " accounts");
         for (int i=0; i < next; i++) { //locate min
            summ += chase[i].getBalance();//tally total balance
                        
        }
        //Add 22 dollars to Gaga
        chase[5].deposit(22);
        //withdraw 40 from Joans
        chase[5].withdraw(22);
        //withdraw 28 from lisa
        chase[8].withdraw(22);
        
            
        for (int i = 0; i < next; i++) 
        {
           
            System.out.println(chase[i]);
            
        }
        double avg = summ / next;
        System.out.println("The total of all despoists: $" + summ);
        System.out.println("The total number of accounts:" + next);
        System.out.println("The average deposits of the accounts:" + avg);

       
    }

}
