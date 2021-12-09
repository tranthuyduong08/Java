/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Admin
 */
public class Dog extends Animal{

    public Dog(String color, int age, int weight) {
        super(color, age, weight);
    }
@Override
    public void makeSound(){
        System.out.println("woof");
    }

    public void fetch(){
        System.out.println("fetch is fun!");
    }

}
