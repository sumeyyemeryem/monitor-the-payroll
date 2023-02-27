
public class FacultyMembers extends Academician {
	
	private double addCourseFee;
	private double ssBenefists;

	public FacultyMembers(String name, String registerNumber, String position, String startOfYear, String hourOfWork1,
			String hourOfWork2, String hourOfWork3, String hourOfWork4) {
		super(name, registerNumber, position, startOfYear, hourOfWork1, hourOfWork2, hourOfWork3, hourOfWork4);
	}

	public double addCourseFee() { // will calculate the additional course fee for the month 
		
		//week1
		if ((Integer.valueOf(getHourOfWork1()) - 40) < 8) {
			addCourseFee = (Integer.valueOf(getHourOfWork1()) - 40) * 20;
		}
		else if((Integer.valueOf(getHourOfWork1()) - 40) >= 8) { 
			addCourseFee = 8 * 20;
		}
		else {
			addCourseFee = 0;
		}
		
		//week2
		if ((Integer.valueOf(getHourOfWork2()) - 40) < 8) {
			addCourseFee += (Integer.valueOf(getHourOfWork2()) - 40) * 20;
		}
		else if((Integer.valueOf(getHourOfWork2()) - 40) >= 8) { 
			addCourseFee += 8 * 20;
		}
		else {
			addCourseFee += 0;
		}
		
		//week3
		if ((Integer.valueOf(getHourOfWork3()) - 40) < 8) {
			addCourseFee += (Integer.valueOf(getHourOfWork3()) - 40) * 20;
		}
		else if((Integer.valueOf(getHourOfWork3()) - 40) >= 8) { 
			addCourseFee += 8 * 20;
		}
		else {
			addCourseFee += 0;
		}
		
		//week4
		if ((Integer.valueOf(getHourOfWork4()) - 40) < 8) {
			addCourseFee += (Integer.valueOf(getHourOfWork4()) - 40) * 20;
		}
		else if((Integer.valueOf(getHourOfWork4()) - 40) >= 8) { 
			addCourseFee += 8 * 20;
		}
		else {
			addCourseFee += 0;
		}
		
		
		return addCourseFee; //monthly
	}

	@Override
	public double salaryCalculation() { // method is overridden with additional course fee and special service benefits for faculty members 
		
		ssBenefists = getBaseSalary() * 1.35;

		return super.salaryCalculation() + ssBenefists + addCourseFee();
	}
	
	

}
