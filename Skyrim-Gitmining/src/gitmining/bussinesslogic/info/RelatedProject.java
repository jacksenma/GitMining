package gitmining.bussinesslogic.info;

import gitmining.bussinesslogic.search.SearchByUserService;

public class RelatedProject {
	private String userName;
	private SearchByUserService service;
	private String projectName[]=null;
	
	private void getRelatedProjectName(){
		this.projectName=service.searchByUserName(userName);
	}
	
	public String[] getRelatedProject(){
		if(projectName==null){
			this.getRelatedProjectName();
		}
		return this.projectName;
	}
	
	public RelatedProject(String userName){
		this.userName=userName;
	}
}
