/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myBank;

/**
 *
 * @author creino
 */
/**
* Account - simulates basic operation of a BankAccount
* - demo for COM210
*
* @version 0.1 - initial
* @author divenuto
*/
public class Account
{
// instance fields
private String owner;
private int balance;
// constructor
public Account ( String owner, int balance ) {
this.owner = owner;
this.balance = balance;
}
// deposit() - makes a deposit into the Account
public void deposit( int amt ){
balance += amt;
}
// withdraw() - withdraws money from the Account
public void withdraw( int amt ) {
balance -= amt;
}
// getOwner() - returns the Account's owner's name
public String getOwner() {
return owner;
}
// getBalance() - returns the Account's current balance
public int getBalance(){
return balance;
}
// clone() - returns a deepcopy of the object
public Account clone() {
Account cpy = new Account( this.owner, this.balance) ;
return cpy;
}
// toString() - returns object's state information
public String toString() {
String msg = "Account Owner: " + owner +
" \tBalance: " + balance;
return msg;
}
}
