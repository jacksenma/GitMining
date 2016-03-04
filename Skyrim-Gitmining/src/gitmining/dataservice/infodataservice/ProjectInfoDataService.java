package gitmining.dataservice.infodataservice;

import po.ParticipantsInfoPO;
import po.ProjectInfoPO;

public interface ProjectInfoDataService {
	/**
	 * ʹ�� ��Ŀ��������ȡ����ز����ߵ���Ŀ��Ϣ
	 * @param projectName ��Ŀ����
	 * @return ��Ŀ��Ϣ
	 */
	public ProjectInfoPO getProjectInfo(String projectName);
	
	/**
	 * ʹ����Ŀ��������ȡ��ز����ߵ���Ϣ
	 * @param projectName ��Ŀ����
	 * @return ��������Ϣ
	 */
	public ParticipantsInfoPO[] getParticipantsInfo(String projectName);
}
