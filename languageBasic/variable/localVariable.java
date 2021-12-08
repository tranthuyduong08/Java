/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languageBasic.variable;

/**
 *
 * @author Admin
 */
public class localVariable {
    public void localVer() {
        int n = 10;            // This is local variable
        System.out.println("This is number: " + n);
    }
     
    public static void main(String[] args) {
        localVariable a = new localVariable();
        a.localVer();
    }
}
