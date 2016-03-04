package factory;

import gitmining.blservice.infoservice.ProjectInfoBLService;
import gitmining.blservice.infoservice.UserInfoBLService;
import gitmining.bussinesslogic.info.InfoController;

public class InfoBLServiceFactory {
	
	public static ProjectInfoBLService getProjectInfoBLService(){
		return new InfoController();
	}
	
	public static UserInfoBLService getUserInfoBLService(){
		return new InfoController();
	}
}
