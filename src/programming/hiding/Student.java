package programming.hiding;

public class Student {
	int studentID;
	private String StudentName;
	int grade;
	String address;
	
	public String getStudentName(){
		return StudentName;
	}
	
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}
}
