package com.doituong.model;

import java.util.ArrayList;

public class BaiTapQLSV2OOPStaff extends BaiTapQLNV2OOP{

	private ArrayList<BaiTapQLNV2OOP> staffList;
	
	public BaiTapQLSV2OOPStaff(){
		super();
		staffList=new ArrayList<BaiTapQLNV2OOP>();
	}
	public ArrayList<BaiTapQLNV2OOP> getStaffList() {
		return staffList;
	}
	public void setStaffList(ArrayList<BaiTapQLNV2OOP> staffList) {
		this.staffList = staffList;
	}
	public void addStaffMember(BaiTapQLNV2OOP sm) {
		staffList.add(sm);
	}
	@Override
	public double pay() {
		for(BaiTapQLNV2OOP sm:staffList) {
			System.out.println(sm);
		}
		return 0;
	}

}
