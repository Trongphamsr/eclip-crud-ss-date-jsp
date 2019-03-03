package com.doituong.model;

public class BaiTapQLSV2OPPExcutive extends BaiTapQLSV2OOPEmployee{
	private double bonus;
	public void awardBonus(double bonus) {
		this.bonus=bonus;
		System.out.println("lanh bonus= "+bonus);
	}
	public double pay() {
		return super.pay()+this.bonus;
	}
}
