package factory;

import gitmining.blservice.searchservice.ListSearchBLService;
import gitmining.bussinesslogic.search.ProjectSearch;

public class ListSearchBLServiceFactory {
	
	public static ListSearchBLService getListSearchBLService(){
		return new ProjectSearch();
	}
}
