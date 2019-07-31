import java.util.ArrayList;
import java.util.List;

/**
 * This class is the Composite part of the composite pattern
 * which has the may leaf stored in collection.
 */
public class CompanyDirectory implements  Employee {
    // this is the main concept of the Composite pattern which stores the many leaf in a collection
    private List<Employee> employeeList = new ArrayList<Employee>();

    /**
     * this displays all the employee detailInfo
     * by retrieving form collection
     */
    @Override
    public void showEmployeeDetails()
    {
        for(Employee emp:employeeList)
        {
            emp.showEmployeeDetails();
        }
    }

    /**
     * @param emp adding to the collection to form leaf
     */
    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }

    /**
     * @param emp this will remove the leaf employee from collection
     */
    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }
}
