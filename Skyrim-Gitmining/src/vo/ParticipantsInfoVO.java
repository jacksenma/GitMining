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
	
	
}
