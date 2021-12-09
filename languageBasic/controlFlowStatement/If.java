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
public class If {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade= scanner.nextInt ();
        
        scanner.close();
        
        if(grade >= 5 ){
            System.out.println("Congrats! You pass this exam");
        }
    }
}
