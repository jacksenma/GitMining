package po;

import gitmining.bussinesslogic.search.SimpleProjectInfo;

public class SimpleProjectInfoPO {

	private String projectName;
	private int rank;
	private int fork;
	private int star;
	private int contributorNum;
	
	public SimpleProjectInfoPO(String projectName, int rank, int fork, int star, int contributorNum) {
		super();
		this.projectName = projectName;
		this.rank = rank;
		this.fork = fork;
		this.star = star;
		this.contributorNum = contributorNum;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getFork() {
		return fork;
	}

	public void setFork(int fork) {
		this.fork = fork;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public int getContributorNum() {
		return contributorNum;
	}

	public void setContributorNum(int contributorNum) {
		this.contributorNum = contributorNum;
	}

	public SimpleProjectInfo unpack(){
		return new SimpleProjectInfo(projectName, rank, fork, star, contributorNum);
	}
	
}
