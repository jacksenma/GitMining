package test.driver;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import factory.ListSearchBLServiceFactory;
import gitmining.blservice.searchservice.ListSearchBLService;
import myenum.SortStrategy;
import vo.CategoryVO;

public class ListSearchBLService_driver {

	private ListSearchBLService service=ListSearchBLServiceFactory.getListSearchBLService();
	
	@Test
	public void test() {
		assertEquals(this.testSearchBySort(),true);
		assertEquals(this.testSearchByClass(),true);
	}

	private boolean testSearchBySort(){
		String result[]=service.searchBySort(SortStrategy.FORK);
		String correctAnswer[]=new String[]{"ThreeBody","Skyrim","GitMining"};
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
	
	private boolean testSearchByClass(){
		@SuppressWarnings("deprecation")
		String result[]=service.searchByClass(new CategoryVO("Java","Windows",new Date(2016,3,4)));
		String correctAnswer[]=new String[]{"Skyrim","GitMining","ThreeBody"};
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
