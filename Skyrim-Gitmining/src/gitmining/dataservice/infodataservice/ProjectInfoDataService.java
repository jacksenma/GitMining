package gitmining.dataservice.infodataservice;

import po.ParticipantsInfoPO;
import po.ProjectInfoPO;

public interface ProjectInfoDataService {
	
	public ProjectInfoPO getProjectInfo(String projectName);
	
	public ParticipantsInfoPO[] getParticipantsInfo(String projectName);
}
