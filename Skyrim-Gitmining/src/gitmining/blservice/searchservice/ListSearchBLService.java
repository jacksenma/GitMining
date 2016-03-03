package gitmining.blservice.searchservice;

import myenum.SortStrategy;
import vo.CategoryVO;

public interface ListSearchBLService {
	/**
	 * ����������ѯ��Ŀ
	 * @param kinds ��������
	 * @return ��Ŀ����
	 * @throws ErroSortException �����˴����������ʽ
	 */
	public String[] searchBySort(SortStrategy strategy);
	
	/**
	 * ��������
	 * @param vo ��Ŀ����
	 * @return ��Ŀ����
	 */
	public String[] searchByClass(CategoryVO vo);
}
