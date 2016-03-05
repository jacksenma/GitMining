package factory;

import gitmining.dataservice.infodataservice.ProjectInfoDataService;
import gitmining.dataservice.infodataservice.UserInfoDataService;
import test.stub.ProjectInfoDataService_stub;
import test.stub.UserInfoDataService_stub;

public class InfoDataServiceFactory {
	
	public static ProjectInfoDataService getProjectInfoDataService(){
		return new ProjectInfoDataService_stub();
		
	}
	
	public static UserInfoDataService getUserInfoDataService(){
		return new UserInfoDataService_stub();		
	}
}
