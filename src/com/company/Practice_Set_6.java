package com.company;
import java.util.Scanner;

public class Practice_Set_6 {
    public static void main(String[] args) {
        //Problem 1:
        for (int i = 4; i > 0; i--) {
            for(int j = 0; j < i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }

            // Problem 2:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();

        int i = 0;
        int sum = 0;
        while(i < num){
            sum = sum + (2 * i);
            i = i + 1;
        }
        System.out.print("The sum of first n even numbers is: ");
        System.out.println(sum);

            //Problem 3:
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();
        for(i = 1; i <= 10; i++){
            System.out.println(num1 + "x" + i + "=" + (num1 * i));
        }

            //Problem 4:
        System.out.println("Multiplication table in reverse order");
        System.out.print("Enter the number: ");
        int num2 = sc.nextInt();
        for(i = 10; i > 0; i--){
            System.out.println(num2 + "X" + i + "=" + num2 * i);
        }

            //Problem 5:
        System.out.println("Enter number: ");
        int num3 = sc.nextInt();

        int pro = 1;
        i = 1;
        while(i <= num3){
            pro = pro * i;
            i++;
        }
        System.out.println(pro);

            // Problem 6:
            System.out.println("Sum of the multiples of 8");
            int num4 = 8;
            int sum1 = 0;
            for (i = 1; i <= 10; i++) {
                sum1 = sum1 + (num4 * i);

            }
        System.out.println(sum1);



    }
}
