package com.company;

public class MethodsInJava1 {

        // Example 1 — Sum
        static int sum(int a, int b) {
            return a + b;
        }

        // Example 2 — Maximum
        static int max(int a, int b) {
            if (a > b)
                return a;
            else
                return b;
        }

        // Example 3 — Square
        static int square(int n) {
            return n * n;
        }

        public static void main(String[] args) {

            int x = 5, y = 3;

            System.out.println("Sum = " + sum(x, y));
            System.out.println("Max = " + max(x, y));
            System.out.println("Square of x = " + square(x));
        }
    }


