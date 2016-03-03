package gitmining.dataservice.searchdataservice;

import po.CategoryPO;
import po.SortStrategyPO;

public interface SearchDataService {
	
	public String[] getProjectNameBySort(SortStrategyPO strategy);
	
	public String[] getProjectNameByClass(CategoryPO category);
	
	public String[] getProjectNameByUser(String userName);

}
