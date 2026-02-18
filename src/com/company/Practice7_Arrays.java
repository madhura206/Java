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

    }
}
