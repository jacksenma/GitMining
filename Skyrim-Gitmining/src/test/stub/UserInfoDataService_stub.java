package test.stub;

import java.util.Date;

import gitmining.dataservice.infodataservice.UserInfoDataService;
import po.EvaluationPO;
import po.UserAddressPO;
import po.UserInfoPO;

public class UserInfoDataService_stub implements UserInfoDataService{

	@SuppressWarnings("deprecation")
	@Override
	public UserInfoPO getUserInfoDataService(String userName) {
		// TODO Auto-generated method stub
		if(userName.equals("TLOSP")){
			return new UserInfoPO(userName, "Java", new Date(2016,3,4)
					,new UserAddressPO("Î÷²ý","dcf14@software.nju.edu.cn",
							"ÎÞ")
					,new EvaluationPO(90,90,90));
		}
		return null;
	}

}
