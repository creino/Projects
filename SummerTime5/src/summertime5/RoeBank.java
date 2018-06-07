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
public class RoeBank {
    
    public static void main(String[] args){
        //first get a bank - really a bankU
        //insert 3 account
        /*
        *luis - 43
        *craig - 5
        *viren - 73
        *cesar - 25
        *joe - 74
        */
        
        BankUg aBank = new BankUg();//now we have a bank
        Account acct = new Account("luis",43);
        aBank.insert(acct);
        acct.deposit(10000);
        
        aBank.showAll();
        
    }
    
}
