package gitmining.bussinesslogic.info;

import java.util.Date;

import factory.InfoDataServiceFactory;
import gitmining.dataservice.infodataservice.UserInfoDataService;
import po.UserInfoPO;
import vo.UserInfoVO;

public class UserInfo {
	private String name;
	private String majorLanguage;
	private Date joinedDate;
	private UserAddress userAddress;
	private Evaluation evaluation;
	private RelatedProject relatedProject;
	private UserInfoDataService service=InfoDataServiceFactory.getUserInfoDataService();
	
	public void setUserName(String name){
		if(this.name!=null&&this.name.equals(name)){
			return;
		}
		this.name=name;
		this.inquireUserInfo();
	}
	
	private void inquireUserInfo(){
		UserInfoPO po=service.getUserInfoDataService(name);
		this.majorLanguage=po.getMajorLanguage();
		this.joinedDate=po.getJoinedDate();
		this.userAddress=po.getUserAddress().unpack();
		this.evaluation=po.getEvaluation().unpack();
	}

	public UserInfoVO convertToVO(){
		return new UserInfoVO(name,majorLanguage,joinedDate,evaluation.convertToVO(),
				userAddress.converToVO());
		
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
