package gitmining.dataservice.infodataservice;

import po.ParticipantsInfoPO;
import po.ProjectInfoPO;

public interface ProjectInfoDataService {
	/**
	 * 使用 项目名称来获取处相关参与者的项目信息
	 * @param projectName 项目名称
	 * @return 项目信息
	 */
	public ProjectInfoPO getProjectInfo(String projectName);
	
	/**
	 * 使用项目名称来获取相关参与者的信息
	 * @param projectName 项目名称
	 * @return 参与者信息
	 */
	public ParticipantsInfoPO[] getParticipantsInfo(String projectName);
}
