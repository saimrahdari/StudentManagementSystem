import java.util.ArrayList;

public class Result {
	int marks;
	double gpa;
	ArrayList<Assignment> assignment = new ArrayList();
	ArrayList<Quiz> quiz = new ArrayList();
	
	public void show_result() {
		System.out.println("Marks are: " + get_marks());
		System.out.println("Your gpa is " + get_gpa());
	}
	
	public int get_total_marks(){
        return ((quiz.size() * 15) + (assignment.size() * 10));    
    }

    public int get_marks(){
       if (quiz.size() == 4 && assignment.size() == 4) {
    	   for(int i = 0; i < quiz.size(); i++)
               marks += quiz.get(i).assessment_marks;
           for(int i = 0; i < assignment.size(); i++)
               marks += assignment.get(i).assessment_marks;
           return marks;
       }
       
       else {
    	   System.out.println("Not enought data to view result yet.");
      		return 0;
       }
    	  
        
    }

    public double get_gpa(){
        this.gpa = (marks / get_total_marks() * 100) / 4;
        return gpa;
    }
    
    public void set_quiz(ArrayList<Quiz> quiz) {
    	this.quiz = quiz;
    }
    
    public void set_assignment(ArrayList<Assignment> assignment) {
    	this.assignment = assignment;
    }
    
}
