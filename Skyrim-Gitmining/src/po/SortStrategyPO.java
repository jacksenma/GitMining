package po;

import myenum.SortStrategy;

public class SortStrategyPO {
	
	private SortStrategy strategy;
	
	public SortStrategyPO(SortStrategy strategy){
		this.setStrategy(strategy);
	}

	public SortStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}
	
	
}
