package com.jetbrains;

public class Person extends APerson {
    public String printInfo()
    {
        return "Человек " + getSurname() + " " + getName() + ", возраст: " + getAge();
    }
}
