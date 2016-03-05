package po;

import gitmining.bussinesslogic.info.UserAddress;

public class UserAddressPO {
	private String home;
	private String email;
	private String company;
	
	public UserAddressPO(String home, String email, String company) {
		super();
		this.home = home;
		this.email = email;
		this.company = company;
	}

	public UserAddress unpack(){
		return new UserAddress(home,email,company);
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
