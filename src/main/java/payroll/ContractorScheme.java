package payroll;

public class ContractorScheme implements PayScheme {

	public ContractorScheme() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float pay(int hours, float rate) {
		// TODO Auto-generated method stub
		return hours * rate;
	}

	@Override
	public String toString() {
		return "Contractor";
	}
	

}
