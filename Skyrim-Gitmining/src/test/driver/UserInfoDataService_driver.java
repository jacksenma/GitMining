package test.driver;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import factory.InfoDataServiceFactory;
import gitmining.dataservice.infodataservice.UserInfoDataService;
import po.EvaluationPO;
import po.UserAddressPO;
import po.UserInfoPO;

public class UserInfoDataService_driver {
      private UserInfoDataService service = InfoDataServiceFactory.getUserInfoDataService();
      
      @Test
      public void testGetUserInfoDataService(){
    	  UserInfoPO result = service.getUserInfoDataService("TLOSP");
    	  @SuppressWarnings("deprecation")
    	  UserInfoPO correctAnswer = new UserInfoPO("TLOSP","Java",new Date(2016,3,4)
    			  ,new UserAddressPO("Î÷²ý","dcf14@software.nju.edu.cn",
    						"ÎÞ"), new EvaluationPO(90,90,90)
  				);
    	  assertEquals(result.equals(null),false);
  		assertEquals(result,correctAnswer);
      }
}
