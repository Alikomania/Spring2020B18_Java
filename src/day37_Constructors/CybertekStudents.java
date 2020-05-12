package day37_Constructors;

public class CybertekStudents {

    static String schoolName = "Cybertek School";
    String studentName; // We must need to know
    int groupNumber; // We must need to know
    String batch; // We must need to know

    public CybertekStudents( String studentName, int groupNumber, String batch){
     //   schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in group: "+groupNumber+", School name: "+schoolName;
    }
}



class CObjects{

    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Ali", 6, "B18");
        student1.schoolName = "MIT";

        System.out.println(student1);

        CybertekStudents student2 = new CybertekStudents("Sarah", 8, "B17");

        System.out.println(student2);
    }




}
