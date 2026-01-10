package collectionframework.set;

import java.util.Objects;

public class Security {

	private String username;
	private String password;

	//Constructor()
	public Security(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	// Getter()
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	// Setter()
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override // ToString()
	public String toString() {
		return "Security Patches => [UserName = " + username + " && Password = " + password + "]";
	}

	@Override // Hashcode()
	public int hashCode() {
		return Objects.hash(password, username);
//		return Objects.hash(username);
	}

	@Override // Equals()
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Security other = (Security) obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
//		return Objects.equals(username, other.username);
	}

}
