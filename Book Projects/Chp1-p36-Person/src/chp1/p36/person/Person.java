/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chp1.p36.person;

/**
 *
 * @author crein
 */

public class Person {
    //definition of the data class
    private int age;
    private double weight;
    
 public static void main(String[] args) {
     
 }
    /**
     * @param args the command line arguments
     */
    //definition of member functions
    public Person(int a, double w)//the constructor
    {
        // TODO code application logic here
        age = a;
        weight = w;
        
        
        Person tom = new Person(25, 187.6);
        Person mary = new Person(21, 127.3);
        
        System.out.println(mary.toString());
        
    } //end of constructor
    
    public String toString()//returns anotated value of data members
    { 
        return( "this person's age is: " + age + "\nand their weight is: " + weight);
        
        
    }//end of toString method
    
}//end of person class
