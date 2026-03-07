package com.company;
import java.util.Scanner;

public class Recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = n * factorial(n - 1);
            return result;
        }
    }

    static int factorial_Iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1; // OR product = n; Then, i < n.
            for(int i = 1; i <= n; i++){
                product = product * i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        System.out.println("Therefore, the factorial of n is: " + factorial(num));
        System.out.println("Therefore, the factorial of n is: " + factorial_Iterative(num));

    }
}