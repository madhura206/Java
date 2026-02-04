package com.company;
import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Subject1 marks: ");
        int subject1 = sc.nextInt();
        System.out.print("Subject2 marks: ");
        int subject2 = sc.nextInt();
        System.out.print("Subject3 marks: ");
        int subject3 = sc.nextInt();
        System.out.print("Subject4 marks: ");
        int subject4 = sc.nextInt();
        System.out.print("Subject5 marks: ");
        int subject5 = sc.nextInt();

        double sum = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (sum/500) * 100;
        System.out.println(("Percentage: " + percentage));

    }


}
