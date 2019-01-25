package com.company;

public class Student extends Person {
    private double GPA;
    private int gradeLevel;
    private String gender;
    private int numberClasses;
    private String firstName;
    private String familyName;
    public Student(double GPA, int gradeLevel, int numberClasses, String firstName, String familyName) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.gradeLevel = gradeLevel;
        this.gender = gender;
        this.numberClasses = numberClasses;
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public double getGPA() {
        return GPA;
    }

    public String toString() {
        String famName = this.getFamilyName();
        String firName = this.getFirstName();
        return (firName + " " + famName);
    }
}