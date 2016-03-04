package vo;

public class UserAddressVO {
	private String home;
	private String email;
	private String company;
	public UserAddressVO(String home, String email, String company) {
		super();
		this.home = home;
		this.email = email;
		this.company = company;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
}
