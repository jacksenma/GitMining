package gitmining.bussinesslogic.search;

public interface SearchByUserService {
	/**
	 * 用于查询与输入的用户相关的项目名称
	 * @return 与输入的用户名对应的项目名称
	 */
	public String[] searchByUserName(String userName);
}
