package gitmining.blservice.infoservice;

import vo.UserInfoVO;

public interface UserInfoBLService {
	/**
	 * 用于查询知道用户名的用户信息
	 * @param userName 用户名
	 * @return 用户信息
	 */
	public UserInfoVO inquireUserInfoService(String userName);
	
	/**
	 * 用于查询用户参与过的项目名字
	 * @param userName 用户姓名
	 * @return 项目名称
	 */
	public String[] getRelatedProjectNames(String userName);
}
