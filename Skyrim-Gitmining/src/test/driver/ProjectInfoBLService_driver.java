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
		System.out.println(result==null);
		System.out.println(result.getCodeSize());
		@SuppressWarnings("deprecation")
		ProjectInfoVO correctAnswer=new ProjectInfoVO("ThreeBody", 10, 10, 10000,
				new ProjectAddressVO("*****.git","*****.com"),
				new CategoryVO("Java","Windows",new Date(2016,3,4)),
				new EvaluationVO(100,100,100));
		assertEquals(this.myEquals(result, correctAnswer),true);
	}
	
	private boolean myEquals(ProjectInfoVO v1,ProjectInfoVO v2){
		if(!v1.getProjectName().equals(v2.getProjectName())){
			return false;
		}
		System.out.println("pass");

		if(v1.getCodeSize()!=v2.getCodeSize()){
			return false;
		}
		System.out.println("pass");
		if(v1.getStarNum()!=v2.getStarNum()){
			return false;
		}
		System.out.println("pass");
		if(v1.getForksNum()!=v2.getForksNum()){
			return false;
		}
		System.out.println("pass");
		return true;
	}
	@Test
	public void testGetParticipantsInfo(){
		ParticipantsInfoVO result[]=service.getParticipantsInfo("ThreeBody");
		assertEquals(result.length,1);
		assertEquals(result[0],new ParticipantsInfoVO("TLOSP", 10000, 
				new EvaluationVO(100,100,100)));
	}
}
