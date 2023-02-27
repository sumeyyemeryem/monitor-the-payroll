
public class Security extends Personnel {
	
	private double transMoney = 5 * 6;
	private double foodMoney = 10 * 6;
	private double hourOfWorkSalary;

	public Security(String name, String registerNumber, String position, String startOfYear, String hourOfWork1,
			String hourOfWork2, String hourOfWork3, String hourOfWork4) {
		super(name, registerNumber, position, startOfYear, hourOfWork1, hourOfWork2, hourOfWork3, hourOfWork4);
	}

	public double hourOfWorkSalary() { // will calculate the monthly salary according to hour of work
		
		//week1
		if (Integer.valueOf(getHourOfWork1()) < 30) {
			hourOfWorkSalary = 0;
			}
		else if (Integer.valueOf(getHourOfWork1()) >= 30 & Integer.valueOf(getHourOfWork1()) <= 54) {
			hourOfWorkSalary = Integer.valueOf(getHourOfWork1()) * 10 + foodMoney + transMoney;
		}
		else {
			hourOfWorkSalary = 54 * 10 + foodMoney + transMoney;
		}
		
		//week2
		if (Integer.valueOf(getHourOfWork2()) < 30) {
			hourOfWorkSalary += 0;
			}
		else if (Integer.valueOf(getHourOfWork2()) >= 30 & Integer.valueOf(getHourOfWork2()) <= 54) {
			hourOfWorkSalary += Integer.valueOf(getHourOfWork2()) * 10 + foodMoney + transMoney;
		}
		else {
			hourOfWorkSalary += 54 * 10 + foodMoney + transMoney;
		}
		
		//week3
		if (Integer.valueOf(getHourOfWork3()) < 30) {
			hourOfWorkSalary += 0;
			}
		else if (Integer.valueOf(getHourOfWork3()) >= 30 & Integer.valueOf(getHourOfWork3()) <= 54) {
			hourOfWorkSalary += Integer.valueOf(getHourOfWork3()) * 10 + foodMoney + transMoney;
		}
		else {
			hourOfWorkSalary += 54 * 10 + foodMoney + transMoney;
		}
		
		//week4
		if (Integer.valueOf(getHourOfWork4()) < 30) {
			hourOfWorkSalary += 0;
			}
		else if (Integer.valueOf(getHourOfWork4()) >= 30 & Integer.valueOf(getHourOfWork4()) <= 54) {
			hourOfWorkSalary += Integer.valueOf(getHourOfWork4()) * 10 + foodMoney + transMoney;
		}
		else {
			hourOfWorkSalary += 54 * 10 + foodMoney + transMoney;
		}
		
		return hourOfWorkSalary; //monthly
			
	}
	
	
	@Override
	public double salaryCalculation() { // method is overridden with monthly salary which is earned from hour of work in a month for securities
		
		return super.salaryCalculation() + hourOfWorkSalary(); 
	}
	
}
	
