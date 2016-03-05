package gitmining.bussinesslogic.search;

abstract public class SortMethord {
	
	protected int compareTo(SimpleProjectInfo info1,SimpleProjectInfo info2) {
		return 0;
	}
	
	public String[] excute(SimpleProjectInfo infoList[]){
		this.sortIt(infoList);
		String[] projectName=new String[infoList.length];
		for(int x=0;x<projectName.length;x++){
			projectName[x]=infoList[x].getProjectName();
		}
		return projectName;
	}
	
	private void sortIt(SimpleProjectInfo infoList[]){
		this.quickSort(infoList,0, infoList.length-1);
	}
	
	private void quickSort(SimpleProjectInfo infoList[],int start,int end){
		if(start<end){
			SimpleProjectInfo pivot=median3(infoList,start,end);
		
			int i=start,j=end-1;
		
			while(true){
				while(compareTo(infoList[++i],pivot)<0){}
				while(compareTo(infoList[--j],pivot)>0){}
				if(i<j)
					this.swapReferences(infoList, i, j);
				else
					break;
			}
			
			this.swapReferences(infoList, i, end-1);
			
			this.quickSort(infoList, start, i-1);
			this.quickSort(infoList,i+1, end);
		}
	}
	
	private SimpleProjectInfo median3(SimpleProjectInfo infoList[],int left,int right){
		int center=(left+right)/2;
		if(compareTo(infoList[center],infoList[left])<0){
			this.swapReferences(infoList, left, center);
		}
		
		if(compareTo(infoList[right],infoList[left])<0){
			this.swapReferences(infoList, left, right);
		}
		
		if(compareTo(infoList[right],infoList[center])<0){
			this.swapReferences(infoList, center, right);
		}
		
		this.swapReferences(infoList, center, right-1);
		return infoList[right-1];
	}
	
	private void swapReferences(SimpleProjectInfo[] infoList,int position1,int position2){
		SimpleProjectInfo temp=infoList[position1];
		infoList[position1]=infoList[position2];
		infoList[position2]=temp;
	}
	
	
}
