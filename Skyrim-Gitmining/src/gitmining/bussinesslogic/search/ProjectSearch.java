package gitmining.bussinesslogic.search;

import error.ErroSortException;
import gitmining.blservice.searchservice.ListSearchBLService;
import gitmining.blservice.searchservice.SearchByUserService;
import vo.CategoryVO;

/**
 * searchģ��Ŀ������������������û��������������Ĺ���
 * @author ���˷�
 *
 */
public class ProjectSearch implements SearchByUserService,ListSearchBLService{
	private String[] projectName;
	private SortStrategy strategy;
	private SortFactory factory=new SortFactory();
	
	/**
	 * �����ƶ�����Ĳ���
	 * @param kinds ���������
	 * @throws ErroSortException ���������������׳����쳣
	 */
	private void setStrategy(String kinds) throws ErroSortException{
		this.strategy=factory.getStrategy(kinds);
	}
	
	/**
	 * ʹ�ò���ģʽ��������������
	 */
	private String[] searchBySort(){
		return this.projectName=strategy.excute();
	}
	
	public String[] searchBySort(String kinds) throws ErroSortException{
		this.setStrategy(kinds);
		return this.searchBySort();
	}
	
	public String[] searchByClass(CategoryVO vo){
		return projectName;
		
	}
	
	
	public String[] getProjectName(){
		return this.projectName;
	}

	@Override
	public String[] searchByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
}
