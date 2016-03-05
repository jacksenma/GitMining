package gitmining.bussinesslogic.search;

public class SimpleProjectInfo {
	private String projectName;
	private int rank;
	private int fork;
	private int star;
	private int contributorNum;
	
	
	public int compareByRank(SimpleProjectInfo info){
		if(info.getRank()==rank) return 0;
		else if(info.getRank()>rank) return -1;
		else return 1;
	}
	
	public int compareByFork(SimpleProjectInfo info){
		if(info.getFork()==rank) return 0;
		else if(info.getFork()>rank) return -1;
		else return 1;
	}
	
	public int compareByStar(SimpleProjectInfo info){
		if(info.getStar()==rank) return 0;
		else if(info.getStar()>rank) return -1;
		else return 1;
	}
	
	public int compareByContributor(SimpleProjectInfo info){
		if(info.getContributor()==rank) return 0;
		else if(info.getContributor()>rank) return -1;
		else return 1;
	}
	
	
	public SimpleProjectInfo(String projectName, int rank, int fork, int star, int contributor) {
		super();
		this.projectName = projectName;
		this.rank = rank;
		this.fork = fork;
		this.star = star;
		this.contributorNum = contributor;
	}

	
	public String getProjectName() {
		return projectName;
	}
	
	public int getRank() {
		return rank;
	}

	public int getFork() {
		return fork;
	}

	public int getStar() {
		return star;
	}

	public int getContributor() {
		return contributorNum;
	}

}
