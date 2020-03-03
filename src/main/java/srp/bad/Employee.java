package srp.bad;

public class Employee
{
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

    public String toXml()
    {
        String str = "<employee>\n" +
                " <id>" + this.empId +"</id>\n" +
                " <firstName>" + this.firstName + "</firstName>\n" +
                " <lastName>" + this.lastName + "</lastName>\n" +
                " <salary>" + this.monthlySalary + "</salary>\n" +
                "</employee>";
        return str;
    }

    public static void main(String[] args) {
        Employee e = new Employee(1,"Alan", "Johnson", 1500);
        System.out.println(e.toXml());
    }
}
