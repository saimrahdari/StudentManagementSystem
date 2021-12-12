import java.util.Random;

public class Admin {
		Student student;
		Faculty faculty;
	//all the functions are related to file handling

		public void add_student(){
			student.set_id(generate_id());
		}

		public void delete_student(){

		}

		public void update_student(){

		}

		public void search_student(){

		}

		public void view_student(){

		}

		public void add_faculty(){
			faculty.set_id(generate_id());
		}

		public void delete_faculty(){

		}

		public void update_faculty(){

		}

		public void view_faculty(){
			
		}

		public void assign_teachers(){

		}

		public boolean fee_paid(){
			return false;
		}

		public static String randid() {
	        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	        StringBuilder salt = new StringBuilder();
	        Random rnd = new Random();
	        while (salt.length() < 3) { // length of the random string.
	            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	            salt.append(SALTCHARS.charAt(index));
	        }
	        String saltStr = salt.toString();
	        return saltStr;

	    }

		public String generate_id(){
			String id = randid() + "-" + randid() + "-" + randid();
			return id;
		}

}
