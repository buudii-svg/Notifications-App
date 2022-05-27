package Users;

import Observer.Observer;

public class Student extends User implements Observer {
	
	int Id;
	
	
	public Student(String name, int id, String email, String phoneNumber) {
		super();
		this.name = name;
		Id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	// Same as notifyStudent
	@Override
	public void update(Object message) {
		// TODO Auto-generated method stub
		
	}
	
}
