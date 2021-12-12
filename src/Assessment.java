
public abstract class Assessment {
	
	String assessment_name;
	int assessment_number;
	String assessment_details;
	int assessment_marks;
	boolean assessment_submitted;
	boolean assessment_returned;
	
	Assessment(String name, int number, String details, int marks, boolean submitted, boolean returned){
		this.assessment_name = name;
		this.assessment_number = number;
		this.assessment_details = details;
		this.assessment_marks = marks;
		this.assessment_submitted = submitted;
		this.assessment_returned = returned;
	}
	
	public abstract void view_assessment();
	public abstract void generate_assessment();
	public abstract void return_assessment();
	public abstract void submit_assessment();
	
}
