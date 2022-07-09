package com.java.movie;

public class Customer {
	private String name;
	private int age;
	private long mobileNum;
	private int ReqSeats;
	
	
	public Customer(String name, int age, long mobileNum ,int ReqSeats) {
		this.name = name;
		this.age = age;
		this.mobileNum = mobileNum;
		this.ReqSeats=ReqSeats;
	}


	public int getReqSeats() {
		return ReqSeats;
	}


	public void setReqSeats(int reqSeats) {
		this.ReqSeats = reqSeats;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getMobileNum() {
		return mobileNum;
	}


	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}


	public Customer(){
		
	}
	public String toString(){
		return name+"\t"+age+"\t"+mobileNum+"\t"+ReqSeats;
	}

}

