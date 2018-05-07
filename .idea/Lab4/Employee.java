/**
 * Created by David on 3/21/2018.
 */
public class Employee implements Rules {
    String name;
    int salary;

    /**
     * @param inName Employee Name
     * @param inSalary Employee Salary
     */
    public Employee(String inName, int inSalary){
        name = inName;
        salary = inSalary;
    }

    /**
     * default constructor, empty name, no salary
     */
    public Employee(){
        name = null;
        salary = 0;
    }

    /**
     * @return get employee name
     */
    public String getName(){
        return name;
    }

    /**
     * @return get employee salary
     */
    public int getSalary(){
        return salary;
    }

    /**
     * @return employee name and salary in an edited String
     */
    public String toString(){
        return name + " has a salary of: " + salary;
    }

}
