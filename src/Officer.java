
public class Officer extends Personnel {
	
	private double baseSalary = 2600;
	private double overWorkSalary;
	
	public Officer(String name, String registerNumber, String position, String startOfYear, String hourOfWork1,
			String hourOfWork2, String hourOfWork3, String hourOfWork4) {
		super(name, registerNumber, position, startOfYear, hourOfWork1, hourOfWork2, hourOfWork3, hourOfWork4);
		
	}

	public double overWorkSalary() { // will calculate the over work salary for the month 
		
		//week1
		if ((Integer.valueOf(getHourOfWork1()) - 40) < 10) {
			overWorkSalary = (Integer.valueOf(getHourOfWork1()) - 40) * 20;
		}
		else if((Integer.valueOf(getHourOfWork1()) - 40) >= 10) { 
			overWorkSalary = 10 * 20;
		}
		else {
			overWorkSalary = 0;
		}
		
		//week2
		if ((Integer.valueOf(getHourOfWork2()) - 40) < 10) {
			overWorkSalary += (Integer.valueOf(getHourOfWork2()) - 40) * 20;
		}
		else if((Integer.valueOf(getHourOfWork2()) - 40) >= 10) { 
			overWorkSalary += 10 * 20;
		}
		else {
			overWorkSalary += 0;
		}
		
		//week3
		if ((Integer.valueOf(getHourOfWork3()) - 40) < 10) {
			overWorkSalary += (Integer.valueOf(getHourOfWork3()) - 40) * 20;
		}
		else if((Integer.valueOf(getHourOfWork3()) - 40) >= 10) { 
			overWorkSalary += 10 * 20;
		}
		else {
			overWorkSalary += 0;
		}
		
		//week4
		if ((Integer.valueOf(getHourOfWork4()) - 40) < 10) {
			overWorkSalary += (Integer.valueOf(getHourOfWork4()) - 40) * 20;
		}
		else if((Integer.valueOf(getHourOfWork4()) - 40) >= 10) { 
			overWorkSalary += 10 * 20;
		}
		else {
			overWorkSalary += 0;
		}
		
		return overWorkSalary; //monthly
	}

	@Override
	public double salaryCalculation() { // method is overridden with over work salary and special service benefits for officers 

		double ssBenefits = baseSalary * 0.65;

		return super.salaryCalculation() + baseSalary + ssBenefits + overWorkSalary();
	}
	
	


	
	

}
