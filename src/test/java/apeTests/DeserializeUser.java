package apeTests;

public class DeserializeUser {
	private final String firstName;
	private final String lastName;
	private final String email;
	private final String avatar;
	private final String id;

	public DeserializeUser(String firstName, String lastName, String avatar, String id, String email) {
		this.avatar = avatar;
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "id:" + id + " firstName:" + firstName + " lastName:" + lastName + " email:" + email + " avatar:"
				+ avatar;
	}

	public String getEmail() {
		return email;
	}
}
