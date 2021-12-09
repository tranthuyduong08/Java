/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

// class Cat kế thừa từ class cha là Animals
public class Cat extends Animal {

    //cat kế thừa những thuộc tính từ animal
    public Cat(String color, int age, int weight) {
        super(color, age, weight);
    }
    // tính đa hình, cùng là make sound nhưng khác chức năng
    
@Override
    public void makeSound(){
        System.out.println("meow");
    }

}