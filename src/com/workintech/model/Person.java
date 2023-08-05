package com.workintech.model;
public class Person {
    String firstname;
    String lastname;
    int age;
    double salary;
    boolean isMarried;
    String[] pets;
    public Person(String firstname, String lastname, int age ){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, boolean isMarried, double salary, String[] pets){
        this(firstName, lastName, age);
        this.isMarried = isMarried;
        this.salary = salary;
        this.pets = pets;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }

   public String toString() {
       return  String.format("firstname: %s, lastname:%s, age: %d, salary:%.2f", firstname, lastname, age, salary);
   }
}
