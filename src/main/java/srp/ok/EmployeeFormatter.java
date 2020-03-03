package srp.ok;

public class EmployeeFormatter {

    private final Employee employee;

    public EmployeeFormatter(Employee employee)
    {
        this.employee = employee;
    }

    public String toXml()
    {
        String str = "<employee>\n" +
                " <id>" + employee.getEmpId() +"</id>\n" +
                " <firstName>" + employee.getFirstName() + "</firstName>\n" +
                " <lastName>" + employee.getLastName() + "</lastName>\n" +
                " <salary>" + employee.getMonthlySalary() + "</salary>\n" +
                "</employee>";
        return str;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1,"Alan", "Johnson", 1500);
        EmployeeFormatter employeeFormatter = new EmployeeFormatter(employee);
        System.out.println(employeeFormatter.toXml());
    }
}
