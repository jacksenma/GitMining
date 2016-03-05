package gitmining.data.python_access;

import org.python.core.PyFunction;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class InfoReader {
	private String[] resultList;
	
	public String[] getAllProjectAndOwnerInfo(){
		 if(resultList!=null){
			 return this.stringCopy();
		 }
		 @SuppressWarnings("resource")
		 PythonInterpreter interpreter = new PythonInterpreter();
		 interpreter.execfile("GitminingAPIReader/src/InfoReader.py");
		 PyFunction func=interpreter.get("getInfoList",PyFunction.class);
		 PyObject pyobj=func.__call__();
		 String str=pyobj.toString();
		 resultList=str.split(",");
		 if(resultList.length==0){
			 return null;
		 }
		 resultList[0]=resultList[0].substring(2,resultList[0].length()-1);
		 for(int x=1;x<resultList.length-1;x++){
			resultList[x]=resultList[x].substring(1,resultList[x].length()-1);
		 }
		 if(resultList.length==1){
			 return null;
		 }
		 resultList[resultList.length-1]=resultList[resultList.length-1].
				 substring(1,resultList[resultList.length-1].length()-2);
		 return this.stringCopy();
	}
	
	private String[] stringCopy(){
		String copyStr[]=new String[this.resultList.length];
		System.arraycopy(this.resultList,0,copyStr,0,resultList.length);
		return copyStr;
	}
}
