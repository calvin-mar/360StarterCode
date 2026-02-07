package payroll;

public class SalaryScheme implements PayScheme {

	public SalaryScheme() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float pay(int hours, float rate) {
		// TODO Auto-generated method stub
		return 40 * rate;
	}

	@Override
	public String toString() {
		return "Salaried employee";
	}
	
	
	
}
