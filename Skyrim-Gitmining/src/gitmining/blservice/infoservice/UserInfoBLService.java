package gitmining.blservice.infoservice;

import vo.UserInfoVO;

public interface UserInfoBLService {
	/**
	 * ���ڲ�ѯ֪���û������û���Ϣ
	 * @param userName �û���
	 * @return �û���Ϣ
	 */
	public UserInfoVO inquireUserInfoService(String userName);
	
	/**
	 * ���ڲ�ѯ�û����������Ŀ����
	 * @param userName �û�����
	 * @return ��Ŀ����
	 */
	public String[] getRelatedProjectNames(String userName);
}
