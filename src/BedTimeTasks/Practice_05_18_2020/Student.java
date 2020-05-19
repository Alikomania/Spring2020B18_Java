package BedTimeTasks.Practice_05_18_2020;
/*
create a subclass of Person called Student
            attributes: name, age, gender, studentID, clazz
            methods: attendClass, code, setStudentInfo, toString
 */
public class Student extends Person {
    public long studentID;
    public String clazz;

    public void attendClass(){
        System.out.println(name+" is attending class");
    }

    public void code(){
        System.out.println(name+" is writing code");
    }

    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentID = studentID;
        this.clazz = clazz;
    }

    public String toString(){
        return name+", "+age+", "+gender+", "+studentID+", "+clazz;
    }


}
