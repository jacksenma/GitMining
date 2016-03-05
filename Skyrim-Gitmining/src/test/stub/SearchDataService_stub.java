package test.stub;

import java.util.Date;

import gitmining.dataservice.searchdataservice.SearchDataService;
import po.CategoryPO;
import po.SimpleProjectInfoPO;

public class SearchDataService_stub implements SearchDataService{

	@Override
	public SimpleProjectInfoPO[] getProjectNameBySort() {
		// TODO Auto-generated method stub
		SimpleProjectInfoPO[] poList=new SimpleProjectInfoPO[3];
		poList[0]=new SimpleProjectInfoPO("Skyrim",1,2,3,4);
		poList[1]=new SimpleProjectInfoPO("ThreeBody",4,3,2,1);
		poList[2]=new SimpleProjectInfoPO("Gitmining",2,1,4,3);
		return poList;
	}

	@Override
	public String[] getProjectNameByClass(CategoryPO category) {
		// TODO Auto-generated method stub
		if(this.hasProject(category)){
			return new String[]{"Skyrim","GitMining","ThreeBody"};
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	private boolean hasProject(CategoryPO category){
		return category.getLanguage().equals("Java")&&
				category.getOs().equals("Windows")&&
				category.getCreateDate().equals(new Date(2016,3,4));
	}
	@Override
	public String[] getProjectNameByUser(String userName) {
		// TODO Auto-generated method stub
		if(userName.equals("TLOSP")){
			return new String[]{"Skyrim","GitMining","ThreeBody"};
		}
		return null;
	}

}
