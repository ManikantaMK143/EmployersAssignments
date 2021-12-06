package com.technoelevate.encapsulationAssignament;

public class Employers {
	Employers(String ename,String designation,double sal){
		this.ename=ename;
		this.sal=sal;
		this.designation=designation;
	}
	 Employers(){
		count=count-1;
		System.out.println("Total employees= "+count);
	}
	public static int count=0;
    double sal;
	String ename;
	public static String company = "Technoelevate";
	public String designation;
	public int eid=100+count;
	{
	
		count++;
	}
	

}
