package com.jetbrains;

public abstract class APerson {
    protected String Surname;
    protected String Name;
    protected int Age;
    public int getAge()
    {
        return this.Age;
    }
    public String getSurname()
    {
        return this.Surname;
    }
    public String getName()
    {
        return this.Name;
    }
    public void setSurname(String Surname)
    {
        this.Surname = Surname;
    }
    public void setName(String Name){this.Name = Name;}
    public void setAge(int Age)
    {
        this.Age = Age;
    }

}
