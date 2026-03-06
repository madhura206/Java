package com.company;

import java.util.Scanner;

public class Practice7_Arrays {
    public static void main(String[] args) {
        // Problem 1:
//        Scanner sc = new Scanner(System.in);
//        float [] marks;
//        marks = new float[5];
//
//        for(int i = 0; i <5; i++){
//            System.out.print("Enter value " + i + ":");
//            marks[i] = sc.nextFloat();
//        }
////
//        float sum = 0;
//        for(int i = 0; i < marks.length; i++){
//            sum = sum + marks[i];
//        }
//        System.out.println(sum);

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
//        float [] marks1;
//        marks1 = new float[5];
//
//        for(int i = 0; i <5; i++){
//            System.out.print("Enter value " + i + ":");
//            marks1[i] = sc.nextFloat();
//        }
//
//        float sum1 = 0;
//        for(int i = 0; i < marks1.length; i++){
//            sum = sum + marks1[i];
//        }
//        float average = sum / 5;
//        System.out.println("Average in physics is: " + average);

        //Problem 4:
//        int [][] mat1 = {{1, 2, 3},
//                         {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13},
//                         {3, 7, 1}};
//        int [][] res = {{0, 0, 0},
//                        {0, 0, 0}};
//
//        for(int i = 0; i < mat1.length; i++){  // row number of times
//            for(int j = 0; j < mat2[i].length ; j++){  // column number of times
//                res[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(res[i][j] + " ");
//            }
//            System.out.println();
//
//        }

        // Problem 5:
//        int [] arr;
//        arr = new int [5];
//        for(int i = 0; i < arr.length; i++){
//            System.out.format("Enter element %d: ", i);
//            arr[i] = sc.nextInt();
//        }
//
//        //Reversed Array
//        for(int i = arr.length - 1; i >= 0; i--){
//            System.out.print(arr[i] + " ");
//        }

        // Alternative method [Swapping]
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for(int i = 0; i < n; i++){
//            // Swap arr[i] and arr[l-i-1]
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for(int element:arr){
//            System.out.print(element + " ");
//        }

        //Problem 6:
        // Using array from Problem 1
//int [] arr = {1,2,3,4,5,6};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    System.out.print(arr[j]);
                }
            }
        }









        }
    }

