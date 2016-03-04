package gitmining.bussinesslogic.info;

import java.util.Date;

import vo.UserInfoVO;

public class UserInfo {
	private String name;
	private String majorLanguage;
	private Date joinedDate;
	private UserAddress userAddress;
	private Evaluation evaluation;
	private RelatedProject relatedProject;
	
	public void setUserName(String name){
		this.name=name;
	}
	
	public void inquireUserInfo(){
		
	}

	public UserInfoVO convertToVO(){
		return null;
		
	}
	public String[] getRelatedProject(){
		if(relatedProject==null){
			relatedProject=new RelatedProject(name);
		}
		return relatedProject.getRelatedProject();
	}
	
	public String getMajorLanguate() {
		return majorLanguage;
	}

	public void setMajorLanguate(String majorLanguate) {
		this.majorLanguage = majorLanguate;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public UserAddress getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}
	
	
}
