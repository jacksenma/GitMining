package gitmining.blservice.infoservice;

import vo.ParticipantsInfoVO;
import vo.ProjectInfoVO;

public interface ProjectInfoBLService {
	/**
	 * 用于查询项目信息
	 * @param projectName 项目名称
	 * @return 项目信息
	 */
	public ProjectInfoVO inquireProjectInfo(String projectName);
	
	/**
	 * 用于插叙项目参与者信息
	 * @param projectName 项目名称
	 * @return 项目信息
	 */
	public ParticipantsInfoVO[] getParticipantsInfo(String projectName);
}
