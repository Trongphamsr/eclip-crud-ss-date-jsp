package com.doituong.model;

public enum XepLoai {

//	Gioi,
//	Kha,
//	TrungBinh,
//	Yeu

	Gioi("Giỏi"),
	Kha("khá"),
	TrungBinh("Trung Bình"),
	Yeu("Yếu");
	
	// trong enum contructor de private
	private String msg;
	
	XepLoai(String msg){
		this.msg=msg;
	}
	public String description() {
		return this.msg;
	}
}
