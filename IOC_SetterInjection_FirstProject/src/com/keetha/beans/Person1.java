package com.keetha.beans;

public class Person1 {

	//Spring bean properties
	private int pid;
	private String pname;
	private String paddress;
	private float income;
	
	
	
	public Person1(int pid, String pname, String paddress, float income) {
		System.out.println("4 param constructor");
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.income = income;
	}



	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", income=" + income + "]";
	}
	
	
	
	
}
