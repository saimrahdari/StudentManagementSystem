import java.util.ArrayList;

public class Student extends Person{
	boolean fee_paid;
	ArrayList<RegisteredCourses> courses = new ArrayList();
	ClassSchedule classSchedule;
	Announcements annoucement;
	Result result;
	
	public Student(String name, String ID, String email, String contact_number, String address, String CNIC,String department, boolean fee_paid) {
		
		super(name, ID, email, contact_number, address, CNIC, department);
		this.fee_paid = fee_paid;
		
	}
	
	public ArrayList<RegisteredCourses> getCourses() {
		return this.courses;
	}
	
	public void displayCourses() {
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i).course_name);
			System.out.println(courses.get(i).course_code);
			System.out.println(courses.get(i).credit_hours);
			System.out.println(courses.get(i).teacher.name);
		}
	}
	
	
}
