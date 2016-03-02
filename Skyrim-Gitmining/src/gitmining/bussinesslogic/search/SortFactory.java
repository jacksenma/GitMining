package gitmining.bussinesslogic.search;

import error.ErroSortException;

public class SortFactory {
	
	public SortStrategy getStrategy(String kinds) throws ErroSortException{
		switch(kinds){
			case "�ۺ�����":
				return new SortByRank();
			case "��ע������":
				return new SortByStar();
			case "����������":
				return new SortByFork();
			case "����������":
				return new SortByPaticipantsNum();
			default:
				throw new ErroSortException();
		}
		
	}
}
