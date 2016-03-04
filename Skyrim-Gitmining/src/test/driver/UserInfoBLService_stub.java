package test.driver;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import factory.InfoBLServiceFactory;
import gitmining.blservice.infoservice.UserInfoBLService;
import vo.EvaluationVO;
import vo.UserAddressVO;
import vo.UserInfoVO;

public class UserInfoBLService_stub {
	private UserInfoBLService service=InfoBLServiceFactory.getUserInfoBLService();
	
	@Test
	public void testInquireUserInfoService() {
		UserInfoVO result=service.inquireUserInfoService("TLOSP");
		@SuppressWarnings("deprecation")
		UserInfoVO correctAnswer=new UserInfoVO("TLOSP","Java",new Date(2016,3,4)
				, new EvaluationVO(90,90,90)
				,new UserAddressVO("Î÷²ý","dcf14@software.nju.edu.cn",
						"ÎÞ"));
		assertEquals(result.equals(null),false);
		assertEquals(result,correctAnswer);
	}

	@Test
	public void testGetRelatedProjectNames(){
		String[] result=service.getRelatedProjectNames("TLOSP");
		String[] correctAnswer=new String[]{"ThreeBody","SkyRim","GitMining"};
		assertEquals(result.equals(null),false);
		assertEquals(result.length,correctAnswer.length);
		boolean equal=true;
		for(int x=0;x<result.length;x++){
			if(!result[x].equals(correctAnswer[x])){
				equal=false;
				break;
			}
		}
		assertEquals(equal,true);
	}
	
}
