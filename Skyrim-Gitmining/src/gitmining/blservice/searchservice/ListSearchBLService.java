package gitmining.blservice.searchservice;

import error.ErroSortException;
import vo.CategoryVO;

public interface ListSearchBLService {
	/**
	 * 按照排名查询项目
	 * @param kinds 排名种类
	 * @return 项目名称
	 * @throws ErroSortException 输入了错误的排名方式
	 */
	public String[] searchBySort(String kinds) throws ErroSortException;
	
	/**
	 * 分类搜索
	 * @param vo 项目类型
	 * @return 项目名称
	 */
	public String[] searchByClass(CategoryVO vo);
}
