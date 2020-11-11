package com.jetbrains;

public class Main {

    public static void main(String[] args)
    {
        //Object[] _object = new Object[4];
        Person[] _person = new Person[4];

        Student[] _student = new Student[2]; //Two Student

        Lecture[] _lecture = new Lecture[2];  //Two Lectures

        for (int i = 0; i < _person.length; i++)
        {
            if(i < 2)
            {
                _student[i] = new Student();
                _lecture[i] = new Lecture();
            }
            _person[i] = new Person();
        }

        _student[0].setGroup("AD-192");
        _student[0].setStudentId(22451);
        _student[0].setAge(18);
        _student[0].setName("David");
        _student[0].setSurname("Ivanov");

        _student[1].setGroup("AT-182");
        _student[1].setStudentId(4413);
        _student[1].setAge(20);
        _student[1].setName("Stas");
        _student[1].setSurname("Krasnov");

        _lecture[0].setCathedra("Information systems and technologies");
        _lecture[0].setSalary(5561);
        _lecture[0].setAge(43);
        _lecture[0].setName("Peter");
        _lecture[0].setSurname("Portland");

        _lecture[1].setCathedra("Big Data Technologies");
        _lecture[1].setSalary(9000);
        _lecture[1].setAge(37);
        _lecture[1].setName("Felix");
        _lecture[1].setSurname("Sipchushkin");

        _person[0] = _student[0];
        _person[1] = _student[1];
        _person[2] = _lecture[0];
        _person[3] = _lecture[1];

        for(Person temp : _person)
        {
            System.out.println(temp.printInfo());
        }
    
    }
}
