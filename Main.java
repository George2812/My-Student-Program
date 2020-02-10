
public class Main {

	public static void main(String[] args) {
		
		Student S1;
		S1=new Student("George","1324");
		
		Course C1=new Course("Java",2);
		Course C2=new Course("C#",3);
		
		S1.addCourse(C1);
		S1.addCourse(C2);
		
		S1.printInfo();
		
		GraduateStudent GS1=new GraduateStudent("John","8976","Kalianidis");
		
		GS1.addCourse(C1);
		GS1.addCourse(C2);
		
		GS1.printInfo();

	}

}
