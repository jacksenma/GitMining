package gitmining.bussinesslogic.search;

public class SortByFork extends SortMethord {

	@Override
	protected int compareTo(SimpleProjectInfo info1,SimpleProjectInfo info2) {
		return info1.compareByFork(info2);
	}

}
