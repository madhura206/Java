package com.company;
import java.util.Scanner;

public class Practice_Set_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        //Problem 1:
//        System.out.print("Enter your marks in physics: ");
//        byte m1 = sc.nextByte();
//        System.out.print("Enter your marks in maths: ");
//        byte m2 = sc.nextByte();
//        System.out.print("Enter your marks in chemistry: ");
//        byte m3 = sc.nextByte();
//
//        float avg = (m1 + m2 + m3)/3.0f;
//        if(avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33){
//            System.out.println("Congratulations! You have passed the exam.\nYour percentage: " + avg);
//        }
//        else{
//            System.out.println("You have failed the exam. Better luck next time\nYour percentage: " + avg);
//        }

        //Problem 2:
//        float tax = 0;
//        System.out.println("Enter your income in  LPA: ");
//        float income = sc.nextFloat();
//
//        if(income <= 2.5){
//            tax = tax + 0;
//        }
//
//        else if(income > 2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//
//        }
//        else if(income > 5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income > 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("The total tax paid by the employee is " + tax);

        //Problem 3:
//        System.out.print("Enter the number: ");
//        int num = sc.nextInt();
//        switch(num){
//            case 1 -> System.out.println("It's Monday");
//            case 2 -> System.out.println("It's Tuesday");
//            case 3 -> System.out.println("It's Wednesday");
//            case 4 ->  System.out.println("It's Thursday");
//            case 5 ->  System.out.println("It's Friday");
//            case 6 -> System.out.println("It's Saturday");
//            case 7 -> System.out.println("It's Sunday");
//            default -> System.out.println("Thank You!");
//        }

        //Problem 4:
//        System.out.println("Enter the year: ");
//        int year = sc.nextInt();
//
//        if(year % 4 == 0){
//            System.out.println("It's a leap year!");
//        }
//        else{
//            System.out.println("It's not a leap year.");
//        }

        //Problem 5:
        System.out.print("Enter the website name: ");
        String website = sc.nextLine();

        if(website.endsWith(".com")){
            System.out.println("It's a commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("It's an organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("It's an Indian Website");
        }





    }
}
