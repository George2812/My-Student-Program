import java.util.ArrayList;

public class Student {

	private String name;
	private String ID;
	
	private ArrayList<Course> courses=new ArrayList<Course>();
	
	
	public Student(String aName,String anID) {
		
		name=aName;
		ID=anID;
	}
	
	public void addCourse(Course aCourse) {
		
		courses.add(aCourse);
		
		
	}
	
	public void printInfo() {
		
		System.out.println("The Student: " +name);
		System.out.println("ID: " +ID);
		for(Course course: courses) {
		System.out.println(course.getName());
		System.out.println(course.getCredits());
		}
		
		
	}
}
