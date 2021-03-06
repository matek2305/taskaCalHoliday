package com.aviva.recruitingtasks.kmol.task1.sampledata;

import com.aviva.recruitingtasks.kmol.task1.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class SampleAvivaEmployees {

	public static final Employee JOHN = new Employee("JOHN");
	public static final Employee ANNA = new Employee("ANNA");
	public static final Employee ROB = new Employee("ROB");

	public static final List<Employee> AVIVA_EMPLOYEES = new ArrayList<Employee>() {
		{
			add(JOHN);
			add(ANNA);
			add(ROB);
		}
	};

}
