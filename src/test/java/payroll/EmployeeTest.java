package payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	PayScheme contractor;
	PayScheme hourly;
	PayScheme salary;
	
	Employee C;
	Employee H;
	Employee S;
	@BeforeEach
	void setUp() throws Exception {
		contractor = new ContractorScheme();
		hourly = new HourlyScheme();
		salary = new SalaryScheme();
		C = new Employee("Natalie", 18.75f, contractor);
		H = new Employee("Ben", 15.50f, hourly);
		S = new Employee("Avery", 11.66f, salary);
	}

	@Test
	void ContractorEmployeeTest() {
		assertEquals(C.toString(), "Contractor Natalie is paid at 18.75 an hour for 40 hours.");
		assertEquals(C.pay(), 750f);
		C.setHours(30);
		assertEquals(C.pay(), 562.5f);
		C.setHours(50);
		assertEquals(C.pay(), 937.5f);
	}
	
	@Test
	void HourlyEmployeeTest() {
		assertEquals(H.toString(), "Hourly employee Ben is paid at 15.5 an hour for 40 hours.");
		assertEquals(H.pay(), 620f);
		H.setHours(30);
		assertEquals(H.pay(), 465f);
		H.setHours(50);
		assertEquals(H.pay(), 852.5f);
	}
	
	@Test
	void SalaryEmployeeTest() {
		assertEquals(S.toString(), "Salaried employee Avery is paid at 11.66 an hour for 40 hours.");
		assertEquals(S.pay(), 466.4f);
		S.setHours(30);
		assertEquals(S.pay(), 466.4f);
		S.setHours(50);
		assertEquals(S.pay(), 466.4f);
	}

}
