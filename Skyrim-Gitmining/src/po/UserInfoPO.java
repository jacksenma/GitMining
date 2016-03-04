package po;

import java.util.Date;

public class UserInfoPO {
	private String name;
	private String majorLanguage;
	private Date joinedDate;
	private UserAddressPO userAddress;
	private EvaluationPO evaluation;
	
	public UserInfoPO(String name, String majorLanguage, Date joinedDate, UserAddressPO userAddress,
			EvaluationPO evaluation) {
		super();
		this.name = name;
		this.majorLanguage = majorLanguage;
		this.joinedDate = joinedDate;
		this.userAddress = userAddress;
		this.evaluation = evaluation;
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

	public UserAddressPO getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(UserAddressPO userAddress) {
		this.userAddress = userAddress;
	}

	public EvaluationPO getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(EvaluationPO evaluation) {
		this.evaluation = evaluation;
	}
	
	
	
}
