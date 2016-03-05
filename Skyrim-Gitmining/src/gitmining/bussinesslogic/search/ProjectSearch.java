package gitmining.bussinesslogic.search;

import factory.SearchDataServiceFactory;
import gitmining.blservice.searchservice.ListSearchBLService;
import gitmining.blservice.searchservice.SearchByUserService;
import gitmining.dataservice.searchdataservice.SearchDataService;
import myenum.SortStrategy;
import po.SimpleProjectInfoPO;
import vo.CategoryVO;

/**
 * searchģ��Ŀ������������������û��������������Ĺ���
 * @author ���˷�
 *
 */
public class ProjectSearch implements SearchByUserService,ListSearchBLService{
	
	private SimpleProjectInfo projectList[];
	private SearchDataService service=SearchDataServiceFactory.getService();
	private SortMethord methord;
	
	public String[] searchBySort(SortStrategy strategy){
		methord=SortFactory.getMethord(strategy);
		System.out.println("set methord success");
		if(projectList==null){
			this.getSimpleProjectInfoFromAPI();
		}
		return methord.excute(projectList);
	}
	
	public String[] searchByClass(CategoryVO vo){
		return service.getProjectNameByClass(vo.convertToPO());	
	}
	

	private void getSimpleProjectInfoFromAPI(){
		SimpleProjectInfoPO poList[]=service.getProjectNameBySort();
		projectList=new SimpleProjectInfo[poList.length];
		for(int x=0;x<projectList.length;x++){
			projectList[x]=poList[x].unpack();
		}
	}

	@Override
	public String[] searchByUserName(String userName) {
		// TODO Auto-generated method stub
		return service.getProjectNameByUser(userName);
	}
}
