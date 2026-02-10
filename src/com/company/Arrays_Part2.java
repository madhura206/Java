package com.company;

public class Arrays_Part2 {
    public static void main(String[] args) {

        float [] marks1 = {34.5f, 67.9f, 65.2f, 87.4f};
        String [] students = {"Madhura", "Sukhada", "Aarya", "Monalika"};
        System.out.println(marks1.length);
        System.out.println(students[3]);

        int [] marks = {89, 76, 35, 97, 90};
//        System.out.println(marks.length);
//
//        Displaying Array using for loop
        System.out.println("Printing using for loop");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
//        Reverse Order
        for(int i = marks.length - 1; i >= 0; i--){
            System.out.println(marks[i]);
        }

//        Printing using for each loop
        for(int element: marks){
            System.out.println(element);
        }
    }
}
