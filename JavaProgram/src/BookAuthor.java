
public class BookAuthor {
	private String name;
	private String email;
	private char gender;
	
	public void Author1(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String toString() {
		return "Author[name = " + getName() + " email = " + getEmail() +
				", gender = " + getGender() + "]";
	}

}