package gitmining.bussinesslogic.search;

public class SortByContributorNum extends SortMethord{
	
	@Override
	protected int compareTo(SimpleProjectInfo info1,SimpleProjectInfo info2) {
		return info1.compareByContributor(info2);
	}
}
