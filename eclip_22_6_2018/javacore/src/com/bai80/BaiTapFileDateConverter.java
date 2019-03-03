package com.bai80;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaiTapFileDateConverter {

	static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	public static Date fromString (String d) {
		
		try {
			Date date = sdf.parse(d);
			return date;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String fromDate(Date d) {
		return sdf.format(d);
	}
}
