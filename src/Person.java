
public class Person {
	
	private int personId;
	private String lastName;
	private String firstName;
	private String address;
	private String city;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", lastName=" + lastName + ", firstName=" + firstName + ", address="
				+ address + ", city=" + city + "]";
	}
	public Person(int personId, String lastName, String firstName, String address, String city) {
		super();
		this.personId = personId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.city = city;
	}
	
	
	
	
}
