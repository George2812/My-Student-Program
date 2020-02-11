import java.util.ArrayList;
import javax.swing.JOptionPane;




public class Read {

	public void readData(ArrayList<Student> students) {
		
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
			
			String answer=JOptionPane.showInputDialog("More Students? (Y/N)");
			if(answer.equals("N"))
				more=false;
			
			
		}
		
		
	}

}
