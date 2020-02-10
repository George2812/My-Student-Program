
public class GraduateStudent extends Student {
	
	private String supervisor;
	

	public GraduateStudent(String aName, String anID,String aSupervisor) {
		super(aName,anID);
		supervisor=aSupervisor;
		
	}
	
	//επικάλυψη μεθόδου
	public void printInfo() {
		super.printInfo();
		
		System.out.println("Supervisor: " +supervisor);
		
	}
	

}
