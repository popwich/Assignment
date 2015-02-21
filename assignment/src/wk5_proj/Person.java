package wk5_proj;
import java.util.*;

public class Person implements Human {
	private String name;
	private String gender;
	private String address;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
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
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}

	public void setAge(int value) {
		this.age = value;
	}
	public int getAge() {
		return this.age;
	}
}
