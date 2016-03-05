package gitmining.bussinesslogic.search;

import myenum.SortStrategy;

public class SortFactory {
	
	public static SortMethord getMethord(SortStrategy strategy){
		switch(strategy){
		case FORK:
			break;
		case PATICIPANTS:
			break;
		case RANK:
			break;
		case STAR:
			break;
		default:
			break;
		
		}
		return null;
	}
}
