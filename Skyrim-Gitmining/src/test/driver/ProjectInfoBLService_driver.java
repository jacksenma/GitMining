package test.driver;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import factory.InfoBLServiceFactory;
import gitmining.blservice.infoservice.ProjectInfoBLService;
import vo.CategoryVO;
import vo.EvaluationVO;
import vo.ParticipantsInfoVO;
import vo.ProjectAddressVO;
import vo.ProjectInfoVO;

public class ProjectInfoBLService_driver {
	private ProjectInfoBLService service=InfoBLServiceFactory.getProjectInfoBLService();
	
	@Test
	public void testInquireProjectInfo(){
		ProjectInfoVO result=service.inquireProjectInfo("ThreeBody");
		@SuppressWarnings("deprecation")
		ProjectInfoVO correctAnswer=new ProjectInfoVO("ThreeBody", 10, 10, 10000,
				new ProjectAddressVO("*****.git","*****.com"),
				new CategoryVO("Java","Windows",new Date(2016,3,4)),
				new EvaluationVO(100,100,100));
		assertEquals(result,correctAnswer);
	}
	
	@Test
	public void testGetParticipantsInfo(){
		ParticipantsInfoVO result[]=service.getParticipantsInfo("ThreeBody");
		assertEquals(result.length,1);
		assertEquals(result[0],new ParticipantsInfoVO("TLOSP", 10000, 
				new EvaluationVO(100,100,100)));
	}
}
