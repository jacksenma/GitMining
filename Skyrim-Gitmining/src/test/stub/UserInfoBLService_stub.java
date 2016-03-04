package test.stub;

import java.util.Date;

import gitmining.blservice.infoservice.UserInfoBLService;
import vo.EvaluationVO;
import vo.UserAddressVO;
import vo.UserInfoVO;

public class UserInfoBLService_stub implements UserInfoBLService{

	@SuppressWarnings("deprecation")
	@Override
	public UserInfoVO inquireUserInfoService(String userName) {
		// TODO Auto-generated method stub
		if(userName.equals("TLOSP")){
			return new UserInfoVO("TLOSP","Java",new Date(2016,3,4)
					, new EvaluationVO(90,90,90)
					,new UserAddressVO("Î÷²ý","dcf14@software.nju.edu.cn",
							"ÎÞ"));
		}
		return null;
	}

	@Override
	public String[] getRelatedProjectNames(String userName) {
		// TODO Auto-generated method stub
		if(userName.equals("TLOSP"))
		return new String[]{"ThreeBody","SkyRim","GitMining"};
		return null;
	}

}
