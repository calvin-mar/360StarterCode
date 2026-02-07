package payroll;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollTest {
	Payroll shellPayroll;
	PayScheme contractor;
	PayScheme hourly;
	PayScheme salary;
	
	Employee C;
	Employee H;
	Employee S;
	
	@BeforeEach
	void setUp() throws Exception {
		shellPayroll = new Payroll();
		contractor = new ContractorScheme();
		hourly = new HourlyScheme();
		salary = new SalaryScheme();
		C = new Employee("Natalie", 18.75f, contractor);
		H = new Employee("Ben", 15.50f, hourly);
		S = new Employee("Avery", 11.66f, salary);
		shellPayroll.addEmployee(C);
		shellPayroll.addEmployee(H);
		shellPayroll.addEmployee(S);
	}

	@Test
	void payrollListTest() {
		List<Employee> testList = Arrays.asList(C,H,S);
		assertEquals(testList, shellPayroll.employees);
		assertEquals(shellPayroll.toString(), 
				"Payroll:\nContractor Natalie is paid at 18.75 an hour for 40 hours.\n"
				+ "Hourly employee Ben is paid at 15.5 an hour for 40 hours.\n"
				+ "Salaried employee Avery is paid at 11.66 an hour for 40 hours.");
	}
	
	@Test
	void createEmployeeTest() {
		shellPayroll.createEmployee("Zoe", 14.88f, contractor);
		assertEquals(shellPayroll.toString(), 
				"Payroll:\nContractor Natalie is paid at 18.75 an hour for 40 hours.\n"
				+ "Hourly employee Ben is paid at 15.5 an hour for 40 hours.\n"
				+ "Salaried employee Avery is paid at 11.66 an hour for 40 hours.\n"
				+ "Contractor Zoe is paid at 14.88 an hour for 40 hours.");
	}

	@Test
	void changeHoursTest() {
		shellPayroll.setHours(C, 30);
		assertEquals(shellPayroll.toString(), 
				"Payroll:\nContractor Natalie is paid at 18.75 an hour for 30 hours.\n"
				+ "Hourly employee Ben is paid at 15.5 an hour for 40 hours.\n"
				+ "Salaried employee Avery is paid at 11.66 an hour for 40 hours.");
		
	}
	
	@Test
	void payAllTest() {
		float[] payments = {750.0f, 620.0f, 466.4f};
		assertArrayEquals(payments, shellPayroll.payEmployees());
	}
	
}
