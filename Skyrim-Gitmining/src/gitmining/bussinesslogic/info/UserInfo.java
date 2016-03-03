package gitmining.bussinesslogic.info;

import java.util.Date;

import vo.UserInfoVO;

public class UserInfo {
	private String name;
	private String majorLanguate;
	private Date joinedDate;
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
		return majorLanguate;
	}

	public void setMajorLanguate(String majorLanguate) {
		this.majorLanguate = majorLanguate;
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
	
	
}
