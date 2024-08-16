package com.keetha.beans;

public class Person {

	//Spring bean properties
	private int pid;
	private String pname;
	private String paddress;
	private float income;
	
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public void setIncome(float income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", income=" + income + "]";
	}
	
	
	
	
}
