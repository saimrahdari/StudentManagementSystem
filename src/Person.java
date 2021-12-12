
public class Person {
	protected String name;
	protected String ID;
	protected String email;
	protected String contact_number;
	protected String address;
	protected String CNIC;
	protected String department;
	
	public Person(String name, String ID, String email, String contact_number, String address, String CNIC, String department) {
		this.name = name;
		this.ID = ID;
		this.email = email;
		this.contact_number = contact_number;
		this.address = address;
		this.CNIC = CNIC;
		this.department = department;
				
	}
	public void set_id(String id){
	        this.ID = id;
	    }

	public void displayProfile() {
		System.out.println("Name is: " + this.name + "\nID is:  " + this.ID + "\nEmail is: " + this.email + "\nContact number is: " + this.contact_number + "\nAddress is: " + this.address + "\nCNIC is: " + this.CNIC + "\nDepartment is: " + this.department );
	}
}
