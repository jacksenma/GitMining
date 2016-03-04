package test.stub;

import java.util.Date;

import gitmining.dataservice.infodataservice.ProjectInfoDataService;
import po.CategoryPO;
import po.EvaluationPO;
import po.ParticipantsInfoPO;
import po.ProjectAddressPO;
import po.ProjectInfoPO;

public class ProjectInfoDataService_stub implements ProjectInfoDataService {

	@SuppressWarnings("deprecation")
	@Override
	public ProjectInfoPO getProjectInfo(String projectName) {
		// TODO Auto-generated method stub
		switch(projectName){
		case "ThreeBody":
		case "Skyrim":
		case "GitMining":
			return new ProjectInfoPO(projectName, 10, 10, 10000
					,new ProjectAddressPO("*****.git","*****.com"),
					new CategoryPO("Java","Windows",new Date(2016,3,4))
					,new EvaluationPO(100,100,100));
		}
		return null;
	}

	@Override
	public ParticipantsInfoPO[] getParticipantsInfo(String projectName) {
		// TODO Auto-generated method stub
		switch(projectName){
		case "ThreeBody":
		case "Skyrim":
		case "GitMining":
			ParticipantsInfoPO poList[]=new ParticipantsInfoPO[1];
			poList[0]=new ParticipantsInfoPO("TLOSP",10000,new EvaluationPO(100,100,100));
			return poList;
		}
		return null;
	}

}
