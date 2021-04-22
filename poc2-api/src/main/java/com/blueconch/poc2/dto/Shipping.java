package com.blueconch.poc2.dto;

public class Shipping {
	private int ship_id;
	private String ship_method;
	private float charge;
	private int acc_id;
	public Shipping()
	{
		
	}
	
	public Shipping(int ship_id, String ship_method, float charge, int acc_id) {
		super();
		this.ship_id = ship_id;
		this.ship_method = ship_method;
		this.charge = charge;
		this.acc_id = acc_id;
	}

	public int getShip_id() {
		return ship_id;
	}

	public void setShip_id(int ship_id) {
		this.ship_id = ship_id;
	}

	public String getShip_method() {
		return ship_method;
	}

	public void setShip_method(String ship_method) {
		this.ship_method = ship_method;
	}

	public float getCharge() {
		return charge;
	}

	public void setCharge(float charge) {
		this.charge = charge;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	
	
	

}
