package com.doituong.model;

public class BaiTapQLSV2OOPEmployee extends BaiTapQLNV2OOP{

	protected String socialSecurityNumber;
	protected double payRate;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" - "+socialSecurityNumber+ " - " +payRate;
	}
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return 500;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

}
