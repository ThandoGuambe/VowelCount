/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice.task6;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class ICETASK6 {

    public static int countVowels(String sentence) {
        int count = 0;
        String vowels = "aeiou";
        // Iterate through each character in the string & checking if it is a vowel 

        for (int i = 0; i < sentence.length(); i++) { 
            char currentchar = sentence.charAt(i);  
            if (vowels.indexOf(currentchar) != -1) { 
                count++;  
            }
  
        } return count;  
    }
   
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String sentence;
        
        //Prompt user to input 
        System.out.println("Write a sentence");
        sentence = input.next();
        
        //Calling the countVowels method
        System.out.println("Number of vowels: " + countVowels(sentence));
    }
}
