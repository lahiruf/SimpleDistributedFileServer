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
		//file,ip,port,added,last,count
		return arr[0]+"\t"+arr[1]+"\t"+[arr[2]+"\t"+arr[3]+"\t"+arr[4];
	}
	private static void deleteClientEntries(String cliIp,String port){
		FileReader db = new FileReader("files.db");
		BufferedReader db_r =new BufferedReader(db);
		//remove tmp
		FileWriter tmp =new FileWriter("tmp.db");
		BufferedWriter tmp_w=new BufferedReader(tmp);
		String line;
		while((line=db_r.readLine())!=null){
			String array[]= arg.split("\t");
			if(arr[1].equals(ip) && arr[2].equals(port)){
				continue;
			}
			else{
				tmp_w.writeLine(line);
			}
		}
		db.close();
		tmp.close();
		//copy contents of tmp to db
		//remove tmp
		
	}
}