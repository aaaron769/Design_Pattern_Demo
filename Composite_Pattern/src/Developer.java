/**
 * this class is the leaf of the composite pattern
 * which is the type of Employee
 */
public class Developer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails()
    {
        System.out.println(empId+" " +name);
    }
}
