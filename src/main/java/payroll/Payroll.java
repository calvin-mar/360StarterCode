package payroll;
import java.util.*;

public class Payroll {
	ArrayList<Employee> employees;

	public Payroll() {
		super();
		this.employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee newEmployee) {
		this.employees.add(newEmployee);
	}
	
	public void createEmployee(String name, float hourlyRate, PayScheme payScheme) {
		this.employees.add(new Employee(name, hourlyRate, payScheme));
	}
	
	public void setHours(Employee emp, int newHours) {
		emp.setHours(newHours);
	}
	
	public float[] payEmployees() {
		float[] payments = new float[employees.size()];
		for(int i=0; i<employees.size(); i++) {
			payments[i] = employees.get(i).pay();
		}
		return payments;
	}

	@Override
	public String toString() {
		String returnString;
		returnString = "Payroll:";
		for(int i=0; i<employees.size(); i++) {
			returnString += "\n" + employees.get(i).toString();
		}
		return returnString;
	}
	
	
}
