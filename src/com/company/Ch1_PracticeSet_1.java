package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ch1_PracticeSet_1 {
    public static void main(String[] args) {
//        int a = 4;
//        int b = 8;
//        int c =9;
//        int sum = a + b + c;
//        System.out.println(sum);

//        Question 2
//        int subject1 = 45;
//        int subject2 = 95;
//        int subject3 = 48;
//        float sum = subject1 + subject2 + subject3;
//        float cgpa = sum/30;
//        System.out.println(cgpa);

//        Question 3
//        System.out.print("What is your name: ");
        Scanner sc = new Scanner(System.in);
//
//        String name = sc.next();
//        System.out.println("Hello! " + name + " Have a good day");

//        Question 4
//        System.out.println("Enter the number");
//        System.out.println(sc.hasNextInt());

//        Question 5
        System.out.print("Enter the distance in kilometers: ");
        float kilometers = sc.nextFloat();
        float miles = kilometers * 621371;
        System.out.print("The distance in miles is: "+ miles);



    }
}
