import java.util.ArrayList;

public class RegisteredCourses {
	String course_name;
	Faculty teacher;
    String course_code;
    int credit_hours;
    ArrayList<Assignment> assignments = new ArrayList();
	ArrayList<Quiz> quiz = new ArrayList();
    Result result;
    

    public RegisteredCourses(Faculty f, String course_name, String course_code, int credit_hours) {
        this.course_name = course_name;
        this.teacher = f;
        this.course_code = course_code;
        this.credit_hours = credit_hours;
      
    }
    
    public ArrayList<Quiz> get_quiz(){
        return quiz;
    }

    public ArrayList<Assignment> get_assignment(){
        return assignments;
    }
    
    
}
