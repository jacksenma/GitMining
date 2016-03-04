package vo;

public class ProjectInfoVO {
	private String projectName;
	private int starNum;
	private int forksNum;
	private int codeSize;
	private ProjectAddressVO projectAddress;
	private CategoryVO category;
	private EvaluationVO  evaluation;
	
	public ProjectInfoVO(String projectName, int starNum, int forksNum, int codeSize, ProjectAddressVO projectAddress,
			CategoryVO category, EvaluationVO evaluation) {
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

	public ProjectAddressVO getProjectAddress() {
		return projectAddress;
	}

	public void setProjectAddress(ProjectAddressVO projectAddress) {
		this.projectAddress = projectAddress;
	}

	public CategoryVO getCategory() {
		return category;
	}

	public void setCategory(CategoryVO category) {
		this.category = category;
	}

	public EvaluationVO getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(EvaluationVO evaluation) {
		this.evaluation = evaluation;
	}
	
	
}
