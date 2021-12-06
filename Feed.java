package com.technoelevate.encapsulationAssignament;

public class Feed {
	public static void main(String[] args) {
		 Extract e  = new Extract();
			Intern i = new Intern("M.Manikanta","intern",0);
			SeniorDeveloper sd = new SeniorDeveloper("Vyshu","intern",00);
			Manual m = new Manual("Vid","Manual tester",40000);
			Automation a = new Automation("Mani","Automation tester",50000);
			HumanResource 	h = new HumanResource ("Ajay","HR",100000);
			e.get(i);
			System.out.println("____________________________________");
			e.get(m);
			System.out.println("_____________________________________");
			e.get(sd);
			System.out.println("_____________________________________");
			e.get(a);
			System.out.println("_____________________________________");
			e.get(h);
			System.out.println("______________________________________");
			Employers ee = new Employers();
	}

}
