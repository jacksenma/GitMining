package gitmining.bussinesslogic.info;

import vo.ParticipantsInfoVO;

public class ParticipantsInfo {
	private String name;
	private int contribute;
	private Evaluation evaluation;
	
	public ParticipantsInfoVO converToVO(){
		return new ParticipantsInfoVO(name,contribute,evaluation.convertToVO());
	}
}
