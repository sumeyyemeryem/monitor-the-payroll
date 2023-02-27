
public class Worker extends Personnel { //Full-Time Employee
	
	private double overWorkSalary;
	
	
	public Worker(String name, String registerNumber, String position, String startOfYear, String hourOfWork1,
			String hourOfWork2, String hourOfWork3, String hourOfWork4) {
		super(name, registerNumber, position, startOfYear, hourOfWork1, hourOfWork2, hourOfWork3, hourOfWork4);
	}

	
	public double overWorkSalary() { // will calculate the over work salary for the month
		
		//week1
		if ((Integer.valueOf(getHourOfWork1()) - 40) < 10) {
			overWorkSalary = (Integer.valueOf(getHourOfWork1()) - 40) * 11;
		}
		else if((Integer.valueOf(getHourOfWork1()) - 40) >= 10) { 
			overWorkSalary = 10 * 11;
		}
		else {
			overWorkSalary = 0;
		}
		
		//week2
		if ((Integer.valueOf(getHourOfWork2()) - 40) < 10) {
			overWorkSalary += (Integer.valueOf(getHourOfWork2()) - 40) * 11;
		}
		else if((Integer.valueOf(getHourOfWork2()) - 40) >= 10) { 
			overWorkSalary += 10 * 11;
		}
		else {
			overWorkSalary += 0;
		}
		
		//week3
		if ((Integer.valueOf(getHourOfWork3()) - 40) < 10) {
			overWorkSalary += (Integer.valueOf(getHourOfWork3()) - 40) * 11;
		}
		else if((Integer.valueOf(getHourOfWork3()) - 40) >= 10) { 
			overWorkSalary += 10 * 11;
		}
		else {
			overWorkSalary += 0;
		}
		
		//week4
		if ((Integer.valueOf(getHourOfWork4()) - 40) < 10) {
			overWorkSalary += (Integer.valueOf(getHourOfWork4()) - 40) * 11;
		}
		else if((Integer.valueOf(getHourOfWork4()) - 40) >= 10) { 
			overWorkSalary += 10 * 11;
		}
		else {
			overWorkSalary += 0;
		}
		
		
		return overWorkSalary; //monthly
		
	}


	@Override
	public double salaryCalculation() { // method is overridden with monthly salary which is earned from working days and over work salary, for workers
		
		double dayOfWorkSalary = 105 * 20;
		
		return super.salaryCalculation() + dayOfWorkSalary + overWorkSalary() ;
	}





}
