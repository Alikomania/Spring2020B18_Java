package BedTimeTasks.Practice_05_18_2020;
/*
create a class called Person
            attributes:  name, age, gender
            methods: eat, walk, sleep, setPersonInfo
    create a sub class of person called Employee
            attributes: name, age, gender, Salary, employeeID, jobTitle
            methods: work, setEmployeeInfo, toString
    create a subclass of Person called Student
            attributes: name, age, gender, studentID, clazz
            methods: attendClass, code, setStudentInfo, toString
    create a class called company:
                create 3 objects of employee and set thier info
                create an array of employees and store all those employee objects
                use regular for loop to print out each employee' name and employeeID

 */
public class Person {
    public String name;
    public int age;
    public char gender;

    public void eat(){
        System.out.println(name+" eat the pizza");
    }

    public void walk(){
        System.out.println(name+" walk every day");
    }

    public void sleep(){
        System.out.println(name+" sleep every night");
    }

    public void setPersonInfo(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
