package gitmining.bussinesslogic.search;

import error.ErroSortException;
import gitmining.blservice.searchservice.ListSearchBLService;
import gitmining.blservice.searchservice.SearchByUserService;
import vo.CategoryVO;

/**
 * search模块的控制器，负责按排名、用户名和类型搜索的功能
 * @author 豆乘风
 *
 */
public class ProjectSearch implements SearchByUserService,ListSearchBLService{
	private String[] projectName;
	private SortStrategy strategy;
	private SortFactory factory=new SortFactory();
	
	/**
	 * 用于制定排序的策略
	 * @param kinds 排序的种类
	 * @throws ErroSortException 输入错误的类型所抛出的异常
	 */
	private void setStrategy(String kinds) throws ErroSortException{
		this.strategy=factory.getStrategy(kinds);
	}
	
	/**
	 * 使用策略模式，按照排名所搜
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
