//com.keetha.beans.WishMessageGenerator
package com.keetha.beans;

import java.util.Date;

public class WishMessageGenerator {

	
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String wishMessageGenerator(String user) {
		int hours = date.getHours();
		
		if(hours<12) {
			return "GM::"+user;
		}
		else {
			return "GN::"+user;
		}
	}
	
	
}
