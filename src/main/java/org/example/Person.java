package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String country;
    private String job;
    private double salary;

    public Person(String firstName, String lastName, String country, String job, double salary, int age){
        this(firstName,lastName,age);
        this.country = country;
        this.job = job;
        this.salary = salary;
    }

    public Person (String firstName,String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(){
        this("Bilinmeyen","Bilinmeyen","Bilinmeyen","Bilinmeyen",0,0);
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        if(this.age >= 13 && this.age <= 19){
            return true;
        } else {
            return false;
        }
    }
}
