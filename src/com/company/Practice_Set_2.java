package com.company;

public class Practice_Set_2 {
    public static void main(String[] args) {

    //Problem 1
    String name = "Madhura Hawelikar";
    name = name.toLowerCase();
    System.out.println(name);

    //Problem 2
    String fname = " M a d h u r a ";
    fname = fname.replace(" ", "_");
    System.out.println(fname);

    //Problem 3
    String letter = "Dear <|name|>, Thanks a lot";
    letter = letter.replace("<|name|>", "Shreya");
    System.out.println(letter);

    //Problem 4
    String input = "Mad  hur a H awe   li k  ar";
    System.out.println(input.indexOf("  "));
    System.out.println(input.indexOf("   ")); //-1 in the output means no spaces

     //Problem 5
     String string1 = "Dear Madhura,\n\t This Java course is nice.\n\t Thanks!";
     System.out.println(string1);


}
    }
