package OOPandCollections.Lesson1;

public class Student {
    public String lastname;
    public String firstname;
    public String groupnumber;
    public String[] subjects = new String[5];

    public void setStudent(String lastname, String firstname, String groupnumber){
        this.lastname = lastname;
        this.firstname = firstname;
        this.groupnumber = groupnumber;
    }
    public void setSubjects(String sub1, String sub2, String sub3, String sub4, String sub5){
        this.subjects[0] = sub1;
        this.subjects[1] = sub2;
        this.subjects[2] = sub3;
        this.subjects[3] = sub4;
        this.subjects[4] = sub5;
    }
    public void printStudent(){
        System.out.println(this.lastname+" "+this.firstname+" "+this.groupnumber);
    }
    public void printSubjects(){
        for (int i = 0; i < this.subjects.length; i++){
            System.out.println("Subject - "+(i+1)+" "+this.subjects[i]);
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudent("Muminov", "Asliddin", "Java_B26");
        student.printStudent();
        student.setSubjects("CPP","Java_Development","Database_Development","Spring_Development","Data_Structure");
        student.printSubjects();
    }
}
