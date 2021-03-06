package com.project;

import java.io.Serializable;

public class Contact implements Serializable,Comparable<Contact>{

	private int id;
	private String name, phone;
	public Contact(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+"\t"+this.name+"\t"+this.phone;
	}
	@Override
	public int compareTo(Contact o) {
		return this.phone.compareToIgnoreCase(o.phone);
	}
	
}
