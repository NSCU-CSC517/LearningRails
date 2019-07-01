import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentAccountCheck {
	private List<Integer> studentIdList = new ArrayList<Integer>(Arrays.asList(2000, 2001, 2002, 2003, 2005, 2010));

	// public boolean __________(5)__________(int studentId) {
	public boolean isStudentIdValid(int studentId) {
		if(studentIdList.contains(studentId)){
			return true;
		} else {
			System.out.println("Student ID is invalid");
			return false; 
		}
	}
}
