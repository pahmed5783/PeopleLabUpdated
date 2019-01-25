package com.company;

public abstract class Person
{
    private String firstName, familyName;
    public Person(String firstName, String familyName)
    {
        this.firstName = firstName;
        this.familyName = familyName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getFamilyName() {
        return this.familyName;
    }
    public boolean equals(Person p)
    {
        if(this.firstName.equals(p.getFirstName()) && this.familyName.equals(p.getFamilyName()))
        {
            return true;
        }else {
            return false;
        }
    }

}