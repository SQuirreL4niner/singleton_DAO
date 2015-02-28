package net.eprojex.DAO.model;

public class Person {	//a person bean aka transfer object
						//can hold all data related to 
						//a person object

	private int id;
	private String name;
	private String password;
	
	public Person() {
		//instantiate a person object
		//send this info to person bean
	}
	
	public Person(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public Person(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
