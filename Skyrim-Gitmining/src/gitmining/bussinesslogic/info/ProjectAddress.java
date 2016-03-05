package gitmining.bussinesslogic.info;

import vo.ProjectAddressVO;

public class ProjectAddress {
	private String codeAddress;
	private String netAddress;

	public ProjectAddress(String codeAddress, String netAddress) {
		super();
		this.codeAddress = codeAddress;
		this.netAddress = netAddress;
	}
	
	public ProjectAddressVO converToVO(){
		return new ProjectAddressVO(codeAddress,netAddress);
	}
}
