package po;

public class ParticipantsInfoPO {
	private String name;
	private int contribute;
	private EvaluationPO evaluation;
	
	public ParticipantsInfoPO(String name, int contribute, EvaluationPO evaluation) {
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

	public EvaluationPO getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(EvaluationPO evaluation) {
		this.evaluation = evaluation;
	}
	
	
}
