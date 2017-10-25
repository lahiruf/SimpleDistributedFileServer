import java.util.*;
import java.lang.*;
import java.lang.Integer;
class Server{

	public static void main(String args[]){
		
	}
	private static String getTime(){
		Date date=new Date();
		return date.toString();
	}
	private static String updateRecord(String arg){
		String array[]= arg.split("\t");
		array[4]=new Integer((int)new Integer(array[4])+1).toString();
		array[3]=getTime();
		return arr[0]+"\t"+arr[1]+"\t"+[arr[2]+"\t"+arr[3]+"\t"+arr[4];
	}
}