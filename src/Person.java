
public class Person implements Comparable<Person> {
	
	private String firstName, lastName;
	private int id;
	
	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	@Override
	public int compareTo(Person that) {

		if (!this.lastName.equalsIgnoreCase(that.lastName)) {
			return this.lastName.compareToIgnoreCase(that.lastName);
		}

		if (!this.firstName.equalsIgnoreCase(that.firstName)) {
			return this.firstName.compareToIgnoreCase(that.firstName);
		}

		return this.id - that.id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " (" + id + ")";
	}
	
	
}
