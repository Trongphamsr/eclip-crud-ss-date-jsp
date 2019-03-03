package com.doituong.test;

import java.util.ArrayList;

import com.doituong.model.BaiTapOOP3Main;
import com.doituong.model.BaiTapOOP3Womon;

import st.BaiTap3OOPPerson;

public class TestBaiTapOOP3 {

	public static void main(String[] args) {
		ArrayList<BaiTap3OOPPerson> dsPerson = new ArrayList<>();
		BaiTap3OOPPerson an = new BaiTapOOP3Main();
		an.setFistName("a");
		BaiTap3OOPPerson hong = new BaiTapOOP3Womon();
		hong.setFistName("h");
		((BaiTapOOP3Womon)hong).setWearingMakeUp(true);
		dsPerson.add(an);
		dsPerson.add(hong);
		for(BaiTap3OOPPerson p :dsPerson) {
			if(p instanceof BaiTapOOP3Main) {
				System.out.println(p.getFistName()+ " la nam");
			}else if(p instanceof BaiTapOOP3Womon) {
				System.out.println(p.getFistName()+ " la nu");
			}
		}
	}
}
