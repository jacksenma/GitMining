package vo;

public class ProjectAddressVO {
	private String codeAddress;
	private String netAddress;
	
	public ProjectAddressVO(String codeAddress, String netAddress) {
		super();
		this.codeAddress = codeAddress;
		this.netAddress = netAddress;
	}

	public String getCodeAddress() {
		return codeAddress;
	}

	public void setCodeAddress(String codeAddress) {
		this.codeAddress = codeAddress;
	}

	public String getNetAddress() {
		return netAddress;
	}

	public void setNetAddress(String netAddress) {
		this.netAddress = netAddress;
	}
	
	
}
