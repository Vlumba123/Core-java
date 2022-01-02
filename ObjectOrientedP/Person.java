package ObjectOrientedP;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;
	public int AVG_AGE;

	public void setName(String name1) {
		name = name1;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setAddress(String address1) {
		address = address1;
	}

	public String getAddress() {
		return address;
	}

	public void setAVG_AGE(int AVG_AGE) {
		this.AVG_AGE = AVG_AGE;
	}

	public int getAVG_AGE() {
		return AVG_AGE;
	}

}
