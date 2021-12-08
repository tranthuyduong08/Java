/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classAndObject;

/**
 */
public class Test {
        public static void main(String[] args){
        Employee employee = new Employee();
        employee.setEmployeeId("1");
        employee.setTitle("teacher");
        employee.setName("Duong");
        employee.setGender("female");

        System.out.println(employee.getName() + " is a " + employee.getTitle() + ", her id is " + employee.getEmployeeId());
        System.out.println("Gender is " + employee.getGender());
    }
}
