package test.driver;

import static org.junit.Assert.*;

import java.sql.Date;

import factory.InfoDataServiceFactory;
import gitmining.dataservice.infodataservice.ProjectInfoDataService;
import po.CategoryPO;
import po.EvaluationPO;
import po.ParticipantsInfoPO;
import po.ProjectAddressPO;
import po.ProjectInfoPO;
import org.junit.Test;

public class ProjectInfoDataService_driver {
	private ProjectInfoDataService service =InfoDataServiceFactory.getProjectInfoDataService();
	
	@Test
	public void testGetProjectInfo(){
		ProjectInfoPO result = service.getProjectInfo("aasm");
		@SuppressWarnings("deprecation")
		ProjectInfoPO correctAnswer=new ProjectInfoPO("aasm",2133,328,13224,
				new ProjectAddressPO("https://github.com/aasm/aasm.git","https://github.com/aasm/aasm"),
				new CategoryPO("Ruby","ActiveRecord",new Date(2008,1,1)),
						new EvaluationPO(78,69,76));
		assertEquals(result,correctAnswer);
	}
	
	@Test
	public void testGetParticipantsInfo(){
		ParticipantsInfoPO result[] =service.getParticipantsInfo("aasm");
		assertEquals(result.length,81);
		assertEquals(result[0],new ParticipantsInfoPO("aasm",10000,new EvaluationPO(78,69,76)));
	}
}
