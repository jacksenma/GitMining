package po;

import java.util.Date;

import gitmining.bussinesslogic.info.Category;

public class CategoryPO {
	private String language;
	private String os;
	private Date createDate;
	
	public CategoryPO(String language, String os, Date createDate) {
		super();
		this.language = language;
		this.os = os;
		this.createDate = createDate;
	}
	
	public Category unpack(){
		return new Category(language,os,createDate);
	}
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
