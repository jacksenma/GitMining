package gitmining.bussinesslogic.info;

import gitmining.blservice.infoservice.ProjectInfoBLService;
import gitmining.blservice.infoservice.UserInfoBLService;
import vo.ParticipantsInfoVO;
import vo.ProjectInfoVO;
import vo.UserInfoVO;

public class InfoController implements ProjectInfoBLService,UserInfoBLService{

	@Override
	public UserInfoVO inquireUserInfoService(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectInfoVO inquireProjectInfo(String projectName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getRelatedProjectNames(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParticipantsInfoVO[] getParticipantsInfo(String projectName) {
		// TODO Auto-generated method stub
		return null;
	}

}
