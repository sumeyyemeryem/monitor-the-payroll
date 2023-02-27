import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Personnel {

	//TOP MOST BASE CLASS

	private String name;
	private String registerNumber;
	private String position;
	private String startOfYear;
	private String hourOfWork1;
	private String hourOfWork2;
	private String hourOfWork3;
	private String hourOfWork4;

	public Personnel(String name, String registerNumber, String position, String startOfYear, String hourOfWork1, 
			String hourOfWork2, String hourOfWork3, String hourOfWork4) { 
		this.name = name;
		this.registerNumber = registerNumber;
		this.position = position;
		this.startOfYear = startOfYear;
		this.hourOfWork1 = hourOfWork1;
		this.hourOfWork2 = hourOfWork2;
		this.hourOfWork3 = hourOfWork3;
		this.hourOfWork4 = hourOfWork4;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}
	
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}

	public String getStartOfYear() {
		return startOfYear;
	}

	public void setStartOfYear(String startOfYear) {
		this.startOfYear = startOfYear;
	}

	public String getHourOfWork1() {
		return hourOfWork1;
	}

	public void setHourOfWork1(String hourOfWork1) {
		this.hourOfWork1 = hourOfWork1;
	}

	public String getHourOfWork2() {
		return hourOfWork2;
	}

	public void setHourOfWork2(String hourOfWork2) {
		this.hourOfWork2 = hourOfWork2;
	}

	public String getHourOfWork3() {
		return hourOfWork3;
	}

	public void setHourOfWork3(String hourOfWork3) {
		this.hourOfWork3 = hourOfWork3;
	}

	public String getHourOfWork4() {
		return hourOfWork4;
	}

	public void setHourOfWork4(String hourOfWork4) {
		this.hourOfWork4 = hourOfWork4;
	}

	public double salaryCalculation() { // with each calling, method will calculate and return the severance pay which is common for every personnel
		
		return (2020 - Integer.valueOf(startOfYear)) * 20 * 0.8;
		 
	}
	
	public void writingToFile() throws FileNotFoundException, UnsupportedEncodingException { // with each calling method will write the informations about the each personnel to the different text files
		
		PrintWriter writer = new PrintWriter(String.format("%s.txt", getRegisterNumber()), "UTF-8");
		String[] name = getName().split(" ");
		String Name = name[0];
		String Surname = name[1];
		
		writer.println("Name: " + Name );
		writer.println("Surname: " + Surname );
		writer.println("Registration Number: " + getRegisterNumber());
		writer.println("Position: " + getPosition());
		writer.println("Year of Start: " + getStartOfYear());
		writer.println("Total Salary: " + String.format("%.2f",salaryCalculation()) + " TL");
		
		writer.close();
	}

}
