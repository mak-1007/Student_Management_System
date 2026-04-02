package com.example.Student_Management_system;

public class Student {

    private int rollNo;
    private String name;
    private int age;
    private double contact;
//    constructor
    public Student(int rollNo, String name, int age, double contact){
        this.age=age;
        this.name=name;
        this.rollNo=rollNo;
        this.contact=contact;
    }
//    getter and setter
    public int getRollNo(){
        return rollNo;
    }
    public void setrollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;

    }
    public void setAge(int age){
        this.rollNo =age;
    }
    public double getContact(){
        return   contact;
    }
    public void setContact(double contact){
        this.contact=contact;
    }


}
