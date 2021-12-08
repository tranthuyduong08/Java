/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languageBasic.operator;

/**
 *
 * @author Admin
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        int c = 10;
 
        System.out.println("a + b * c   = " + (a + b * c));
        System.out.println("(a + b) * c = " + ((a + b) * c));
        System.out.println("a / b - c   = " + (a / b - c));
        System.out.println("a / (b - c) = " + (a / (b - c)));
    }
}
