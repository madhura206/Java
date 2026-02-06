package com.company;
import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){  // 0 to 10
            System.out.println(2 * i + 1);
         }

        for(int i = 5; i>=0; i--){
            System.out.println(i);
        }

        System.out.println("Enter the limit: ");
        int num1 = sc.nextInt();

        for(int i=num1; i>=0; i--){  // 0 to 10
            System.out.println(i);
         }
    }
}
