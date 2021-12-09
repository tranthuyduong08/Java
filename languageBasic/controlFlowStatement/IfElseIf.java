/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languageBasic.controlFlowStatement;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class IfElseIf {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade= scanner.nextInt ();

        scanner.close();
        
        if (grade < 5 ) {
        System.out.println("Sorry, you fail this exam ");
        } else if (grade >= 5 && grade < 6) {
            System.out.println("Your mark is D");
        } else if (grade >= 6 && grade < 7) {
            System.out.println(" Your mark is C");
        } else if (grade>= 7 && grade < 8) {
            System.out.println("Your mark is B");
        } else if (grade >= 8 && grade < 9) {
            System.out.println("Your mark is A");
        } else if (grade >= 9 && grade < 10) {
            System.out.println("Your mark is A+");
        } else {
          System.out.println("Invalid grade!");
        }
    }

}
