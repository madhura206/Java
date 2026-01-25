package com.company;
import java.util.Scanner;

public class Taking_Input_05 {
    public static void main(String[] args) {
        System.out.println("Its Works!");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.print("The sum of these numbers is ");
//        System.out.println(sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        String str = sc.next();
        System.out.println(str);

    }
}
