package com.bai24;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ThuVienNgayThang {

	public static void main(String[] args) {
		int s = 1253643347;
		System.out.println(s);
		
		DecimalFormat sd = new DecimalFormat("#,###");
		DecimalFormatSymbols sdd = new DecimalFormatSymbols(Locale.getDefault());
		sdd.setGroupingSeparator('.');
		sd.setDecimalFormatSymbols(sdd);
		System.out.println(sd.format(s));
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		
		Date t = cal.getTime();
		SimpleDateFormat sgf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sgf.format(t));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf2.format(t));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf3.format(t));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
		System.out.println(sdf4.format(t));
		
		
		int yearNow = cal.get(Calendar.YEAR);
		System.out.println(" vui long nhap ngay thang nam(dd.MM/yyyy)");
		String ns = new Scanner(System.in).nextLine();
		SimpleDateFormat sdf7 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date birthday = sdf7.parse(ns);
			cal.setTime(birthday);
			int yearNs = cal.get(Calendar.YEAR);
			int tuoi = yearNow-yearNs;
			System.out.println(tuoi);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
