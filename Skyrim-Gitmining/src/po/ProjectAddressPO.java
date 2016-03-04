package po;

public class ProjectAddressPO {
	private String codeAddress;
	private String netAddress;
	
	public ProjectAddressPO(String codeAddress, String netAddress) {
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
