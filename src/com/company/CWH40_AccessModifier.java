package com.company;

class Student{
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    public int getID(){
        return id;
    }

    public void setID(int i){
        id = i;
    }

}
public class CWH40_AccessModifier {
    public static void main(String[] args) {
        Student harry = new Student();
        harry.setID(34);
        harry.setName("Code With Harry");
        System.out.println(harry.getID());
        System.out.println(harry.getName());

    }
}
