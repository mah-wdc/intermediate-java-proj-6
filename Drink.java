/*
 * Matthew Homan
 * CMIS 242 7382
 * April 20, 2023
 * Discussion Week 6 Task
 * 
 */


public class Drink {
	
	//Initialize variable
	private String name;
	
	//Constructor
	public Drink(String name) {
		super();
		this.name = name;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Method to display what was ordered
	public void display() {
		System.out.println("\n\nYou ordered a " + name + ". Enjoy!\n\n");
	}

}
