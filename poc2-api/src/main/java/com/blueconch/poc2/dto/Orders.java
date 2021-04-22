package com.blueconch.poc2.dto;

public class Orders {
	private int order_id;
	private int product_id;
	private int order_qty;
	private int order_amt;
	private int ship_id;
	
	public Orders()
	{
		
	}
	
	
	public Orders(int order_id, int product_id, int order_qty, int order_amt, int ship_id) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.order_qty = order_qty;
		this.order_amt = order_amt;
		this.ship_id = ship_id;
	}


	public int getOrder_id() {
		return order_id;
	}


	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public int getOrder_qty() {
		return order_qty;
	}


	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}


	public int getOrder_amt() {
		return order_amt;
	}


	public void setOrder_amt(int order_amt) {
		this.order_amt = order_amt;
	}


	public int getShip_id() {
		return ship_id;
	}


	public void setShip_id(int ship_id) {
		this.ship_id = ship_id;
	}
	
	
	
	
	

}
