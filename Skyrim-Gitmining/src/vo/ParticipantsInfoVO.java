package vo;

public class ParticipantsInfoVO {
	private String name;
	private int contribute;
	private EvaluationVO evaluation;
	
	public ParticipantsInfoVO(String name, int contribute, EvaluationVO evaluation) {
		super();
		this.name = name;
		this.contribute = contribute;
		this.evaluation = evaluation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContribute() {
		return contribute;
	}

	public void setContribute(int contribute) {
		this.contribute = contribute;
	}

	public EvaluationVO getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(EvaluationVO evaluation) {
		this.evaluation = evaluation;
	}
	
	
}
