
public class Academician extends Personnel {
	
	private double baseSalary = 2600;

	public Academician(String name, String registerNumber, String position, String startOfYear, String hourOfWork1,
			String hourOfWork2, String hourOfWork3, String hourOfWork4) {
		super(name, registerNumber, position, startOfYear, hourOfWork1, hourOfWork2, hourOfWork3, hourOfWork4);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}


	@Override
	public double salaryCalculation() { // method is overridden with addition base salary for academicians 
		return super.salaryCalculation() + baseSalary;
	}
	
	

}
