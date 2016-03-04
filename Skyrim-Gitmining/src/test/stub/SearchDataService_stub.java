package test.stub;

import java.util.Date;

import gitmining.dataservice.searchdataservice.SearchDataService;
import po.CategoryPO;
import po.SortStrategyPO;

public class SearchDataService_stub implements SearchDataService{

	@Override
	public String[] getProjectNameBySort(SortStrategyPO strategy) {
		// TODO Auto-generated method stub
		switch(strategy.getStrategy()){
		case FORK:
			return new String[]{"ThreeBody","Skyrim","GitMining"};
		case PATICIPANTS:
			return new String[]{"GitMining","Skyrim","ThreeBody"};
		case RANK:
			return new String[]{"Skyrim","GitMining","ThreeBody"};
		case STAR:
			return new String[]{"Skyrim","GitMining","ThreeBody"};
		default:
			return null;
		}
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
