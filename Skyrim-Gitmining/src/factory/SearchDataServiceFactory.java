package factory;

import gitmining.dataservice.searchdataservice.SearchDataService;
import test.stub.SearchDataService_stub;

public class SearchDataServiceFactory {
	
	public static SearchDataService getService(){
		return new SearchDataService_stub();
		
	}
}
