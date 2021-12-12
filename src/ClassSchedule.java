import java.util.ArrayList;
import java.util.Random;

public class ClassSchedule {
	ArrayList<String> days = new ArrayList();
	ArrayList<RegisteredCourses> courses = new ArrayList();
    
    public void add_days(){
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
    }
    
    public void setCourses(ArrayList<RegisteredCourses> courses) {
    	this.courses = courses; //copying calling student object courses to local courses ArrayList
    }
    
    public void show_schedule(){ 
    	
        Random rand = new Random();
        int random_course = rand.nextInt(this.courses.size());

        for(int i = 0; i < days.size(); i++){
            System.out.println(days.get(i));
            for(int j = 0; j < this.courses.size(); j++){
                System.out.print(this.courses.get(random_course).course_name + "\t");
            }
        }
    }
}
