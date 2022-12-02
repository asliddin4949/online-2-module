package OOPandCollections.Lesson2.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Asliddin", "Muminov");
        employee.setIDnumber(4949);
        employee.setSalary(17_770_000l);
        System.out.println("Employee info:");
        System.out.println("ID - " + employee.getIDnumber()
                + "\nName: " + employee.getFirstName()
                + "\nSurname: " + employee.getLastName()
                + "\nSalary: " + employee.getSalary());
    }
}
