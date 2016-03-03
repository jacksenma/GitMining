package gitmining.blservice.searchservice;

import error.ErroSortException;
import vo.CategoryVO;

public interface ListSearchBLService {
	/**
	 * ����������ѯ��Ŀ
	 * @param kinds ��������
	 * @return ��Ŀ����
	 * @throws ErroSortException �����˴����������ʽ
	 */
	public String[] searchBySort(String kinds) throws ErroSortException;
	
	/**
	 * ��������
	 * @param vo ��Ŀ����
	 * @return ��Ŀ����
	 */
	public String[] searchByClass(CategoryVO vo);
}
