package com.company;
import java.util.Scanner;

public class PracticeOnArrays {
    //Problem 1:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i = 1; i < 5; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum = " + max);

        //Problem 2:
        int[] arr1 = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Reversed Array:");

        for(int i = 4; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }

        //Problem 3:
        int[] arr2 = new int[5];
        int even = 0, odd = 0;

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++) {
            if(arr2[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}


