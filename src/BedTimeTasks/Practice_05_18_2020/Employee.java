package BedTimeTasks.Practice_05_18_2020;
/*
create a sub class of person called Employee
            attributes: name, age, gender, Salary, employeeID, jobTitle
            methods: work, setEmployeeInfo, toString
 */
public class Employee extends Person {
    public double salary;
    public long employeeID;
    String jobTitle;

    public void work(){
        System.out.println(name+" is working at here");
    }

    public void setEmployeeInfo(String name, int age, char gender, double salary, long employeeID, String jobTitle){
        setPersonInfo(name, age, gender);
        this.salary = salary;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;

    }

    public String toString(){
        return name+", "+age+", "+gender+", "+salary+", "+employeeID+", "+jobTitle;
    }

}
