package com.company;
import java.util.Scanner;

public class Vid13_Strings {
    public static void main(String[] args) {
//        String name = new String("madhura");
//        String name = "Madhura";
//        System.out.print("The name is: ");
//        System.out.println(name);
        int a = 6;
        float b = 5.676f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b); //8 matlab 8 spaces ki jagah lega including 5.67.
        System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
//        String name = sc.next(); //next sirf first word print krega
        String name = sc.nextLine();
        System.out.println(name);



    }


}
