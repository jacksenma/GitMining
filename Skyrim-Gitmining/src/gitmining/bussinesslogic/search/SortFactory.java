package gitmining.bussinesslogic.search;

import error.ErroSortException;

public class SortFactory {
	
	public SortStrategy getStrategy(String kinds) throws ErroSortException{
		switch(kinds){
			case "综合排名":
				return new SortByRank();
			case "关注度排名":
				return new SortByStar();
			case "下载量排名":
				return new SortByFork();
			case "参与者排名":
				return new SortByPaticipantsNum();
			default:
				throw new ErroSortException();
		}
		
	}
}
