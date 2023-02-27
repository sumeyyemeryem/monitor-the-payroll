import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		String  a = args[0];
		String  b = args[1];
		ReadFromFile reading = new ReadFromFile();
		String[] personnelList = reading.readFile(a);
		String[] monitoringList = reading.readFile(b);
		
		reading.splitInto(personnelList, monitoringList); /**splits the texts into the arrays and uses this 
		                                                     informations in arrays to create objects, then calls the necessary methods*/

	}

}
