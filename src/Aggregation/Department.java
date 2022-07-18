package Aggregation;

import java.util.List;

public class Department {
	    private String name;
	    private List<Student> students;
	    
	    Department(String name, List<Student> students)
	    {
	        this.name = name;
	        this.students = students;
	    }
	 
	    // Method of Department class
	    public List<Student> getStudents()
	    {
	        return students;
	    }
}
