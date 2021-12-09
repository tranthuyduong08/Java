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
public class Animal {
    // tính đóng gói
    // các biến private được khai báo , những biến này chỉ có thể được truy cập bởi public method of class

    private String color;
        private int age;
        private int weight;

        public Animal(String color, int age, int weight) {
                this.color = color;
                this.age = age;
                this.weight = weight;
        }

        public String getColor() {
                return color;
        }

        public int getAge() {
                return age;
        }

        public int getWeight() {
            return weight;
        }
        public void makeSound(){
            System.out.println("Don’t know animal sound");
        }
}
