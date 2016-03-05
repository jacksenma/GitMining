package gitmining.bussinesslogic.info;

import factory.InfoDataServiceFactory;
import gitmining.dataservice.infodataservice.ProjectInfoDataService;
import po.ProjectInfoPO;
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
	private ProjectInfoDataService service=InfoDataServiceFactory.getProjectInfoDataService();
	
	public void setProjectName(String projectName){
		if(projectName!=null&&projectName.equals(this.projectName)){
			return;
		}
		this.projectName=projectName;
		this.inquireProjectInfo();
	}
	
	public ProjectInfoVO convertToVO(){
		return new ProjectInfoVO(projectName,starNum,forksNum,codeSize,
				projectAddress.converToVO(),category.convertCategoryVO(),
				evaluation.convertToVO());
		
	}
	
	private void inquireProjectInfo(){
		ProjectInfoPO po=service.getProjectInfo(projectName);
		this.starNum=po.getStarNum();
		System.out.println("starNum:"+starNum);
		this.forksNum=po.getForksNum();
		this.codeSize=po.getCodeSize();
		this.projectAddress=po.getProjectAddress().unpack();
		this.evaluation=po.getEvaluation().unpack();
		this.category=po.getCategory().unpack();
	}
	
	public ParticipantsInfoVO[] getPaticipantsInfo(){
		ParticipantsInfoVO voList[]=new ParticipantsInfoVO[participantsInfo.length];
		for(int x=0;x<participantsInfo.length;x++){
			voList[x]=participantsInfo[x].converToVO();
		}
		return voList;
	}
}
