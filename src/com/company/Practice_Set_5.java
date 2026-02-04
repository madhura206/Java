package com.company;
import java.util.Scanner;

public class Practice_Set_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem 1:
        System.out.print("Enter your marks in physics: ");
        byte m1 = sc.nextByte();
        System.out.print("Enter your marks in maths: ");
        byte m2 = sc.nextByte();
        System.out.print("Enter your marks in chemistry: ");
        byte m3 = sc.nextByte();

        float avg = (m1 + m2 + m3)/3.0f;
        if(avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33){
            System.out.println("Congratulations! You have passed the exam.\nYour percentage: " + avg);
        }
        else{
            System.out.println("You have failed the exam. Better luck next time\nYour percentage: " + avg);
        }

        //Problem 2:
        float tax = 0;
        System.out.println("Enter you income: ");
        float income = sc.nextFloat();

        if(tax > 2.5f && tax < 5f){
            tax = tax + (income - 2.5f);
            System.out.println();
        }





    }
}
