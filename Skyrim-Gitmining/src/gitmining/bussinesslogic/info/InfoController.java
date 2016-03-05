package gitmining.bussinesslogic.info;

import gitmining.blservice.infoservice.ProjectInfoBLService;
import gitmining.blservice.infoservice.UserInfoBLService;
import vo.ParticipantsInfoVO;
import vo.ProjectInfoVO;
import vo.UserInfoVO;

public class InfoController implements ProjectInfoBLService,UserInfoBLService{
	
	private ProjectInfo proInfo=new ProjectInfo();
	private UserInfo userInfo=new UserInfo();
	
	@Override
	public UserInfoVO inquireUserInfoService(String userName) {
		// TODO Auto-generated method stub
		userInfo.setUserName(userName);
		return userInfo.convertToVO();
	}

	@Override
	public ProjectInfoVO inquireProjectInfo(String projectName) {
		// TODO Auto-generated method stub
		proInfo.setProjectName(projectName);
		return proInfo.convertToVO();
	}

	@Override
	public String[] getRelatedProjectNames(String userName) {
		// TODO Auto-generated method stub
		userInfo.setUserName(userName);
		return userInfo.getRelatedProject();
	}

	@Override
	public ParticipantsInfoVO[] getParticipantsInfo(String projectName) {
		// TODO Auto-generated method stub
		proInfo.setProjectName(projectName);
		return proInfo.getPaticipantsInfo();
	}

}
