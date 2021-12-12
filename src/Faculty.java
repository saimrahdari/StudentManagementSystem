
public class Faculty extends Person{
	RegisteredCourses course;
	Announcements announcement;
	
	public Faculty(String name, String ID, String email, String contact_number, String address, String CNIC,String department) {
		
		super(name, ID, email, contact_number, address, CNIC, department);
		
	}
	
	public void updateProfile() {
		//will be done by filing
	}
	
	public void viewAllStudents() {
		//will be done by filing
	}
	
	public void searchStudent() {
		//will be done by filing
	}
	
	
}
