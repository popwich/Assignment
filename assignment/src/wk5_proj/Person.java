package wk5_proj;


public class Person implements Human {
	private String name;
	private String gender;
	private Address address;
	private int age;
	
	//setter and getter
	public void setName(String value) {
		this.name = value;
	}
	public String getName() {
		return this.name;
	}	
	
	public void setGender(String value) {
		this.gender = value;
	}
	public String getGender() {
		return this.gender;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return this.address;
	}

	public void setAge(int value) {
		this.age = value;
	}
	public int getAge() {
		return this.age;
	}

	


	



}
