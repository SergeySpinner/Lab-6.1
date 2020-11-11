package com.jetbrains;

public class Student extends Person implements IStudent {
    protected String Group;
    protected int StudentId;

    public int getStudentId()
    {
        return this.StudentId;
    }
    public String getGroup()
    {
        return this.Group;
    }
    public void setGroup(String Group)
    {
        this.Group = Group;
    }
    public void setStudentId(int StudentId)
    {
        this.StudentId = StudentId;
    }
    @Override
    public String printInfo()
    {
        return "Студент группы " + getGroup() + " " + getSurname() + " "
                + getName() + ", возраст: " + getAge()
                + ". Номер студенческого билета: " + getStudentId();
    }
}
