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
//Account - for intro to course assignment
public class Account {
    //state instance fields
    //variables

    private String owner; //Account owners name
    private int balance; // Account balance

    //constructors
    public Account(String owner, int amount) {
        this.owner = owner;
        balance = amount;

    }

    //methods
    //mutators
    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        balance -= amt;
    }

    //accessors return information
    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
    
    public String toString(){
        return ("Account :: Owner : " + owner + "\t Balance    " + balance);
        
    }

}
