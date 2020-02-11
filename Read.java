import java.util.ArrayList;
import javax.swing.JOptionPane;




public class Read {

	public static void readData(ArrayList<Student> students, ArrayList<Course> courses) {
		
		boolean more=true;
		
		while(more) {
			
			String selection=JOptionPane.showInputDialog("1: Student,2: Graduate");
			
			int choice=Integer.parseInt(selection);
			
			String name=JOptionPane.showInputDialog("Name");
			
			String id=JOptionPane.showInputDialog("Id");
			
			String supervisor=null;
			
			if(choice==2) {
				
				supervisor=JOptionPane.showInputDialog("Supervisor");
			}
			
			Student student;
			
			if(choice==1) {
				
				student=new Student(name,id);
			}
			else {
				
				student=new GraduateStudent(name,id,supervisor);
			}
			
			String courseName=JOptionPane.showInputDialog("Enter Course Name: ");
			
			for(Course course: courses) {
				if(course.getName().equals(courseName))
					student.addCourse(course);
			}
			students.add(student);
			
			String answer=JOptionPane.showInputDialog("More Students? (Y/N)");
			if(answer.equals("N"))
				more=false;
			
			
		}
		
		
	}

}
