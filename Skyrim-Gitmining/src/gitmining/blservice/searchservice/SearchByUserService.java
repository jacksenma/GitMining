package gitmining.blservice.searchservice;

/**
 * 该接口不是为展示层建立的
 * @author 豆乘风
 *
 */
public interface SearchByUserService {
	/**
	 * 用于查询与输入的用户相关的项目名称
	 * @return 与输入的用户名对应的项目名称
	 */
	public String[] searchByUserName(String userName);
}
