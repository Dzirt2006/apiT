package APIData;

public class DeserializeUser {
	private final String first_name;
	private final String last_name;
	private final String email;
	private final String avatar;
	private final String id;

	public DeserializeUser(String firstName, String lastName, String avatar, String id, String email) {
		this.avatar = avatar;
		this.id = id;
		this.email = email;
		this.first_name = firstName;
		this.last_name = lastName;
	}

	@Override
	public String toString() {
		return "id:" + id + " first_name:" + first_name + " last_name:" + last_name + " email:" + email + " avatar:"
				+ avatar;
	}
	

	public String getEmail() {
		return email;
	}
}
