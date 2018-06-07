/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summertime5;

/**
 *
 * @author creino
 */
public class SummerTime5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] nums = {43,52,55, 12, 143};
        System.out.println(nums[0]);
        accts = new Account[32]; //Capacity 32 accounts

        //accts = new Account[8];

        //Account[] accts; //array to hold accounts
        // create single account
        accts[0] = new Account("joe", 150);
        accts[1] = new Account("nancy", 28);
        accts[2] = new Account("anni", 63);
        // Account acct4 = new Account("mike",223);
        // Account acct5 = new Account("ellen",91);
        // Account acct6 = new Account("adam",552);

        //joe found 75$
        // ******** Object . Method **********
        //acct1.deposit(75);
        for (int i = 0; i < 34; i++) {
            accts[i].deposit(32);
        }
        //System.out.println(i);

        //System.out.println(acct1);
        //System.out.println(acct2);
        //System.out.println(acct3);
        //System.out.println(acct4);
        //System.out.println(acct5);
        //System.out.println(acct6);
    }

}
