
public class PartTimeEmployee extends Personnel {
	
	private double hourOfWorkSalary;

	public PartTimeEmployee(String name, String registerNumber, String position, String startOfYear, String hourOfWork1,
			String hourOfWork2, String hourOfWork3, String hourOfWork4) {
		super(name, registerNumber, position, startOfYear, hourOfWork1, hourOfWork2, hourOfWork3, hourOfWork4);
	} 
	
	public double hourOfWorkSalary() { // will calculate the monthly salary according to hour of work
		
		//week1
		if (Integer.valueOf(getHourOfWork1()) >= 10) {
			hourOfWorkSalary = Integer.valueOf(getHourOfWork1()) * 18;
		}
		else {
			hourOfWorkSalary = 0;
		}
		
		//week2
		if (Integer.valueOf(getHourOfWork2()) >= 10) {
			hourOfWorkSalary += Integer.valueOf(getHourOfWork2())* 18;
		}
		else {
			hourOfWorkSalary += 0;
		}
		
		//week3
		if (Integer.valueOf(getHourOfWork3()) >= 10) {
			hourOfWorkSalary += Integer.valueOf(getHourOfWork3()) * 18;
		}
		else {
			hourOfWorkSalary += 0;
		}
		
		//week4
		if (Integer.valueOf(getHourOfWork4()) >= 10) {
			hourOfWorkSalary += Integer.valueOf(getHourOfWork4()) * 18;
		}
		else {
			hourOfWorkSalary += 0;
		}
		
		
		return hourOfWorkSalary; //monthly
	}

	@Override
	public double salaryCalculation() { // method is overridden with monthly salary which is earned from hour of work in a month for part time employees
		
		return super.salaryCalculation() + hourOfWorkSalary();
	}
	
	

}
