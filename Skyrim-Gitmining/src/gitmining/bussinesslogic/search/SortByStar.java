package gitmining.bussinesslogic.search;

public class SortByStar extends SortMethord {

	@Override
	protected int compareTo(SimpleProjectInfo info1,SimpleProjectInfo info2) {
		return info1.compareByStar(info2);
	}

}
