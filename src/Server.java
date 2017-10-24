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
		return "";
	}
}