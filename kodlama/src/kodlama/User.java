package kodlama;

public class User {
	public String mailAddress;
	public String password;
	public String id;
	public String name;
	
	
	
	public User()
	{
		
	}
	
	
	public User(String mailAddress, String password, String id, String name, String courses) {
		super();
		this.mailAddress = mailAddress;
		this.password = password;
		this.id = id;
		this.name = name;
	}


	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
