package gitmining.blservice.searchservice;

/**
 * �ýӿڲ���Ϊչʾ�㽨����
 * @author ���˷�
 *
 */
public interface SearchByUserService {
	/**
	 * ���ڲ�ѯ��������û���ص���Ŀ����
	 * @return ��������û�����Ӧ����Ŀ����
	 */
	public String[] searchByUserName(String userName);
}
