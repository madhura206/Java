package com.company;

import java.util.Scanner;

public class Practice7_Arrays {
    public static void main(String[] args) {
        // Problem 1:
        Scanner sc = new Scanner(System.in);
        float [] marks;
        marks = new float[5];

        for(int i = 0; i <5; i++){
            System.out.print("Enter value " + i + ":");
            marks[i] = sc.nextFloat();
        }

        float sum = 0;
        for(int i = 0; i < marks.length; i++){
            sum = sum + marks[i];
        }
        System.out.println(sum);

        //Problem 2: Taken same array as above
//        float [] marks;
//        marks = new float[5];
//
//        for(int i = 0; i <5; i++){
//            System.out.print("Enter value " + i + ":");
//            marks[i] = sc.nextFloat();
//        }
//
//        System.out.print("Enter the element: ");
//        float num = sc.nextFloat();
//        boolean isInArray = false; // The number is not in array by default.
//
//        for(float element:marks){
//            if(num == element){
//                isInArray = true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("It is present");
//        }
//        else{
//            System.out.println("It is not present");
//        }

        //Problem 3:
        float [] marks1;
        marks1 = new float[5];

        for(int i = 0; i <5; i++){
            System.out.print("Enter value " + i + ":");
            marks1[i] = sc.nextFloat();
        }

        float sum1 = 0;
        for(int i = 0; i < marks1.length; i++){
            sum = sum + marks1[i];
        }
        float average = sum / 5;
        System.out.println("Average in physics is: " + average);

        }
    }

