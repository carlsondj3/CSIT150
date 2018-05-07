/**
 * Created by David on 3/21/2018.
 */
public class Employee implements Rules {
    String name;
    int salary;

    public Employee(String inName, int inSalary){
        name = inName;
        salary = inSalary;
    }

    public Employee(){
        name = null;
        salary = 0;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public String toString(){
        return name + " has a salary of: " + salary;
    }

}
