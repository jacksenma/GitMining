package vo;

import java.util.Date;

public class UserInfoVO {
	private String name;
	private String majorLanguage;
	private Date joinedDate;
	private EvaluationVO evaluation;
	private UserAddressVO userAddress;
	

	public UserInfoVO(String name, String majorLanguage, Date joinedDate, EvaluationVO evaluation,
			UserAddressVO userAddress) {
		super();
		this.name = name;
		this.majorLanguage = majorLanguage;
		this.joinedDate = joinedDate;
		this.evaluation = evaluation;
		this.setUserAddress(userAddress);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajorLanguage() {
		return majorLanguage;
	}

	public void setMajorLanguage(String majorLanguage) {
		this.majorLanguage = majorLanguage;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public EvaluationVO getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(EvaluationVO evaluation) {
		this.evaluation = evaluation;
	}

	public UserAddressVO getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(UserAddressVO userAddress) {
		this.userAddress = userAddress;
	}
	
	
}
