package gitmining.bussinesslogic.search;

import factory.SearchDataServiceFactory;
import gitmining.blservice.searchservice.ListSearchBLService;
import gitmining.blservice.searchservice.SearchByUserService;
import gitmining.dataservice.searchdataservice.SearchDataService;
import myenum.SortStrategy;
import po.SortStrategyPO;
import vo.CategoryVO;

/**
 * search模块的控制器，负责按排名、用户名和类型搜索的功能
 * @author 豆乘风
 *
 */
public class ProjectSearch implements SearchByUserService,ListSearchBLService{
	
	private String[] projectName;
	private SearchDataService service=SearchDataServiceFactory.getService();
	
	public String[] searchBySort(SortStrategy strategy){
		return service.getProjectNameBySort(new SortStrategyPO(strategy));
	}
	
	public String[] searchByClass(CategoryVO vo){
		return service.getProjectNameByClass(vo.convertToPO());	
	}
	
	
	public String[] getProjectName(){
		return this.projectName;
	}

	@Override
	public String[] searchByUserName(String userName) {
		// TODO Auto-generated method stub
		return service.getProjectNameByUser(userName);
	}
}
