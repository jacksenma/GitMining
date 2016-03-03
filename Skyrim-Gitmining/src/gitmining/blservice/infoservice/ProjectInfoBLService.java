package gitmining.blservice.infoservice;

import vo.ParticipantsInfoVO;
import vo.ProjectInfoVO;

public interface ProjectInfoBLService {
	/**
	 * ���ڲ�ѯ��Ŀ��Ϣ
	 * @param projectName ��Ŀ����
	 * @return ��Ŀ��Ϣ
	 */
	public ProjectInfoVO inquireProjectInfo(String projectName);
	
	/**
	 * ���ڲ�����Ŀ��������Ϣ
	 * @param projectName ��Ŀ����
	 * @return ��Ŀ��Ϣ
	 */
	public ParticipantsInfoVO[] getParticipantsInfo(String projectName);
}
