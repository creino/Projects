/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1;
/*
 *@author crein@student.sjcny.edu
 * Com210 - 06-06-2018
 */
import java.util.Scanner;   // needed to use Scanner class
import java.io.*;           // for File and IOexception 

public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /**
         * create File link to text file - RandomPhrases.txt - infile is the
         * reference variable for this file
         */
        File infile = new File("RandomPhrases.txt");//file with Phrases

        /*
         * - create a Scanner object that will read the source file - myScan is
         * the reference variable for this Scanner object - myScan will read
         * form 'infile' the file with the Avengers names
         */
        Scanner myScan = new Scanner(infile); //Allocate variable for input file

        // Hint !!!
        final int MAX_SIZE = 54;//declaration of variable for managing array size [54]
        // will store phrases here

        String[] myPhrases = new String[MAX_SIZE];//Create & Set Array size
        
        int next = 0; // what role does next have - counting
        int temp = 0; //for counting
        int charCount = 0; //for printing count
        
        // as long as there are names to read 
        while (myScan.hasNext()) {//While there are phrases to read.
            myPhrases[next++] = myScan.nextLine();//Gather phrases into array
                                 }
            System.out.println("First count; we have " + next + " phrases \n");//Count names
            
        // you print the array here ... what prints ??
            System.out.println("Forward Output:\n");//Tell user what is going on
            for (int i = 0; i < next; i++) { //count forward

                System.out.println(myPhrases[i].toUpperCase());//Output forward & upper case
                

                                           }

        // how would you print the contents of your array in reverse ?????
            System.out.println("\nReverse Output:\n");//Tell user what is going on
                
        for (int i = next - 1; i >= 0; i--) {//count backwards
            
            System.out.println(myPhrases[i].toLowerCase());//Output reverse & lower case
            
                                            }
//        for( int i = 0; i < next; i++ )
//                                            {
//            temp = myPhrases[i].charAt( i );
//
//            
//             charCount++;
//                                            }
//        System.out.println(temp);
    }
}
