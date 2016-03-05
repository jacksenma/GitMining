package gitmining.bussinesslogic.info;

import vo.UserAddressVO;

public class UserAddress {
	private String home;
	private String email;
	private String company;
	
	public UserAddress(String home, String email, String company) {
		super();
		this.home = home;
		this.email = email;
		this.company = company;
	}

	public UserAddressVO converToVO(){
		return new UserAddressVO(home,email,company);
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
