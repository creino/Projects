/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_practice;

/**
 * Name Amount joe 324 nancy 28 anni 63 mike 223 ellen 91 adam 552
 *
 * @author creino
 */
public class Accounts_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create an integer array - referenced by the variable accts - which will reference a maximum of 32 
        String accts[] = new String[32];
        int deposits[] = new int[32];

        accts[0] = "joe";//direct enter account name values
        deposits[0] = 324;//direct enter deposit array values
        accts[1] = "nancy";//direct enter account name values
        deposits[1] = 28;//direct enter deposit array values
        accts[2] = "anni";//direct enter account name values
        deposits[2] = 63;//direct enter deposit array values
        accts[3] = "mike";//direct enter account name values
        deposits[3] = 223;//direct enter deposit array values
        accts[4] = "ellen";//direct enter account name values
        deposits[4] = 91;//direct enter deposit array values
        accts[5] = "adam";//direct enter account name values
        deposits[5] = 552;//direct enter deposit array values

        //create loop to print out arrays of 6 entered values
        for (int i = 0; i < accts.length; i++) {
            
            System.out.println("Name : Amount");
            System.out.println(accts[i] + " $" + deposits[i]);

        }

        //Account data types
    }

}
