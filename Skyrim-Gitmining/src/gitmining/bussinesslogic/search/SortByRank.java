package gitmining.bussinesslogic.search;

public class SortByRank extends SortMethord {

	@Override
	protected int compareTo(SimpleProjectInfo info1,SimpleProjectInfo info2) {
		return info1.compareByRank(info2);
	}

}
