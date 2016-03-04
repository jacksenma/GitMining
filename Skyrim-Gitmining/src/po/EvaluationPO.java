package po;

public class EvaluationPO {
	private int efficiency;
	private int quantity;
	private int total;
	
	public EvaluationPO(int efficiency, int quantity, int total) {
		super();
		this.efficiency = efficiency;
		this.quantity = quantity;
		this.total = total;
	}
	
	public int getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
