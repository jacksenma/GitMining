package test.stub;

import java.sql.Date;

import gitmining.blservice.infoservice.ProjectInfoBLService;
import vo.CategoryVO;
import vo.EvaluationVO;
import vo.ParticipantsInfoVO;
import vo.ProjectAddressVO;
import vo.ProjectInfoVO;

public class ProjectInfoBLService_stub implements ProjectInfoBLService {

	@SuppressWarnings("deprecation")
	@Override
	public ProjectInfoVO inquireProjectInfo(String projectName) {
		// TODO Auto-generated method stub
		switch(projectName){
		case "ThreeBody":
		case "Skyrim":
		case "GitMining":
			return new ProjectInfoVO(projectName, 10, 10, 10000,
					new ProjectAddressVO("*****.git","*****.com"),
					new CategoryVO("Java","Windows",new Date(2016,3,4)),
					new EvaluationVO(100,100,100));
		}
		return null;
	}

	@Override
	public ParticipantsInfoVO[] getParticipantsInfo(String projectName) {
		// TODO Auto-generated method stub
		switch(projectName){
		case "ThreeBody":
		case "Skyrim":
		case "GitMining":
			ParticipantsInfoVO voList[]=new ParticipantsInfoVO[1];
			voList[1]=new ParticipantsInfoVO("TLOSP", 100, new EvaluationVO(100,100,100));
		}
		return null;
	}

}
