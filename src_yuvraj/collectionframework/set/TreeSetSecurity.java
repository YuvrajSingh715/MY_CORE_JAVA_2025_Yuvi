package collectionframework.set;

public class TreeSetSecurity  implements Comparable<TreeSetSecurity> {

	private String username;
	private String password;

	// Constructor()
	public TreeSetSecurity(String username, String password) {
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

//	@Override
//	public int compareTo(TreeSetSecurity t1) {
//		return this.username.compareTo(t1.getUsername());
//	}
	
	@Override
	public int compareTo(TreeSetSecurity t1) {

	    int usernameCompare = this.username.compareTo(t1.getUsername());

	    if (usernameCompare != 0) {
	       return usernameCompare;   // primary key: username
	    }

	    return this.password.compareTo(t1.getPassword()); // secondary key: password
	}
	
}
