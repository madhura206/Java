package com.company;

public class Arrays {
    public static void main(String[] args) {
        /* class of 500 students
         You have two options:
             1. Create 500 variables
             2. Use Arrays

         */

        // There are three main ways to create arrays in java
        // 1. Declaration adn memory-allocation
        int [] marks; //This is declaration  you can also write as - int [] marks = new int[5];
        marks = new int[5];  // This is memory allocation. Contiguous memory blocks, fast access
        //Initialization
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        marks[4] = 96;
        // marks[5] = 56; Throws an error

        // Declaration, memory allocation and initialization together
        int marks1[] = {98, 76, 45, 23, 45};
        System.out.println(marks1[4]);  // Output: 96

    }
}
