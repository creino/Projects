/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summertime5;

/**
 * @author creino Simulates Array Data structure Version 0.1 - basic initial
 * optimized (kinda) - unsorted
 */
public class BankUg {
    //bank will hold a number of accounts

    //state
    Account[] myBank;

    final int MAX_SIZE = 50; //initialize MAX_SIZE
    int next;

    //constructors
    public BankUg() {

        myBank = new Account[MAX_SIZE]; //default new array to 50 slots
        next = 0;

    }

    //methods
    //insert method
    //adds an account to the bank
    public void insert(Account acct) {
        //acct is the reference to the account in main
        myBank[next] = acct.clone();
        next++;

    }

    //create method for show all
    public void showAll() {

        System.out.println("\nHere is the bank:");
        for (int i = 0; i < next; i++);
        {

        }
    }

    public int findIndx(String name) {
        for (int i = 0; i < next; i++;)
        {

        }

    }

}
