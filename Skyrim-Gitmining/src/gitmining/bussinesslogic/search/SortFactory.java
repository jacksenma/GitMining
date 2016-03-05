package gitmining.bussinesslogic.search;

import myenum.SortStrategy;

public class SortFactory {
	
	public static SortMethord getMethord(SortStrategy strategy){
		switch(strategy){
		case FORK:
			return new SortByFork();
		case PATICIPANTS:
			return new SortByContributorNum();
		case RANK:
			return new SortByRank();
		case STAR:
			return new SortByStar();
		default:
			break;
		
		}
		return null;
	}
}
