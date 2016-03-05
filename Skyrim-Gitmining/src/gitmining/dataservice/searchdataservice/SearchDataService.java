package gitmining.dataservice.searchdataservice;

import po.CategoryPO;

public interface SearchDataService {
	/**
	 * 按照排名搜索
	 * @param strategy 排名策略
	 * @return 按排名顺序整理好的项目名称数组
	 */
	public String[] getProjectNameBySort();
	
	/**
	 * 分类搜索
	 * @param category 项目种类
	 * @return 符合种类的项目名称数组
	 */
	public String[] getProjectNameByClass(CategoryPO category);
	
	
	/**
	 * 按照用户名搜索
	 * @param userName 用户名
	 * @return 该用户拥有的项目名称的数组
	 */
	public String[] getProjectNameByUser(String userName);

}
