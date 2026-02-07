package payroll;

public class Employee {
	String name;
	float hourlyRate;
	PayScheme payScheme;
	int hours;
	
	
	public Employee(String name, float hourlyRate, PayScheme payScheme) {
		super();
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.payScheme = payScheme;
		this.hours = 40;
	}
	
	public float pay() {
		return this.payScheme.pay(this.hours, this.hourlyRate);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public PayScheme getPayScheme() {
		return payScheme;
	}

	public void setPayScheme(PayScheme payScheme) {
		this.payScheme = payScheme;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return this.payScheme + " " + this.name + " is paid at " + this.hourlyRate + " an hour for " + this.hours + " hours.";
	}

}
