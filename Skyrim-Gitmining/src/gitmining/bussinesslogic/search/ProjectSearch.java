package gitmining.bussinesslogic.search;

import error.ErroSortException;

/**
 * searchģ��Ŀ������������������û��������������Ĺ���
 * @author ���˷�
 *
 */
public class ProjectSearch implements SearchByUserService{
	private String[] projectName;
	private SortStrategy strategy;
	private SortFactory factory=new SortFactory();
	
	/**
	 * �����ƶ�����Ĳ���
	 * @param kinds ���������
	 * @throws ErroSortException ���������������׳����쳣
	 */
	public void setStrategy(String kinds) throws ErroSortException{
		this.strategy=factory.getStrategy(kinds);
	}
	
	/**
	 * ʹ�ò���ģʽ��������������
	 */
	public void searchBySort(){
		this.projectName=strategy.excute();
	}
	
	public void searchByClass(){
		
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
