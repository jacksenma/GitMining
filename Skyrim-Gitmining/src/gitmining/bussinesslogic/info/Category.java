package gitmining.bussinesslogic.info;

import java.util.Date;

import vo.CategoryVO;

public class Category {
	private String language;
	private String os;
	private Date createDate;
	
	public CategoryVO convertCategoryVO(){
		return new CategoryVO(language,os,createDate);
	}
}
