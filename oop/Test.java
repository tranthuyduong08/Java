/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
import oop.*;
/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
   
        //set giá trị cho variables      
        Animal annie = new Animal("White", 2, 5);

        //Displaying values of the variables
        System.out.println("Color: "+annie.getColor()); 
        System.out.println("Age: "+annie.getAge()); 
        System.out.println("Weight: "+annie.getWeight());
        
        Dog rocky = new Dog("yellow",1,4);
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog("black",3,10);
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat("Grey", 1, 1);
        sasha.makeSound();
        feed(sasha);
    }

    public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("here's your dog food");
        }

        else if(animal instanceof Cat){
            System.out.println("here's your cat food");
        }
    }

}
