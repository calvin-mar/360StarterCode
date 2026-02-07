package payroll;

public class HourlyScheme implements PayScheme {

	public HourlyScheme() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float pay(int hours, float rate) {
		// TODO Auto-generated method stub
		if(hours <= 40) {
			return hours * rate;
		}
		else {
			return 40 * rate + (hours - 40) * rate * 1.5f;
		}
	}

	@Override
	public String toString() {
		return "Hourly employee";
	}
	
	

}
