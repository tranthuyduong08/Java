/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languageBasic.variable.instanceVariable;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 
    public static void main (String [] args) {
        Person person = new Person();	
	person.setName("Duong");
        person.setAge(21);
System.out.println(person.getName() + " is a " + person.getAge());



}

}
