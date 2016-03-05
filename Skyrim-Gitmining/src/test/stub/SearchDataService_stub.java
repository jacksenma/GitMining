package test.stub;

import java.util.Date;

import gitmining.dataservice.searchdataservice.SearchDataService;
import po.CategoryPO;

public class SearchDataService_stub implements SearchDataService{

	@Override
	public String[] getProjectNameBySort() {
		// TODO Auto-generated method stub
		return null;
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
