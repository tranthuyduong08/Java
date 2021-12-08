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
public class IntegerWrapper {
    public static void main(String[] args) {
        
        //create primitive type int 
        int a = 21;  
        //wrap int     
        Integer b = new Integer(a);
         
        int c = b.intValue();
        float d = b.floatValue();
                  
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
             }

}
