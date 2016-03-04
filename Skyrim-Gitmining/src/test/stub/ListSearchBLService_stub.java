package test.stub;

import java.util.Date;

import gitmining.blservice.searchservice.ListSearchBLService;
import myenum.SortStrategy;
import vo.CategoryVO;

public class ListSearchBLService_stub implements ListSearchBLService {

	@Override
	public String[] searchBySort(SortStrategy strategy) {
		// TODO Auto-generated method stub
		switch(strategy){
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
	public String[] searchByClass(CategoryVO vo) {
		// TODO Auto-generated method stub
		if(this.categoryIsRecord(vo)){
			return new String[]{"Skyrim","GitMining","ThreeBody"};
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	private boolean categoryIsRecord(CategoryVO vo){
		if(vo.getLanguage().equals("Java")&&vo.getOS().equals("Windows")
				&&vo.getDate().equals(new Date(2016,3,4))){
			return true;
		}
		return false;
	}
}
