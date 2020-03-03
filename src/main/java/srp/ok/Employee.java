package srp.ok;

public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(int empId, String firstName, String lastName, double monthlySalary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}
