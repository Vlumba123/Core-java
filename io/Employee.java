package file.io;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;
	private transient String pwd;
	
	public Employee () {}

	public Employee(int id, String name,String pwd) {
		
		this.id = id;
		this.name = name;
		//this.pwd = pwd;
		}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPwd() {
		return pwd;
	}
	

}
