package anyQuestions.boundaries;
import java.util.Date;

public class UserBoundary {

	private String username;
	private String password;
	private String type;
	private boolean active;
	private Date createdTimestamp;

	
	public UserBoundary() {
		username = "Default";
		password = "123456";
		type = "Student";
		active = false;
		createdTimestamp = new Date();
	}

	public UserBoundary(String username, String password, String type, boolean active, Date createdTimestamp) {
		this.username = username;
		this.password = password;
		this.type = type;
		this.active = active;
		this.createdTimestamp = createdTimestamp;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	@Override
	public String toString() {
		return "UserBoundary{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", type=" + type +
				", active=" + active +
				", createdTimestamp=" + createdTimestamp +
				'}';
	}
	
	
}
