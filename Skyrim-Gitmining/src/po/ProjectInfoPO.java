package po;

public class ProjectInfoPO {
	private String projectName;
	private int starNum;
	private int forksNum;
	private int codeSize;
	private ProjectAddressPO projectAddress;
	private CategoryPO category;
	private EvaluationPO evaluation;
	
	public ProjectInfoPO(String projectName, int starNum, int forksNum, int codeSize, ProjectAddressPO projectAddress,
			CategoryPO category, EvaluationPO evaluation) {
		super();
		this.projectName = projectName;
		this.starNum = starNum;
		this.forksNum = forksNum;
		this.codeSize = codeSize;
		this.projectAddress = projectAddress;
		this.category = category;
		this.evaluation = evaluation;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getStarNum() {
		return starNum;
	}

	public void setStarNum(int starNum) {
		this.starNum = starNum;
	}

	public int getForksNum() {
		return forksNum;
	}

	public void setForksNum(int forksNum) {
		this.forksNum = forksNum;
	}

	public int getCodeSize() {
		return codeSize;
	}

	public void setCodeSize(int codeSize) {
		this.codeSize = codeSize;
	}

	public ProjectAddressPO getProjectAddress() {
		return projectAddress;
	}

	public void setProjectAddress(ProjectAddressPO projectAddress) {
		this.projectAddress = projectAddress;
	}

	public CategoryPO getCategory() {
		return category;
	}

	public void setCategory(CategoryPO category) {
		this.category = category;
	}

	public EvaluationPO getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(EvaluationPO evaluation) {
		this.evaluation = evaluation;
	}
	
	
}
