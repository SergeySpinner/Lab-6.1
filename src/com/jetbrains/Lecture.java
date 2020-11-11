package com.jetbrains;

public class Lecture extends Person implements ILecture {
    protected String Cathedra;
    protected int Salary;

    public int getSalary()
    {
        return Salary;
    }
    public void setSalary(int Salary)
    {
        this.Salary = Salary;
    }
    public String getCathedra()
    {
        return Cathedra;
    }
    public void setCathedra(String Cathedra)
    {
        this.Cathedra = Cathedra;
    }
    @Override

    public String printInfo()
    {
        return "Преподаватель кафедры " + getCathedra() + " " + getSurname() + " "
                + getName() + ", возраст: " + getAge()
                + ". Зарплата: " + getSalary();
    }
}
