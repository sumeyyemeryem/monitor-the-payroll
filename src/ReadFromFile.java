import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadFromFile {
	
	public static String[] readFile(String path) {
		try {
		int i = 0;
		int length = Files.readAllLines(Paths.get(path)).size();
		String[] results = new String[length];
			for (String line : Files.readAllLines(Paths.get(path))) {
			    results[i++] = line;
			    }
		return results;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void splitInto(String[] personnelList, String[] monitoringList) throws FileNotFoundException, UnsupportedEncodingException { /**after reading the texts method will split the given personnel 
	                                                                                                                                    and monitoring strings and will use the informations 
	                                                                                                                                    to create the related objects*/	
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> registerNumbers = new ArrayList<String>();
		ArrayList<String> positions = new ArrayList<String>();
		ArrayList<String> startYears = new ArrayList<String>();
		
		for (String line : personnelList) { //creating personnel's list of names, register numbers, positions and start years
			
			String[] personnel = line.split("	");
			names.add(personnel[0]);
			registerNumbers.add(personnel[1]);
			positions.add(personnel[2]);
			startYears.add(personnel[3]);
		}
		
		ArrayList<String> week1 = new ArrayList<String>();
		ArrayList<String> week2 = new ArrayList<String>();
		ArrayList<String> week3 = new ArrayList<String>();
		ArrayList<String> week4 = new ArrayList<String>();
		
		for (String lines : monitoringList) { //personnel's weekly working hours
			
			String[] monitoring = lines.split("	");
			week1.add(monitoring[1]);
			week2.add(monitoring[2]);
			week3.add(monitoring[3]);
			week4.add(monitoring[4]);
		}
		
		for (int j = 0; j < positions.size(); j++) {
			if (registerNumbers.get(j).startsWith("F")) { //faculty member
				FacultyMembers facultyMember = new FacultyMembers(names.get(j), registerNumbers.get(j), positions.get(j), startYears.get(j), week1.get(j), week2.get(j), week3.get(j), week4.get(j));
				facultyMember.writingToFile();
			}
			if (registerNumbers.get(j).startsWith("R")) { //research assistant
				ResearchAsistants researchAssistants = new ResearchAsistants(names.get(j), registerNumbers.get(j), positions.get(j), startYears.get(j), week1.get(j), week2.get(j), week3.get(j), week4.get(j));
				researchAssistants.writingToFile();
			}
			
			if (registerNumbers.get(j).startsWith("W")){ //worker
				Worker worker = new Worker(names.get(j), registerNumbers.get(j), positions.get(j), startYears.get(j), week1.get(j), week2.get(j), week3.get(j), week4.get(j));
				worker.writingToFile();
			}
			
			if (registerNumbers.get(j).startsWith("C")){ //chief
				Chief chief = new Chief(names.get(j), registerNumbers.get(j), positions.get(j), startYears.get(j), week1.get(j), week2.get(j), week3.get(j), week4.get(j));
				chief.writingToFile();
			}
						
			if (registerNumbers.get(j).startsWith("O")) { //officer
				Officer officer = new Officer(names.get(j), registerNumbers.get(j), positions.get(j), startYears.get(j), week1.get(j), week2.get(j), week3.get(j), week4.get(j));
				officer.writingToFile();
			}
			
			if (registerNumbers.get(j).startsWith("S")) { //security
				Security security = new Security(names.get(j), registerNumbers.get(j), positions.get(j), startYears.get(j), week1.get(j), week2.get(j), week3.get(j), week4.get(j));
				security.writingToFile();
			}

			if (registerNumbers.get(j).startsWith("P")) { //part-time employee
				PartTimeEmployee partTimeEmployee = new PartTimeEmployee(names.get(j), registerNumbers.get(j), positions.get(j), startYears.get(j), week1.get(j), week2.get(j), week3.get(j), week4.get(j));
				partTimeEmployee.writingToFile();
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
 