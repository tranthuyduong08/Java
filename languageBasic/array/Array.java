/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languageBasic.array;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Array {
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();

        System.out.println("Average: " + String.format("%.2f", calculateAverage()));

    }

    public static void getGrades(){
        for(int i=0; i<grades.length; i++){
            System.out.println("Enter grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum(){
        int sum = 0;
        for(int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

}
