package com.company;

// one public class in one java file.
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My ID is: " + id);
        System.out.println("My name is: " + name);
    }

    public int getSalary(){
        return salary;
    }
}
public class CWH_38_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); //Instantiating a new Employee Object
        Employee john = new Employee(); //Instantiating a new Employee Object

        //Setting attributes for harry
        harry.id = 12;
        harry.name = "Code With Harry";
        harry.salary = 45000;

        //Setting attributes for harry

        john.id = 13;
        john.name = "John Khandelwal";
        john.salary = 23000;
//        System.out.println(harry.id);
//        System.out.println(harry.name);

        harry.printDetails();
        john.printDetails();
        int salary = harry.getSalary();
        int salary1 = john.getSalary();
        System.out.println(salary);
        System.out.println(salary1);

    }
}
