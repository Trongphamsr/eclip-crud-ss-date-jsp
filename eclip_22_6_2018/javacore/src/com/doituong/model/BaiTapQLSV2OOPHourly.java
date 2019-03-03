package com.doituong.model;

public class BaiTapQLSV2OOPHourly extends BaiTapQLSV2OOPEmployee{
	private int hoursWorked;
	
	public void addHours(int hoursWorked) {
		this.hoursWorked=hoursWorked;
	}
	public double pay() {
		return this.hoursWorked*50;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
