package gitmining.bussinesslogic.info;

import vo.ParticipantsInfoVO;
import vo.ProjectInfoVO;

public class ProjectInfo {
	private String projectName;
	private int starNum;
	private int forksNum;
	private int codeSize;
	private ProjectAddress projectAddress;
	private Category category;
	private Evaluation  evaluation;
	private ParticipantsInfo participantsInfo[];
	
	public void setProjectName(String projectName){
		if(projectName!=null&&projectName.equals(this.projectName)){
			return;
		}
		this.projectName=projectName;
		this.inquireProjectInfo();
	}
	
	public ProjectInfoVO convertToVO(){
		return null;
		
	}
	
	private void inquireProjectInfo(){
		
	}
	
	public ParticipantsInfoVO[] getPaticipantsInfo(){
		ParticipantsInfoVO voList[]=new ParticipantsInfoVO[participantsInfo.length];
		for(int x=0;x<participantsInfo.length;x++){
			voList[x]=participantsInfo[x].converToVO();
		}
		return voList;
	}
}
