package com.technoelevate.encapsulationAssignament;

public class HumanResource extends Employers {
	HumanResource(String ename, String designation, double sal) {
		super(ename, designation, sal);
		
	}
	public void hire() {
		System.out.println("Hr does hiring ");
	}
	public void givesalary() {
		System.out.println("Hr gives salary");
	}

}
