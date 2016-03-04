package vo;

import java.util.Date;

import po.CategoryPO;

public class CategoryVO {
	private String language;
	private String os;
	private Date createDate;
	
	public CategoryVO(String language, String os, Date createDate) {
		super();
		this.language = language;
		this.os = os;
		this.createDate = createDate;
	}
	
	public CategoryPO convertToPO(){
		return new CategoryPO(language,os,createDate);
	}
	
	public String getLanguage(){
		return language;
	}
	
	public String getOS(){
		return os;
	}
	
	public Date getDate(){
		return createDate;
	}
}
