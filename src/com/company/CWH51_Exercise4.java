package com.company;
import java.util.Scanner;

class Library{
    Scanner sc = new Scanner(System.in);

    String issueDate;
    String bookName;


    public void addBook(){
        System.out.print("Enter the book you want to add: ");
        String book = sc.nextLine();
        this.bookName = book;
    }
    public void issueBook(){
        System.out.print("How many books you want to issue: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for(int i = 0; i < n ; i++){
            System.out.print("Enter book " + (i + 1) + ":") ;
            arr[i] = sc.nextLine();
        }
        System.out.println("Thankyou for issuing the books!!");

    }

    public void setIssueDate() {
        System.out.print("Enter issuing date(DD-MM-YY): ");
        String date = sc.nextLine();
        this.issueDate = date;

    }

}
public class CWH51_Exercise4 {
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.addBook();
        l1.issueBook();

        l1.setIssueDate();
        System.out.println("Thankyou!");

    }
}
