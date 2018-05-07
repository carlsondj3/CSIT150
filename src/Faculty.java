/**
 * Created by David on 3/21/2018.
 */
public class Faculty extends Employee{
    private String[] courses;

    /**
     * Faculty inherits all of the Employee params, adds Courses array
     * @param inName    the Professor's Name
     * @param inSalary  the Professor's Pay
     * @param inCourses the Professor's Courses
     */
    public Faculty(String inName, int inSalary, String[] inCourses){
        name = inName;
        salary = inSalary;
        courses = new String[inCourses.length];
        for(int i = 0; i < inCourses.length; i++){
            courses[i] = inCourses[i];
        }


    }

    /**
     * simple getter
     * @return the name of the professor, with Professor title
     */
    public String getName(){
        return "Professor "+name;
    }

    /**
     * simple getter, for an array
     * @return returns a copy of the course array
     */
    public String[] getCourses(){
        String[] copyCourses = new String[courses.length];
        for(int i =0; i < courses.length; i++){
            copyCourses[i] = courses[i];
        }
        return copyCourses;
    }

    /**
     *
     * @param inCourses
     */
    public void setCourses(String[] inCourses){
        courses = new String[inCourses.length];
        for(int i = 0; i < inCourses.length; i++){
            courses[i] = inCourses[i];
        }
    }

    /**
     * @return prints in a nice string format
     */
    public String toString(){
        String toString = getName() + " teaches";
        for(int i =0; i< courses.length; i++){
            toString+= ", "+courses[i];
        }
        toString+= " for $" + salary;
        return toString;
    }
}
