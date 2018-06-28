package delegation.complete;

public class Student {
	Person p;
	String year = "Freshman";
	
	public Student ( Person p ) {
		this.p = p;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public void printTranscript() {
		System.out.println( " === Transcript for " + p.getName() + " ===");
		System.out.println(" Year: " + year);
		System.out.println( " -- CSC 517: A+ -- ");
	}
}
