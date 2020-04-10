package oops.encapsulation.gettersandsetters;

public class Employee {

	private int id;
	private String name;
	private String emailId;
	
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
		}
	
	public int getId() {
		return id;
	}
	
	public void setId(int idFromCaller) {
		id = idFromCaller;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = "Vemula."+name;
	}
	
	Employee(){
		id = 1;
		name = "Ramya";
	}
	public void printEmployeeName() {
		System.out.println(name);
	}
}
