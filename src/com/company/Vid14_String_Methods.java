package com.company;

public class Vid14_String_Methods {
    public static void main(String[] args) {
        String name = "Madhura";
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String nonTrimmedString = "  madhura    "; //delete start and end spaces
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(3));  //index 3 to end
        System.out.println(name.substring(1,4)); //adh, end index is exclusive
        System.out.println(name.replace("a", "iii")); //Miiidhuriii

        System.out.println(name.startsWith("Mad")); //true
        System.out.println(name.endsWith("")); //true

        System.out.println(name.charAt(6));

        String modifiedName = "Madhudhura";
        System.out.println(modifiedName.indexOf("ura")); // 7
        System.out.println(modifiedName.indexOf("du",4)); // index 4 se start hoga. It gives -1 if not found the string. Left to right scan and corresponding output.
        System.out.println(modifiedName.lastIndexOf("hud", 3)); //right to left scan. But output according to left to right.

        System.out.println(name.equals("MAdhura")); // false
        System.out.println(name.equalsIgnoreCase("MAdHurA")); // true

        System.out.println("I am escape sequence \" ");
    }
}
