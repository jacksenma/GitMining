package test.stub;

import gitmining.blservice.searchservice.SearchByUserService;

public class SearchByUserService_stub implements SearchByUserService{

	@Override
	public String[] searchByUserName(String userName) {
		// TODO Auto-generated method stub
		switch(userName){
			case "TLOSP":
			return new String[]{"ThreeBody","Skyrim","GitMining"};
		}
		return null;
	}

}
