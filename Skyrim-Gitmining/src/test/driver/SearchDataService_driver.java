package test.driver;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import factory.SearchDataServiceFactory;
import gitmining.dataservice.searchdataservice.SearchDataService;
import myenum.SortStrategy;
import po.CategoryPO;
import po.EvaluationPO;
import po.UserAddressPO;
import po.UserInfoPO;
import vo.CategoryVO;

public class SearchDataService_driver {
     private SearchDataService service = SearchDataServiceFactory.getService();
     
     @Test
     public void test(){
    	 assertEquals(this.testGetProjectNameBySort(),true);
    	 assertEquals(this.testGetProjectNameByClass(),true);
    	 assertEquals(this.testGetProjectNameByUser(),true);
     }

	private boolean testGetProjectNameBySort() {
		return false;
		// TODO Auto-generated method stub
//		String result[]=service.getProjectNameBySort();
//		String correctAnswer[]=new String[]{"thoughtbot/paperclip","pat/thinking-sphinx","norman/friendly_id"};
//		if(result.length!=correctAnswer.length){
//			return false;
//		}
//		for(int x=0;x<correctAnswer.length;x++){
//			if(!result[x].equals(correctAnswer[x])){
//				return false;
//			}
//		}
//		return true;
	}

	private boolean testGetProjectNameByClass() {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		String result[]=service.getProjectNameByClass((new CategoryPO("Java","app",new Date(2008,1,1))));
		String correctAnswer[]=new String[]{"rikrd/geomerative","bmc/javautil"};
		if(result.length!=correctAnswer.length){
			return false;
		}
		
		for(int x=0;x<correctAnswer.length;x++){
			if(!result[x].equals(correctAnswer[x])){
				return false;
			}
		}
		return true;
	}

	private boolean testGetProjectNameByUser() {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		String result[]=service.getProjectNameByUser("aasm");
		String correctAnswer[]=new String[]{"aasm"};
		if(result.length!=correctAnswer.length){
			return false;
		}
		
		for(int x=0;x<correctAnswer.length;x++){
			if(!result[x].equals(correctAnswer[x])){
				return false;
			}
		}
		return true;
	}
}
