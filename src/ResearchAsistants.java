
public class ResearchAsistants extends Academician {
	
	private double ssBenefits;

	public ResearchAsistants(String name, String registerNumber, String position, String startOfYear,
			String hourOfWork1, String hourOfWork2, String hourOfWork3, String hourOfWork4) {
		super(name, registerNumber, position, startOfYear, hourOfWork1, hourOfWork2, hourOfWork3, hourOfWork4);
	}

	@Override
	public double salaryCalculation() { // method is overridden with special service benefits for research assistants
		
		ssBenefits = getBaseSalary() * 1.05;
		
		return super.salaryCalculation() + ssBenefits;
	}
	
	
	

}
