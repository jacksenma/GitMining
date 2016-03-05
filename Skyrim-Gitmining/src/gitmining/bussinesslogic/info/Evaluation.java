package gitmining.bussinesslogic.info;

import vo.EvaluationVO;

public class Evaluation {
	private int efficiency;
	private int quantity;
	private int total;
	
	public Evaluation(int efficiency, int quantity, int total) {
		super();
		this.efficiency = efficiency;
		this.quantity = quantity;
		this.total = total;
	}

	@SuppressWarnings("unused")
	private void calculateTotal(){
		
	}
	
	public EvaluationVO convertToVO(){		
		return new EvaluationVO(efficiency,quantity,total);		
	}
}
