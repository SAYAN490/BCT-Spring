package com.blueconch.poc2.dto;

public class User {
	private int acc_id;
	private String id;
	private String pswd;
	private int time;
	private double phone;
	private int trans_amnt;
	
	public User()
	{
		
	}
	
	public User(int acc_id, String id, String pswd, int time, double phone, int trans_amnt) {
		super();
		this.acc_id = acc_id;
		this.id = id;
		this.pswd = pswd;
		this.time = time;
		this.phone = phone;
		this.trans_amnt = trans_amnt;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

	public int getTrans_amnt() {
		return trans_amnt;
	}

	public void setTrans_amnt(int trans_amnt) {
		this.trans_amnt = trans_amnt;
	}
	
	
	
	

}
