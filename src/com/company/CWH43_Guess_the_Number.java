package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {
    int id;
    int input;
    int count;

    public Game(){
        Random rand = new Random();
        id = rand.nextInt(100) + 1;

    }

    public int getId() {
        return id;
    }

    public void UserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        input = sc.nextInt();
    }

    public int getCount() {
        return count;
    }

    public void isCorrectNumber() {
        count = 0;
        while(id != input){
            UserInput();
            count++;

            if(id > input){
                System.out.println("Enter a bigger number");

            }
            else if(id < input){
                System.out.println("Enter a smaller number");
            }
            else{
                System.out.println("Congratulations! You won!!");
            }
        }
        System.out.println("You guessed in: " + count + " attempts");
    }

}
public class CWH43_Guess_the_Number {
    /*
    create a class Game, which allows a user to play 'Guess the number'
    1. constructor to generate the random number
    2. takeUserInput() to take a user input form user
    3. IsCorrectNumber() to detect whether the number entered by the user is true4. getter and setter for no. of Guesses.
     */

    public static void main(String[] args) {
        Game myGame = new Game();
        System.out.println(myGame.getId());
//        myGame.UserInput();
        myGame.isCorrectNumber();



    }
}
