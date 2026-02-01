package com.company;
import java.util.Scanner;
public class Else_If {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

//        If else-if else ladder
        if(age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");

        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");

        }
        else{
            System.out.println("You are not experienced!");
        }
        char var = 'r';
        switch (var) {
            case 'c':
                System.out.println("You are going to become an Adult!");
                break;

            case 'r':
                System.out.println("You are going to join a job!");
                break;
            case 'v':
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your Life");
        }
        System.out.println("Thank You!");

        // ENHANCED SWITCH
        int num1 = 20;
        switch (num1) {
            case 20 -> {
                System.out.println("You are going to become an Adult!");
            }
            default -> {
                System.out.println("Thank You for learning!");
            }

        }
    }
}
