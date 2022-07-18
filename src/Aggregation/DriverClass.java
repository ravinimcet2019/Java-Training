package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args)
    {
        // Creating object of Student class
        Student s1 = new Student("Ravi", 1, "CSE");
        Student s2 = new Student("Rahul", 2, "CSE");
        Student s3 = new Student("Pankej", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");
 
        List<Student> cse_students = new ArrayList<Student>();
 
        cse_students.add(s1);
        cse_students.add(s2);
        
        List<Student> ee_students
            = new ArrayList<Student>();
 
        ee_students.add(s3);
        ee_students.add(s4);
 
        // Creating objects of EE and CSE class
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
 
        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
 
        // Creating an instance of Institute
        Institute institute = new Institute("BITS", departments);
 
        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());
    }
}
