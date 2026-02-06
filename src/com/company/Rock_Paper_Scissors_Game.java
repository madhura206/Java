package com.company;
import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("WELCOME TO ROCK PAPER SCISSORS GAME");
        System.out.println("Choose one:\n1. Rock\n2. Paper\n3.Scissors ");
        System.out.println("Enter your choice:" );
        int choice = sc.nextInt();

        int computerChoice = random.nextInt(1,3) ;
        System.out.println("Enter computer's choice: " + computerChoice);

        if(choice == 1 && computerChoice == 3 || choice == 2 && computerChoice == 1 || choice == 3 && computerChoice == 2){
            System.out.println("You Won!");
        }
        else if(choice == 1 && computerChoice == 2|| choice == 2 && computerChoice == 3 || choice == 3 && computerChoice == 1){
            System.out.println("You Lost!");
        }

    }
}
