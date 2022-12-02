package OOPandCollections.Lesson2.Employee;

public class Employee {

    private int IDnumber;
    private String firstName;
    private String lastName;
    private long salary;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setIDnumber(int IDnumber) {
        this.IDnumber = IDnumber;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSalary() {
        String salary = "" + this.salary;
        if (salary.length() > 3) {
            for (int i = salary.length() - 3; i > -1; i -= 3) {
                salary = salary.substring(0, i) + " " + salary.substring(i);
            }
        }
        return salary;
    }
}
