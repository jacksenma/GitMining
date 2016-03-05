package gitmining.dataservice.searchdataservice;

import po.CategoryPO;
import po.SimpleProjectInfoPO;

public interface SearchDataService {
	/**
	 * ������������
	 * @param strategy ��������
	 * @return ������˳������õ���Ŀ��������
	 */
	public SimpleProjectInfoPO[] getProjectNameBySort();
	
	/**
	 * ��������
	 * @param category ��Ŀ����
	 * @return �����������Ŀ��������
	 */
	public String[] getProjectNameByClass(CategoryPO category);
	
	
	/**
	 * �����û�������
	 * @param userName �û���
	 * @return ���û�ӵ�е���Ŀ���Ƶ�����
	 */
	public String[] getProjectNameByUser(String userName);

}
