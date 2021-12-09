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
public class NestedIf {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade= scanner.nextInt ();
        
        scanner.close();

        if(grade >= 5) {
            if(grade <= 10) {
                System.out.println("Congrats! You pass this exam");
            }
            else {
                System.out.println("Your grade is invalid!");
            }
        }
        else {
            System.out.println("You failed the exam");
        }
    }
}
